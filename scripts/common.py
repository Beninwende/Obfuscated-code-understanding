#!/usr/bin/env python3
"""Shared helpers for generation and evaluation."""

from __future__ import annotations

import os
import re
import sys
from pathlib import Path

import yaml

CONFIG_DIR = Path(__file__).resolve().parents[1] / "config"
sys.path.insert(0, str(CONFIG_DIR))

from load_config import (  # noqa: E402
    get_api_key,
    get_base_url,
    get_model,
    get_provider,
    load_env,
)

SIMPLE_PROMPT_TEMPLATE = """
### Instruction: Analyze the code and tell me what it does. Explain clearly the goal of this code and its functions. Your response must contain a title, the main goal of the code.

Here is the {language_label} code snippet:
<code>
{source_code}
</code>

Analyzing carefully the <code>.

### Important: Provide only your short summary description within :

### Response:
<Summary_description>
"""


def dataset_config(dataset_key: str) -> dict:
    return load_run_plan()["datasets"][dataset_key]


def code_field_for_dataset(dataset_key: str) -> str:
    return dataset_config(dataset_key).get("code_field", "Java Code")


def language_label_for_dataset(dataset_key: str) -> str:
    return dataset_config(dataset_key).get("language_label", "Java")


def build_simple_prompt(dataset_key: str, source_code: str) -> str:
    return SIMPLE_PROMPT_TEMPLATE.format(
        language_label=language_label_for_dataset(dataset_key),
        source_code=source_code,
    )

JUDGE_PROMPT_TEMPLATE = """You are an expert Software Engineer. You are given two descriptions, each intended to specify code.

Your task is to assess whether these descriptions would lead to code that implements the same functionality. Focus on the functional outcome and computational task implied by each description, not on wording or phrasing.

EXERCISE STATEMENT (Ground Truth):
{reference_text}

LLM-GENERATED DESCRIPTION:
{comparison_text}

Scoring Guidelines:

Provide a similarity score as a real number in the range [0.0, 1.0], according to the following scale:
1.0 (Same Functionality): Both descriptions clearly specify code that would implement the same functionality.
0.7 – 0.9 (Mostly Similar): The descriptions specify the same functionality with only minor omissions or differences in detail.
0.4 – 0.6 (Partially Similar): The descriptions point to related tasks but differ in important aspects of the intended functionality.
0.1 – 0.3 (Loosely Related): The descriptions are weakly related in topic but would not lead to the same functionality.
0.0 (Different Functionality): The descriptions specify completely different or unrelated functionality.

Output Requirement:

Return only the similarity score as a real number between 0.0 and 1.0. Do not provide explanations or additional text."""

# Paper LLM-as-a-Judge trio. Public labels are always judge_1 / judge_2 / judge_3.
# APIs: OpenAI (judge_1), Anthropic/Claude (judge_2), OpenRouter (judge_3).
PAPER_JUDGES: list[dict] = [
    {
        "id": "judge_1",
        "paper_name": "GPT-5",
        "provider": "openai",
        "api_model": "gpt-5",
        "env_key": "OPENAI_API_KEY",
        "base_url": None,
    },
    {
        "id": "judge_2",
        "paper_name": "Claude-Sonnet-4.5",
        "provider": "anthropic",
        "api_model": "claude-sonnet-4-5-20250929",
        "env_key": "ANTHROPIC_API_KEY",
        "base_url": None,
    },
    {
        "id": "judge_3",
        "paper_name": "MiniMax-2.7",
        "provider": "openrouter",
        "api_model": "minimax/minimax-m2.5",
        "env_key": "OPENROUTER_API_KEY",
        "base_url": "https://openrouter.ai/api/v1",
    },
]

JUDGE_PASS_THRESHOLD = 0.5  # paper: vote yes iff score > τ


def load_dotenv_local() -> None:
    """Load package-root .env if present (keys are never shipped)."""
    env_path = Path(__file__).resolve().parents[1] / ".env"
    if not env_path.exists():
        return
    for line in env_path.read_text(encoding="utf-8").splitlines():
        line = line.strip()
        if not line or line.startswith("#") or "=" not in line:
            continue
        key, _, val = line.partition("=")
        key, val = key.strip(), val.strip().strip('"').strip("'")
        if key and key not in os.environ:
            os.environ[key] = val


