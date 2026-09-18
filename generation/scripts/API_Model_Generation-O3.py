import json
import re
import os
import time
from concurrent.futures import ThreadPoolExecutor, as_completed
from openai import OpenAI
import logging
from typing import Dict, List, Optional

# Set up logging
logging.basicConfig(level=logging.INFO, format='%(asctime)s - %(levelname)s - %(message)s')
logger = logging.getLogger(__name__)

# Initialize OpenAI client
def initialize_openai_client():
    """Initialize the OpenAI client with proper error handling."""
    logger.info("Initializing OpenAI client...")
    
    try:
        client = OpenAI()
        logger.info("✓ OpenAI client initialized successfully!")
        
        # Test the API with a simple request
        test_response = client.chat.completions.create(
            model="o4-mini-2025-04-16",
            messages=[{"role": "user", "content": "Hello"}],
            max_completion_tokens=10
        )
        logger.info(f"✓ API test successful: {test_response.choices[0].message.content[:50]}...")
        return client
        
    except Exception as e:
        logger.error(f"Error initializing OpenAI client: {e}")
        logger.error("Please ensure your OpenAI API key is set in the environment variable OPENAI_API_KEY")
        return None

# Initialize the client
client = initialize_openai_client()


def call_gpt4o_api(input_text, max_retries=3, initial_delay=2):
    """
    Calls o4-mini reasoning model API with retry logic for failed requests.
    For reasoning models, we need to reserve at least 25,000 tokens for reasoning + output.
    """
    if client is None:
        logger.error("Client not initialized")
        return None
    
    delay = initial_delay
    # Reasoning models need much higher token limits (at least 25,000 for reasoning + output)
    max_tokens = 32768  # Start with 32k to accommodate reasoning tokens + output
    
    for attempt in range(max_retries):
        try:
            response = client.chat.completions.create(
                model="o4-mini-2025-04-16",
                messages=[{"role": "user", "content": input_text}],
                max_completion_tokens=max_tokens
            )
            return response.choices[0].message.content.strip()
        except Exception as e:
            error_msg = str(e)
            logger.warning(f"API call attempt {attempt + 1} failed: {error_msg}")
            
            # Check for specific error types
            if "max_tokens" in error_msg.lower() or "output limit" in error_msg.lower():
                logger.warning("Max tokens/output limit reached, increasing limit for retry...")
                # For reasoning models, we may need even more tokens
                max_tokens = min(max_tokens * 2, 131072)  # Double tokens, cap at 128k (model's max context)
                delay = max(delay, 2)
            elif "rate_limit" in error_msg.lower() or "quota" in error_msg.lower():
                logger.warning("Rate limit detected, using longer delay...")
                delay = max(delay, 60)  # Minimum 60 seconds for rate limits
            elif "timeout" in error_msg.lower():
                logger.warning("Timeout detected, retrying...")
                delay = max(delay, 10)
            elif "model" in error_msg.lower() and "not found" in error_msg.lower():
                logger.error("Model not found error - check model name")
                return None
            
            if attempt < max_retries - 1:
                logger.info(f"Retrying in {delay} seconds... (max_completion_tokens: {max_tokens})")
                time.sleep(delay)
                delay *= 2  # Exponential backoff
            else:
                logger.error("All retry attempts failed")
                return None

def is_description_valid(description):
    """
    Checks if a description is valid (not a failure indicator).
    """
    if not description:
        return False
    
    # Check if description is too short (likely invalid)
    if len(description.strip()) < 10:
        return False
    
    failure_indicators = [
        "Summary not found.",
        "API call failed.",
        "Error during generation.",
        "No generated text found.",
        "Model not available",
        "API client not available"
    ]
    
    # Check if description exactly matches a failure indicator
    description_lower = description.strip().lower()
    for indicator in failure_indicators:
        if description_lower == indicator.lower():
            return False
    
    return True

