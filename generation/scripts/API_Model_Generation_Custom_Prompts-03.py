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


def call_gpt4o_api(messages, max_retries=3, initial_delay=2):
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
                messages=messages,
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

def get_prompts_for_file_type(filename):
    """
    Returns the appropriate prompts based on the file type.
    """
    if "Variable_Renaming" in filename:
        return {
            "vague": """Analyze the following Java code that has been obfuscated using variable renaming, class and method renaming, and control flow obfuscation techniques and provide a description of what this code does. Focus on understanding the program's functionality and logic flow using at most 512 words.

```{java_code}```

### Response:""",
            "detailed": """Analyze the following Java code that has been obfuscated using variable renaming, class and method renaming, and control flow obfuscation techniques. The obfuscation includes:
- Renaming of local variables and method parameters to meaningless names
- Addition of fake local variables with incorrect types to confuse decompilers
- Removal or modification of debug information and source file names

Despite these obfuscations, the core program logic remains intact. Please provide a detailed description of what this code does, focusing on the actual functionality, algorythm rather than the obfuscated variable names.

Analyze carefully the <code>:

```{java_code}```

### Important: Provide only your short summary description within using at most 512 words:
### Response:
<summary_description>"""

        }
    
    elif "DeadCode" in filename:
        return {
            "vague": """Analyze this Java code that has been obfuscated using control flow obfuscation techniques like dead code injection and describe its functionality. Pay attention to the control flow and program behavior.

```{java_code}```

### Response:""",
            "detailed": """Analyze the following Java code that has been obfuscated using control flow obfuscation techniques. The obfuscation includes:
- Replacement of unconditional GOTO jumps with conditional jumps that always evaluate to true
- Insertion of fake conditional statements using random integer comparisons (IF_ICMPNE, IF_ICMPEQ, etc.)
- Addition of dead code blocks that are never executed but appear to be part of the logic
- Insertion of meaningless string operations (like "".length()) before jumps
- Replacement of simple comparisons with method calls that return boolean values
- Breaking of string concatenations by replacing StringBuilder.toString() calls

The obfuscation creates the appearance of complex conditional logic, but the actual program flow remains unchanged. Please provide a description of what this code actually does, ignoring the fake conditional branches and dead code.

Analyze carefully the <code>:
```{java_code}```
### Important: Provide only your short summary description within using at most 512 words:

### Response:
<summary_description>"""
        }
    
    elif "Encryption" in filename:
        return {
            "vague": """Analyze this Java code that has been obfuscated using string and integer encryption techniques and describe the program's behavior, particularly focusing on any string operations and data processing.

Analyze carefully the <code>:
```{java_code}```

### Important: Provide only your short summary description within using at most 512 words:
### Response:
<summary_description>""",
            "detailed": """Analyze the following Java bytecode that has been obfuscated using string encryption techniques. The obfuscation includes:
- Replacement of string literals with encrypted versions stored in static arrays
- Use of XOR encryption with Base64 encoding for string obfuscation
- Dynamic decryption at runtime using generated decryption methods
- Storage of encrypted strings in class static fields initialized during class loading
- Optional hiding of strings in the source file attribute using special Unicode markers
- Use of multiple encryption algorithms (XOR, DES, Blowfish, optionally AES)

The original strings are encrypted using XOR with a random key, then Base64 encoded. At runtime, the strings are decrypted by calling generated static methods. Please provide a description of what this code does, focusing on the actual string content and program functionality rather than the encryption mechanism.

Analyze carefully the <code>:
```{java_code}```

### Important: Provide only your short summary description within using at most 512 words:
### Response:
<summary_description>"""
        }
    
    else:
        # Default prompts for unknown file types
        return {
            "vague": """Analyze the following Java code and provide a description of what this code does.

```{java_code}```

### Response:""",
            "detailed": """Analyze the following Java code and provide a detailed description of what this code does, including its functionality and purpose.

```{java_code}```

### Response:"""
        }