def judge_chat_completion(judge: dict, prompt: str, max_tokens: int = 16, temperature: float = 0) -> str:
    """Call one paper judge via OpenAI, Anthropic, or OpenRouter."""
    load_dotenv_local()
    provider = judge["provider"]
    api_model = judge["api_model"]
    api_key = os.environ.get(judge["env_key"], "")
    if not api_key:
        raise RuntimeError(f"Missing {judge['env_key']} for {judge['id']} ({judge['paper_name']})")

    if provider == "anthropic":
        import anthropic

        client = anthropic.Anthropic(api_key=api_key, timeout=300)
        kwargs: dict = {
            "model": api_model,
            "max_tokens": max_tokens,
            "messages": [{"role": "user", "content": prompt}],
            "temperature": temperature,
        }
        if "claude-sonnet-4" in api_model:
            kwargs["thinking"] = {"type": "disabled"}
        response = client.messages.create(**kwargs)
        return "".join(b.text for b in response.content if hasattr(b, "text")).strip()

    from openai import OpenAI

    client_kwargs: dict = {"api_key": api_key, "timeout": 300}
    if judge.get("base_url"):
        client_kwargs["base_url"] = judge["base_url"]
    client = OpenAI(**client_kwargs)
    create_kwargs: dict = {
        "model": api_model,
        "messages": [{"role": "user", "content": prompt}],
    }
    model_l = api_model.lower()
    if "gpt-5" in model_l:
        create_kwargs["max_completion_tokens"] = max(max_tokens, 64)
        create_kwargs["reasoning_effort"] = "minimal"
    else:
        create_kwargs["max_tokens"] = max_tokens
        create_kwargs["temperature"] = temperature
    response = client.chat.completions.create(**create_kwargs)
    return (response.choices[0].message.content or "").strip()


FAILURE_INDICATORS = [
    "API call failed",
    "Error during generation",
    "API client not available",
    "Model not available",
]


def load_run_plan() -> dict:
    with (CONFIG_DIR / "run_plan.yaml").open(encoding="utf-8") as f:
        return yaml.safe_load(f)


def repo_root() -> Path:
    return CONFIG_DIR.parents[1]


def resolve_dataset_paths(dataset_key: str) -> dict:
    plan = load_run_plan()
    ds = plan["datasets"][dataset_key]
    base = (CONFIG_DIR / ds["path"]).resolve()
    return {
        "key": dataset_key,
        "base": base,
        "obfuscated_dir": base / ds["obfuscated_dir"],
        "ground_truth": base / ds["ground_truth"],
        "ground_truth_field": ds.get("ground_truth_field", "Description"),
        "output_root": (CONFIG_DIR / ds["output_root"]).resolve(),
        "eval_root": (CONFIG_DIR / ds["eval_root"]).resolve(),
    }


def variant_specs() -> list[dict]:
    return load_run_plan()["variants"]


def generation_model_keys() -> list[str]:
    return load_run_plan()["generation_models"]


def excluded_generation_model_keys() -> list[str]:
    return load_run_plan().get("excluded_generation_models", [])


def baseline_cloud_model_keys() -> list[str]:
    return load_run_plan().get("baseline_cloud_models", [])


def load_models_registry() -> dict:
    with (CONFIG_DIR / "models.yaml").open(encoding="utf-8") as f:
        return yaml.safe_load(f)


def model_output_dir(model_key: str) -> str:
    registry = load_models_registry()
    section = registry["supplementary"].get(model_key) or registry["baseline"].get(model_key)
    if not section:
        raise KeyError(model_key)
    return section["output_dir"]


def model_results_dir(model_key: str) -> str:
    """Legacy per_model_results folder name (e.g. GPT4o_Results)."""
    registry = load_models_registry()
    section = registry["supplementary"].get(model_key) or registry["baseline"].get(model_key)
    if not section:
        raise KeyError(model_key)
    return section["results_dir"]


def generation_output_root(dataset_key: str, model_key: str) -> Path:
    ds = resolve_dataset_paths(dataset_key)
    if dataset_key == "java250" and model_key in baseline_cloud_model_keys():
        registry = load_models_registry()
        baseline_root = (CONFIG_DIR / registry["paths"]["generation_outputs_baseline"]).resolve()
        return baseline_root
    return ds["output_root"]


def variant_output_candidates(variant: dict) -> list[str]:
    names = [variant["output"]]
    alt = variant.get("alt_output")
    if alt and alt not in names:
        names.append(alt)
    return names