def generate_description(java_code):
    """
    Generates three natural language descriptions for Java code using GPT-4o API.
    Returns a dictionary with three descriptions from different prompts.
    """
    # Check if client is available
    if client is None:
        return {
            "description_simple": "API client not available - OpenAI client failed to initialize",
            "description_reason": "API client not available - OpenAI client failed to initialize", 
            "description_fewshot": "API client not available - OpenAI client failed to initialize"
        }
    # First prompt (simple prompt from qwen_chunk.py)
    prompt_simple = f"""
    ### Instruction: Analyze the code and tell me what it does. Explain clearly the goal of this code and its functions. Your response must contain a title, the main goal of the code.

    Here is the Java code snippet:
    <code>
    ```{java_code}```
    </code>

    Analyzing carefully the <code>.

    ### Important: Provide only your short summary description within :
    
    ### Response:\n 
    <Summary_description>
    """

    # Second prompt (detailed reasoning prompt)
    prompt_reason = f"""
     ### Instruction: Analyze the following Java code step by step to understand its purpose and functionality.

    First, you will be presented with a code snippet:
    <code>
    ```{java_code}```
    </code>

    Next, you will be given instructions to follow:
    1. **Examine Structure:** Identify key components (classes, methods, fields) and their relationships.
    2. **Trace Execution Flow:** Determine how methods interact and the overall program flow.
    3. **Analyze Key Operations:** Note critical algorithms, data manipulations, or external interactions.
    4. **Infer Intent:** Deduce the problem this code solves based on your analysis.
    
    **Reasoning:**
    [Your step-by-step analysis here]

    Present only your short summary description within:
    
    ### Response:\n
    <Summary_description>
    """

    # Third prompt (few-shot prompt)
    example_code = """import java.util.Scanner;
public class Main_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuffer sb = new StringBuffer(str);
        String rv = sb.reverse().toString();
        System.out.println(rv);
    }
}"""
    
    example_problem = """Exercise: Reverse a String
Problem Statement: This program that takes a string as input and reverses its characters. The program should then output the reversed string.

Requirements
The input string will have a maximum length of 20 characters.
The program must read the string and output its reversed version on a single line.
Ensure the program handles uppercase, lowercase, digits, and special characters correctly."""

    prompt_fewshot = f"""
    ###Instruction: Your task is to generate a short summary description for a given piece of code. Your description should focus on how the code addresses the problem it was designed to solve. Here is how to proceed:

    First, you will be presented with a code snippet:
    <code>
    ```{java_code}```
    </code>

    Next, you will be given an example of code following to his associate problem statement:
    <Example_code>
    ```{example_code}```
    </Example_code>

    And <Example_problem>
    {example_problem}
    </Example_problem>

    Analyze carefully the <code>, paying attention of it structure, functions and logic. Consider How each part of the code contributes to solving the given problem.

    Present only your summary description within :
    
    ### Response:\n
    
    """

    descriptions = {}
    
    # Generate description using simple prompt (first)
    try:
        logger.info(f"Calling O4-mini API with simple prompt...")
        result1 = call_gpt4o_api(prompt_simple)
        
        if result1:
            # Extract only the response part - try multiple patterns
            description1 = result1
            # Try to extract after "### Response:\n"
            if "### Response:\n" in result1:
                description1 = result1.split("### Response:\n", 1)[-1]
            # Try to extract after "### Response:"
            elif "### Response:" in result1:
                description1 = result1.split("### Response:", 1)[-1]
            # Try to extract content within <Summary_description> tags
            match = re.search(r"<Summary_description>\s*(.*?)\s*</Summary_description>", description1, re.S)
            if match:
                description1 = match.group(1).strip()
            # Clean up any remaining XML-like tags
            description1 = re.sub(r"<[^>]+>", "", description1).strip()
            descriptions["description_simple"] = description1.strip()
            logger.debug(f"Extracted simple description (length: {len(description1)}): {description1[:100]}...")
        else:
            descriptions["description_simple"] = "API call failed."
    except Exception as e:
        logger.error(f"Error during simple description generation: {e}")
        descriptions["description_simple"] = "Error during generation."

    # Generate description using reasoning prompt (second)
    try:
        logger.info(f"Calling O4-mini API with reasoning prompt...")
        result2 = call_gpt4o_api(prompt_reason)
        
        if result2:
            description2 = result2
            # Try multiple extraction patterns
            match = re.search(r"<Summary_description>\s*(.*?)\s*</Summary_description>", result2, re.S)
            if match:
                description2 = match.group(1).strip()
            else:
                # Try to extract after "### Response:\n" or "### Response:"
                if "### Response:\n" in result2:
                    description2 = result2.split("### Response:\n", 1)[-1]
                elif "### Response:" in result2:
                    description2 = result2.split("### Response:", 1)[-1]
                else:
                    # If no markers found, use the whole response but clean it
                    description2 = result2
            # Clean up any remaining XML-like tags and markers
            description2 = re.sub(r"<[^>]+>", "", description2).strip()
            description2 = re.sub(r"### Response:\s*", "", description2).strip()
            descriptions["description_reason"] = description2.strip()
            logger.debug(f"Extracted reason description (length: {len(description2)}): {description2[:100]}...")
        else:
            descriptions["description_reason"] = "API call failed."
    except Exception as e:
        logger.error(f"Error during reasoning description generation: {e}")
        descriptions["description_reason"] = "Error during generation."

    # Generate description using few-shot prompt (third)
    try:
        logger.info(f"Calling O4-mini API with few-shot prompt...")
        result3 = call_gpt4o_api(prompt_fewshot)
        
        if result3:
            description3 = result3
            # Try multiple extraction patterns
            match = re.search(r"<Summary_description>\s*(.*?)\s*</Summary_description>", result3, re.S)
            if match:
                description3 = match.group(1).strip()
            else:
                # Try to extract after "### Response:\n" or "### Response:"
                if "### Response:\n" in result3:
                    description3 = result3.split("### Response:\n", 1)[-1]
                elif "### Response:" in result3:
                    description3 = result3.split("### Response:", 1)[-1]
                else:
                    # If no markers found, use the whole response but clean it
                    description3 = result3
            # Clean up any remaining XML-like tags and markers
            description3 = re.sub(r"<[^>]+>", "", description3).strip()
            description3 = re.sub(r"### Response:\s*", "", description3).strip()
            descriptions["description_fewshot"] = description3.strip()
            logger.debug(f"Extracted few-shot description (length: {len(description3)}): {description3[:100]}...")
        else:
            descriptions["description_fewshot"] = "API call failed."
    except Exception as e:
        logger.error(f"Error during few-shot description generation: {e}")
        descriptions["description_fewshot"] = "Error during generation."

    # Check if descriptions are valid and retry if needed
    logger.info("Validating generated descriptions...")
    
    # Define prompts for retry (same as original)
    prompts = {
        "simple": prompt_simple,
        "reason": prompt_reason,
        "fewshot": prompt_fewshot
    }
    
    prompt_types = [
        ("description_simple", "simple"),
        ("description_reason", "reason"), 
        ("description_fewshot", "fewshot")
    ]
    
    for desc_key, prompt_key in prompt_types:
        if not is_description_valid(descriptions[desc_key]):
            logger.warning(f"{desc_key} failed validation. Current value: '{descriptions[desc_key][:100]}...'")
            logger.warning(f"{desc_key} failed, retrying with exact same prompt...")
            try:
                result_retry = call_gpt4o_api(prompts[prompt_key])
                if result_retry:
                    # Extract description using improved logic
                    retry_description = result_retry
                    # Try to extract within <Summary_description> tags
                    match = re.search(r"<Summary_description>\s*(.*?)\s*</Summary_description>", result_retry, re.S)
                    if match:
                        retry_description = match.group(1).strip()
                    else:
                        # Try to extract after response markers
                        if "### Response:\n" in result_retry:
                            retry_description = result_retry.split("### Response:\n", 1)[-1].strip()
                        elif "### Response:" in result_retry:
                            retry_description = result_retry.split("### Response:", 1)[-1].strip()
                    # Clean up any remaining XML-like tags and markers
                    retry_description = re.sub(r"<[^>]+>", "", retry_description).strip()
                    retry_description = re.sub(r"### Response:\s*", "", retry_description).strip()
                    
                    if retry_description and len(retry_description.strip()) > 10:
                        descriptions[desc_key] = retry_description.strip()
                        logger.info(f"✓ {desc_key} retry successful (length: {len(retry_description)})")
                    else:
                        logger.warning(f"⚠ {desc_key} retry extracted description too short: '{retry_description[:100]}...'")
            except Exception as e:
                logger.error(f"{desc_key} retry failed: {e}")

    # Final validation check
    valid_count = sum([
        is_description_valid(descriptions["description_simple"]),
        is_description_valid(descriptions["description_reason"]),
        is_description_valid(descriptions["description_fewshot"])
    ])
    logger.info(f"✓ Generated {valid_count}/3 valid descriptions")

    return descriptions