def generate_description(java_code, filename):
    """
    Generates two natural language descriptions for Java code using GPT-3.5 API.
    Returns a dictionary with two descriptions: vague and detailed.
    """
    # Check if client is available
    if client is None:
        return {
            "description_vague": "API client not available - OpenAI client failed to initialize",
            "description_detailed": "API client not available - OpenAI client failed to initialize"
        }
    
    # Get prompts based on file type
    prompts = get_prompts_for_file_type(filename)
    
    descriptions = {}
    
    # Generate description using vague prompt with retry logic
    vague_success = False
    for attempt in range(3):
        try:
            logger.info(f"Calling o4-mini API with vague prompt for {filename} (attempt {attempt + 1}/3)...")
            vague_prompt = prompts["vague"].format(java_code=java_code)
            messages1 = [{"role": "user", "content": vague_prompt}]
            result1 = call_gpt4o_api(messages1)
            
            if result1:
                # Extract and clean the response part
                description1 = result1
                if "### Response:" in result1:
                    description1 = result1.split("### Response:", 1)[-1].strip()
                # Clean up any XML-like tags
                description1 = re.sub(r"<[^>]+>", "", description1).strip()
                descriptions["description_vague"] = description1
                vague_success = True
                break
            else:
                logger.warning(f"Vague prompt attempt {attempt + 1} failed: API call failed")
        except Exception as e:
            logger.error(f"Vague prompt attempt {attempt + 1} failed: {e}")
    
    if not vague_success:
        descriptions["description_vague"] = "API call failed after 3 attempts."

    # Generate description using detailed prompt with retry logic
    detailed_success = False
    for attempt in range(3):
        try:
            logger.info(f"Calling o4-mini API with detailed prompt for {filename} (attempt {attempt + 1}/3)...")
            detailed_prompt = prompts["detailed"].format(java_code=java_code)
            messages2 = [{"role": "user", "content": detailed_prompt}]
            result2 = call_gpt4o_api(messages2)
            
            if result2:
                # Extract and clean the response part
                description2 = result2
                if "### Response:" in result2:
                    description2 = result2.split("### Response:", 1)[-1].strip()
                # Clean up any XML-like tags
                description2 = re.sub(r"<[^>]+>", "", description2).strip()
                descriptions["description_detailed"] = description2
                detailed_success = True
                break
            else:
                logger.warning(f"Detailed prompt attempt {attempt + 1} failed: API call failed")
        except Exception as e:
            logger.error(f"Detailed prompt attempt {attempt + 1} failed: {e}")
    
    if not detailed_success:
        descriptions["description_detailed"] = "API call failed after 3 attempts."

    # Final validation check
    valid_count = sum([
        is_description_valid(descriptions["description_vague"]),
        is_description_valid(descriptions["description_detailed"])
    ])
    logger.info(f"✓ Generated {valid_count}/2 valid descriptions")

    return descriptions

def process_batch_entries(batch_entries, filename, max_workers=5):
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
            descriptions = generate_description(java_code, filename)
            result_entry = {
                "Sub Directory": sub_directory, 
                "Description_Vague": descriptions["description_vague"],
                "Description_Detailed": descriptions["description_detailed"]
            }
            logger.info(f"✓ Completed: {sub_directory}")
            return idx, result_entry
        except Exception as e:
            logger.error(f"✗ Error processing {sub_directory}: {e}")
            error_entry = {
                "Sub Directory": sub_directory, 
                "Description_Vague": f"Error: {str(e)}",
                "Description_Detailed": f"Error: {str(e)}"
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
                    "Description_Vague": f"Future Error: {str(e)}",
                    "Description_Detailed": f"Future Error: {str(e)}"
                }
                results[original_idx] = error_entry
    
    return results

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
                        batch_results = process_batch_entries(current_batch, filename, max_workers)
                        
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
input_folder = "Datasets_copy"
output_folder = "Custom_Prompts_Generation_gpt4o"

# Batch processing configuration
BATCH_SIZE = 8  # Number of entries to process in parallel per batch
MAX_WORKERS = 4  # Maximum number of concurrent API calls

# Process the datasets with batch processing
process_dataset(input_folder, output_folder, batch_size=BATCH_SIZE, max_workers=MAX_WORKERS)

logger.info("Code execution finished.")