def resolve_generation_output_path(
    dataset_key: str,
    model_key: str,
    variant: dict,
    *,
    prefer_existing: bool = True,
) -> Path:
    root = generation_output_root(dataset_key, model_key)
    out_dir = root / model_output_dir(model_key)
    candidates = [out_dir / name for name in variant_output_candidates(variant)]
    if prefer_existing:
        for path in candidates:
            if path.exists():
                return path
    return candidates[0]


def is_description_valid(desc: str | None) -> bool:
    if not desc or len(desc.strip()) < 10:
        return False
    return not any(x in desc for x in FAILURE_INDICATORS)


def extract_description(text: str) -> str:
    if not text:
        return ""
    patterns = [
        r"<Summary_description>\s*(.*?)\s*</Summary_description>",
        r"### Response:\s*(.*)",
    ]
    for pattern in patterns:
        match = re.search(pattern, text.strip(), re.DOTALL | re.IGNORECASE)
        if match:
            extracted = match.group(1).strip()
            if len(extracted) > 10:
                return extracted
    return text.strip()


def extract_score(text: str) -> float | None:
    if not text:
        return None
    matches = re.findall(r"0?\.\d+|1\.0|1|0", text.strip())
    for raw in matches:
        try:
            score = float(raw)
            if score > 1.0:
                score /= 100.0
            if 0.0 <= score <= 1.0:
                return score
        except ValueError:
            continue
    return None