def process_batch_entries(batch_entries, max_workers=5):
    """
    Process a batch of entries in parallel using ThreadPoolExecutor.
    Returns a list of results in the same order as input.
    """
    results = [None] * len(batch_entries)
    
    def process_single_entry(entry_with_index):
        idx, entry = entry_with_index
        sub_directory = entry["Sub Directory"]
        java_code = entry["Java Code"]
        
        logger.info(f"Processing: {sub_directory}")
        try:
            descriptions = generate_description(java_code)
            result_entry = {
                "Sub Directory": sub_directory, 
                "Description_Simple": descriptions["description_simple"],
                "Description_Reason": descriptions["description_reason"],
                "Description_Fewshot": descriptions["description_fewshot"]
            }
            logger.info(f"✓ Completed: {sub_directory}")
            return idx, result_entry
        except Exception as e:
            logger.error(f"✗ Error processing {sub_directory}: {e}")
            error_entry = {
                "Sub Directory": sub_directory, 
                "Description_Simple": f"Error: {str(e)}",
                "Description_Reason": f"Error: {str(e)}",
                "Description_Fewshot": f"Error: {str(e)}"
            }
            return idx, error_entry
    
    # Create list of (index, entry) tuples for processing
    indexed_entries = [(i, entry) for i, entry in enumerate(batch_entries)]
    
    # Process in parallel
    with ThreadPoolExecutor(max_workers=max_workers) as executor:
        # Submit all tasks
        future_to_index = {
            executor.submit(process_single_entry, entry_with_index): entry_with_index[0] 
            for entry_with_index in indexed_entries
        }
        
        # Collect results as they complete
        for future in as_completed(future_to_index):
            try:
                idx, result = future.result()
                results[idx] = result
            except Exception as e:
                original_idx = future_to_index[future]
                logger.error(f"✗ Future failed for index {original_idx}: {e}")
                # Create error entry for failed future
                error_entry = {
                    "Sub Directory": batch_entries[original_idx]["Sub Directory"], 
                    "Description_Simple": f"Future Error: {str(e)}",
                    "Description_Reason": f"Future Error: {str(e)}",
                    "Description_Fewshot": f"Future Error: {str(e)}"
                }
                results[original_idx] = error_entry
    
    return results