def consensus_from_three(
    scores: list[float | None],
    agreement_threshold: float = 0.15,
    pass_threshold: float = JUDGE_PASS_THRESHOLD,
) -> dict:
    """Majority of three judges; a vote counts if score is strictly above τ (paper)."""
    valid = [s for s in scores if s is not None]
    labels = ["judge_1", "judge_2", "judge_3"]
    out = {labels[i]: scores[i] for i in range(min(3, len(scores)))}

    if len(valid) < 2:
        out["consensus_score"] = valid[0] if valid else None
        out["consensus_pass"] = bool(valid and valid[0] > pass_threshold)
        out["consensus_rule"] = "insufficient_judges"
        return out

    passes = [s > pass_threshold for s in valid]
    pass_votes = sum(passes)
    out["consensus_pass"] = pass_votes >= 2

    # Pairwise agreement on numeric score
    best_pair: tuple[float, float] | None = None
    best_diff = float("inf")
    for i in range(len(valid)):
        for j in range(i + 1, len(valid)):
            diff = abs(valid[i] - valid[j])
            if diff < best_diff:
                best_diff = diff
                best_pair = (valid[i], valid[j])

    if best_pair and best_diff <= agreement_threshold:
        out["consensus_score"] = sum(best_pair) / 2
        out["consensus_rule"] = "pair_agreement"
    else:
        sorted_scores = sorted(valid)
        out["consensus_score"] = sorted_scores[len(sorted_scores) // 2]
        out["consensus_rule"] = "median_fallback"

    return out


def estimate_tokens(text: str, model_id: str | None = None) -> int:
    """Best-effort token count (tiktoken when available)."""
    try:
        import tiktoken

        try:
            enc = tiktoken.encoding_for_model(model_id or "gpt-3.5-turbo")
        except Exception:  # noqa: BLE001
            enc = tiktoken.get_encoding("cl100k_base")
        return len(enc.encode(text or ""))
    except Exception:  # noqa: BLE001
        return max(1, len(text or "") // 4)


def estimate_messages_tokens(messages: list[dict], model_id: str | None = None) -> int:
    # Rough chat framing overhead per message.
    return sum(estimate_tokens(m.get("content") or "", model_id) + 6 for m in messages)


def context_window_for_model(model_key: str) -> int:
    """Usable context window (tokens) for generation models."""
    model = get_model(model_key)
    if model.get("context_window"):
        return int(model["context_window"])
    mid = (model.get("openrouter_id") or model.get("api_model") or "").lower()
    key = model_key.lower()
    if "gpt-3.5" in mid or key == "gpt35":
        return 16385
    if any(x in mid for x in ("gpt-4o", "gpt-4.1", "o4-mini", "gpt-5")) or key in {
        "gpt4o",
        "o4mini",
        "gpt5",
    }:
        return 128000
    if "claude" in mid or "claude" in key:
        return 200000
    if "gemini" in mid or "gemini" in key:
        return 1000000
    # OpenRouter / DashScope defaults — conservative.
    return 32000


def split_simple_prompt(prompt: str) -> tuple[str, str, str]:
    """Return (preamble, source_code, epilogue) for SIMPLE_PROMPT_TEMPLATE-shaped prompts."""
    start = prompt.find("<code>")
    end = prompt.find("</code>")
    if start < 0 or end < 0 or end <= start:
        return prompt, "", ""
    preamble = prompt[: start + len("<code>")]
    source_code = prompt[start + len("<code>") : end]
    epilogue = prompt[end:]
    return preamble, source_code, epilogue


def chunk_text_by_tokens(
    text: str,
    max_tokens: int,
    model_id: str | None = None,
) -> list[str]:
    """Split text into chunks that each fit under max_tokens (line-aware)."""
    text = text or ""
    if estimate_tokens(text, model_id) <= max_tokens:
        return [text]
    lines = text.splitlines(keepends=True)
    chunks: list[str] = []
    buf: list[str] = []
    buf_tok = 0
    for line in lines:
        lt = estimate_tokens(line, model_id)
        if buf and buf_tok + lt > max_tokens:
            chunks.append("".join(buf))
            buf, buf_tok = [], 0
        if lt > max_tokens:
            # Hard-split oversized line by characters.
            step = max(200, max_tokens * 3)
            for i in range(0, len(line), step):
                piece = line[i : i + step]
                if estimate_tokens(piece, model_id) > max_tokens:
                    piece = line[i : i + max(50, step // 2)]
                chunks.append(piece)
            continue
        buf.append(line)
        buf_tok += lt
    if buf:
        chunks.append("".join(buf))
    return chunks or [text]


def chat_completion_messages(
    model_key: str,
    messages: list[dict],
    max_tokens: int = 512,
    temperature: float = 0,
) -> str:
    """Chat completion with an arbitrary messages list."""
    load_env()
    model = get_model(model_key)
    provider_id = model["provider"]
    clean_messages = [{"role": m["role"], "content": m["content"]} for m in messages]

    if provider_id == "anthropic":
        import anthropic

        api_key = get_api_key(provider_id)
        if not api_key:
            raise RuntimeError("Missing ANTHROPIC_API_KEY")
        client = anthropic.Anthropic(api_key=api_key, timeout=300)
        # Anthropic: system is separate; fold leading system into first user if needed.
        system = None
        api_messages = []
        for m in clean_messages:
            if m["role"] == "system" and system is None:
                system = m["content"]
                continue
            role = m["role"] if m["role"] in ("user", "assistant") else "user"
            api_messages.append({"role": role, "content": m["content"]})
        kwargs: dict = {
            "model": model["api_model"],
            "max_tokens": max_tokens,
            "messages": api_messages,
        }
        if system:
            kwargs["system"] = system
        if model["api_model"] == "claude-sonnet-5":
            kwargs["thinking"] = {"type": "disabled"}
        else:
            kwargs["temperature"] = temperature
        response = client.messages.create(**kwargs)
        return "".join(b.text for b in response.content if hasattr(b, "text"))

    if provider_id == "google_gemini":
        from google import genai
        from google.genai import types

        api_key = get_api_key(provider_id)
        if not api_key:
            raise RuntimeError("Missing GEMINI_API_KEY")
        client = genai.Client(
            api_key=api_key,
            http_options=types.HttpOptions(timeout=60_000),
        )
        # Flatten to a single prompt for Gemini path (chunking mainly targets OpenAI 16k).
        flat = "\n\n".join(f"{m['role'].upper()}:\n{m['content']}" for m in clean_messages)
        response = client.models.generate_content(
            model=model["api_model"],
            contents=flat,
            config=types.GenerateContentConfig(
                temperature=temperature,
                max_output_tokens=max_tokens,
            ),
        )
        text = (response.text or "").strip()
        if not text and getattr(response, "candidates", None):
            parts = []
            for cand in response.candidates:
                content = getattr(cand, "content", None)
                for part in getattr(content, "parts", None) or []:
                    t = getattr(part, "text", None)
                    if t:
                        parts.append(t)
            text = "\n".join(parts).strip()
        return text

    from openai import OpenAI

    api_key = get_api_key(provider_id)
    if not api_key:
        raise RuntimeError(f"Missing API key for {provider_id}")

    kwargs_client: dict = {"api_key": api_key}
    base_url = get_base_url(provider_id)
    if base_url:
        kwargs_client["base_url"] = base_url

    client = OpenAI(**kwargs_client, timeout=300)
    if provider_id == "openrouter":
        model_id = model.get("openrouter_id") or model["api_model"]
    else:
        model_id = model["api_model"]
    provider = get_provider(provider_id)
    headers = provider.get("default_headers") or {}

    create_kwargs: dict = {
        "model": model_id,
        "messages": clean_messages,
    }
    model_id_lower = model_id.lower()
    # Force non-thinking when config says so (GLM; optional per-model thinking: disabled).
    # deepseek_r1 / deepseek-v4-pro may reason; answer content still comes from message.content.
    disable_thinking = (
        model.get("thinking") == "disabled"
        or model_key == "glm5"
        or "glm-5" in model_id_lower
    )
    # o4-mini: no thinking toggle; use low reasoning_effort as non-thinking proxy.
    # (API rejects reasoning_effort="minimal" for o4-mini; GPT-5 still accepts "minimal".)
    force_low_reasoning = model_key == "o4mini" or "o4-mini" in model_id_lower
    reasoning_models = (
        "o4-mini",
        "o3",
        "gpt-5",
        "deepseek-r1",
        "deepseek-reasoner",
        "deepseek-v4-pro",
        "glm-5",
        "kimi-k2",
    )
    is_reasoning = (not disable_thinking) and any(x in model_id_lower for x in reasoning_models)
    if is_reasoning or force_low_reasoning:
        create_kwargs["max_completion_tokens"] = max(max_tokens, 8192)
        if force_low_reasoning:
            create_kwargs["reasoning_effort"] = "low"
        elif "gpt-5" in model_id_lower:
            create_kwargs["reasoning_effort"] = "minimal"
        if force_low_reasoning and not is_reasoning:
            # Still a reasoning endpoint; do not send temperature.
            pass
        elif not is_reasoning:
            create_kwargs["temperature"] = temperature
    else:
        create_kwargs["temperature"] = temperature
        create_kwargs["max_tokens"] = max_tokens
    if headers:
        create_kwargs["extra_headers"] = headers
    if disable_thinking:
        # Provider-specific non-thinking toggles.
        # GLM via OpenRouter: reasoning.effort=none
        #   (thinking.type alone still emits reasoning and can exhaust max_tokens).
        # DeepSeek native: thinking.type=disabled
        if model_key == "glm5" or "glm-5" in model_id_lower:
            create_kwargs["extra_body"] = {"reasoning": {"effort": "none"}}
        else:
            create_kwargs["extra_body"] = {"thinking": {"type": "disabled"}}
        # Prefer chat-style token limit when thinking is off.
        create_kwargs.pop("max_completion_tokens", None)
        create_kwargs["temperature"] = temperature
        create_kwargs["max_tokens"] = max_tokens

    response = client.chat.completions.create(**create_kwargs)
    return (response.choices[0].message.content or "").strip()


def chat_completion(model_key: str, prompt: str, max_tokens: int = 512, temperature: float = 0) -> str:
    return chat_completion_messages(
        model_key,
        [{"role": "user", "content": prompt}],
        max_tokens=max_tokens,
        temperature=temperature,
    )


def chat_completion_chunked_full_context(
    model_key: str,
    prompt: str,
    max_tokens: int = 512,
    temperature: float = 0,
) -> str:
    """
    Deliver a too-long prompt in chunks, keeping as much of the full program as possible
    in the conversation, then ask for the description only at the end.

    If the context window cannot hold all raw chunks, earlier parts are compacted into a
    technical digest (still covering those parts) so the final generation always sees a
    representation of the entire program.
    """
    model = get_model(model_key)
    model_id = model.get("openrouter_id") or model.get("api_model") or ""
    window = context_window_for_model(model_key)
    # Reserve room for the final answer + framing.
    reserve_out = max(max_tokens + 256, 768)
    safety = 256
    usable = max(2048, window - reserve_out - safety)

    prompt_tok = estimate_tokens(prompt, model_id)
    if prompt_tok + reserve_out + safety <= window:
        return chat_completion(model_key, prompt, max_tokens=max_tokens, temperature=temperature)

    preamble, source_code, epilogue = split_simple_prompt(prompt)
    if not source_code.strip():
        # Fallback: chunk the whole prompt text.
        source_code = prompt
        preamble, epilogue = "", ""

    # Leave headroom inside each ingest turn for prior history + ACK.
    chunk_budget = max(1500, usable // 2)
    chunks = chunk_text_by_tokens(source_code, chunk_budget, model_id)
    n = len(chunks)

    lang_hint = "code"
    if "JavaScript" in preamble:
        lang_hint = "JavaScript"
    elif "Java" in preamble:
        lang_hint = "Java"

    intro = (
        f"You will receive a complete {lang_hint} program split into {n} consecutive parts. "
        "Accumulate and retain ALL parts. Do NOT write the final Summary_description yet. "
        "After each part, reply with exactly: ACK"
    )
    messages: list[dict] = [{"role": "user", "content": intro}, {"role": "assistant", "content": "ACK"}]

    def _fits(extra: dict) -> bool:
        return estimate_messages_tokens(messages + [extra], model_id) <= usable

    def _compress_history(parts_through: int) -> None:
        nonlocal messages
        compress_ask = {
            "role": "user",
            "content": (
                "Produce a compact but COMPLETE technical digest of ALL code parts received "
                f"so far (parts 1..{parts_through} of {n}). Preserve control flow, I/O behaviour, "
                "functions/classes, key variables, algorithms and edge cases. "
                "Do NOT write the final Summary_description. Digest only."
            ),
        }
        # If even the compress ask does not fit, drop oldest assistant ACKs / trim.
        while not _fits(compress_ask) and len(messages) > 2:
            # Keep intro pair; drop earliest code exchange (user+assistant).
            if len(messages) >= 4:
                messages = messages[:2] + messages[4:]
            else:
                break
        digest = chat_completion_messages(
            model_key,
            messages + [compress_ask],
            max_tokens=min(1200, max_tokens * 2 if max_tokens < 1200 else max_tokens),
            temperature=0,
        )
        messages = [
            {
                "role": "user",
                "content": (
                    f"{intro}\n\nCOMPACT DIGEST of parts 1..{parts_through}/{n} "
                    f"(covers those parts fully):\n{digest}"
                ),
            },
            {"role": "assistant", "content": "ACK"},
        ]

    for i, chunk in enumerate(chunks, start=1):
        part_msg = {
            "role": "user",
            "content": f"CODE PART {i}/{n}:\n<code>\n{chunk}\n</code>",
        }
        if not _fits(part_msg):
            if i > 1:
                _compress_history(i - 1)
            if not _fits(part_msg):
                # Still too big: shrink this chunk further.
                sub = chunk_text_by_tokens(chunk, max(800, chunk_budget // 2), model_id)
                for j, piece in enumerate(sub, start=1):
                    piece_msg = {
                        "role": "user",
                        "content": f"CODE PART {i}/{n} (sub {j}/{len(sub)}):\n<code>\n{piece}\n</code>",
                    }
                    if not _fits(piece_msg) and i > 1:
                        _compress_history(i - 1)
                    if not _fits(piece_msg):
                        # Last resort: truncate piece to budget.
                        while estimate_tokens(piece_msg["content"], model_id) > chunk_budget and len(piece) > 200:
                            piece = piece[: int(len(piece) * 0.8)]
                            piece_msg["content"] = (
                                f"CODE PART {i}/{n} (sub {j}/{len(sub)}, truncated):\n<code>\n{piece}\n</code>"
                            )
                    messages.append(piece_msg)
                    ack = chat_completion_messages(
                        model_key, messages, max_tokens=8, temperature=0
                    )
                    messages.append({"role": "assistant", "content": (ack or "ACK")[:40] or "ACK"})
                continue

        messages.append(part_msg)
        ack = chat_completion_messages(model_key, messages, max_tokens=8, temperature=0)
        messages.append({"role": "assistant", "content": (ack or "ACK")[:40] or "ACK"})

    final_ask = {
        "role": "user",
        "content": (
            f"You now have the COMPLETE {lang_hint} program in context "
            f"(all {n} parts — raw code and/or digests covering every part).\n\n"
            "### Instruction: Analyze the full code and tell me what it does. "
            "Explain clearly the goal of this code and its functions. "
            "Your response must contain a title, the main goal of the code.\n\n"
            "Analyzing carefully the complete <code>.\n\n"
            "### Important: Provide only your short summary description within :\n\n"
            "### Response:\n"
            "<Summary_description>"
        ),
    }
    if not _fits(final_ask):
        _compress_history(n)
    return chat_completion_messages(
        model_key,
        messages + [final_ask],
        max_tokens=max_tokens,
        temperature=temperature,
    )