def retry_failed_entries(output_file, input_folder):
    """
    Checks existing results and retries any entries with 'API call failed.' in any description.
    Updates the existing file without creating new files.
    """
    if not os.path.exists(output_file):
        logger.info(f"Output file {output_file} does not exist. Nothing to retry.")
        return
    
    try:
        with open(output_file, "r") as file:
            existing_data = json.load(file)
        
        # Find the corresponding input file
        filename = os.path.basename(output_file).replace("_Description.json", ".json")
        input_file = os.path.join(input_folder, filename)
        
        if not os.path.exists(input_file):
            logger.warning(f"Input file {input_file} not found. Cannot retry.")
            return
        
        with open(input_file, "r") as file:
            input_data = json.load(file)
        
        # Create a lookup for original Java code
        java_code_lookup = {item["Sub Directory"]: item["Java Code"] for item in input_data}
        
        retry_count = 0
        for idx, entry in enumerate(existing_data):
            has_failed_description = any(
                "API call failed." in entry.get(f"Description_{desc}", "") 
                for desc in ["Simple", "Reason", "Fewshot"]
            )
            
            if has_failed_description:
                sub_directory = entry["Sub Directory"]
                logger.info(f"🔄 Retrying entry {idx + 1}: {sub_directory}")
                
                if sub_directory in java_code_lookup:
                    java_code = java_code_lookup[sub_directory]
                    try:
                        # Generate new descriptions
                        descriptions = generate_description(java_code)
                        
                        # Update the entry
                        entry["Description_Simple"] = descriptions["description_simple"]
                        entry["Description_Reason"] = descriptions["description_reason"]
                        entry["Description_Fewshot"] = descriptions["description_fewshot"]
                        
                        logger.info(f"✓ Retried descriptions for {sub_directory}")
                        retry_count += 1
                        
                    except Exception as e:
                        logger.error(f"✗ Error retrying {sub_directory}: {e}")
                else:
                    logger.warning(f"⚠️ Original Java code not found for {sub_directory}")
        
        if retry_count > 0:
            # Save updated results
            with open(output_file, "w") as file:
                json.dump(existing_data, file, indent=4)
            logger.info(f"✓ Retried {retry_count} entries and saved to {output_file}")
        else:
            logger.info("✓ No entries found with 'API call failed.' - all descriptions are valid!")
            
    except Exception as e:
        logger.error(f"Error checking existing results: {e}")

def process_dataset(input_folder, output_folder, batch_size=10, max_workers=5):
    """
    Processes all JSON files in the input folder and saves the results to the output folder.
    Shows progress and saves results immediately as they are generated.
    Skips already processed entries if the output file exists.
    """
    if not os.path.exists(output_folder):
        os.makedirs(output_folder)

    for filename in sorted(os.listdir(input_folder)):
        if filename.endswith(".json"):
            input_file = os.path.join(input_folder, filename)
            output_file = os.path.join(output_folder, f"{os.path.splitext(filename)[0]}_Description.json")

            if os.path.exists(input_file):
                try:
                    with open(input_file, "r") as file:
                        dataset = json.load(file)

                    # Load existing results if output file exists
                    existing_results = {}
                    if os.path.exists(output_file):
                        try:
                            with open(output_file, "r") as file:
                                existing_data = json.load(file)
                                # Create a dictionary for quick lookup
                                for item in existing_data:
                                    existing_results[item["Sub Directory"]] = item
                            logger.info(f"✓ Found existing results: {len(existing_results)} entries already processed")
                        except Exception as e:
                            logger.warning(f"Could not load existing results: {e}")
                            existing_results = {}

                    output_data = []
                    total_entries = len(dataset)
                    skipped_count = 0
                    processed_count = 0
                    
                    logger.info(f"\n{'='*60}")
                    logger.info(f"Processing {filename} - {total_entries} entries")
                    logger.info(f"Batch size: {batch_size}, Max workers: {max_workers}")
                    logger.info(f"{'='*60}")

                    # Separate entries into already processed and new ones
                    new_entries = []
                    for entry in dataset:
                        sub_directory = entry["Sub Directory"]
                        if sub_directory in existing_results:
                            output_data.append(existing_results[sub_directory])
                            skipped_count += 1
                        else:
                            new_entries.append(entry)
                    
                    logger.info(f"⏭️  Skipping {skipped_count} already processed entries")
                    logger.info(f"🔄 Processing {len(new_entries)} new entries in batches")
                    
                    # Process new entries in batches
                    for batch_start in range(0, len(new_entries), batch_size):
                        batch_end = min(batch_start + batch_size, len(new_entries))
                        current_batch = new_entries[batch_start:batch_end]
                        batch_num = (batch_start // batch_size) + 1
                        total_batches = (len(new_entries) + batch_size - 1) // batch_size
                        
                        logger.info(f"\n📦 Processing batch {batch_num}/{total_batches} ({len(current_batch)} entries)")
                        logger.info("-" * 50)
                        
                        # Process batch in parallel
                        batch_results = process_batch_entries(current_batch, max_workers)
                        
                        # Add results to output data
                        for result in batch_results:
                            if result:
                                output_data.append(result)
                                processed_count += 1
                        
                        # Save progress after each batch
                        with open(output_file, "w") as file:
                            json.dump(output_data, file, indent=4)
                        
                        logger.info(f"✓ Batch {batch_num} completed and saved")
                        
                        # Small delay between batches to avoid rate limiting
                        if batch_num < total_batches:
                            time.sleep(1)

                    logger.info(f"\n{'='*60}")
                    logger.info(f"Completed {filename}")
                    logger.info(f"Total entries: {total_entries}")
                    logger.info(f"Already processed: {skipped_count}")
                    logger.info(f"Newly processed: {processed_count}")
                    logger.info(f"Final results saved to: {output_file}")
                    logger.info(f"{'='*60}")
                    
                except Exception as e:
                    logger.error(f"Error processing {filename}: {e}")
            else:
                logger.warning(f"{input_file} not found.")

# Check if API client loaded successfully
if client is None:
    logger.error("❌ Failed to initialize OpenAI client. Exiting...")
    exit(1)

# Input and output folder paths
input_folder = "Datasets_copy_copy"
output_folder = "o4-mini-2025-04-16_Generation"

# Batch processing configuration
BATCH_SIZE = 1  # Conservative approach for premium models
MAX_WORKERS = 1  # Single worker to avoid rate limiting

# Process the datasets with batch processing
process_dataset(input_folder, output_folder, batch_size=BATCH_SIZE, max_workers=MAX_WORKERS)

# Check for any failed descriptions and retry them
logger.info("Checking for failed descriptions and retrying...")

# Check each output file for failed descriptions
for filename in sorted(os.listdir(input_folder)):
    if filename.endswith(".json"):
        output_file = os.path.join(output_folder, f"{os.path.splitext(filename)[0]}_Description.json")
        if os.path.exists(output_file):
            logger.info(f"Checking {output_file}...")
            retry_failed_entries(output_file, input_folder)

logger.info("Code execution finished.")