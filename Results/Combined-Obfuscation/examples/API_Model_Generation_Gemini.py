import json
import re
import os
import time
from concurrent.futures import ThreadPoolExecutor, as_completed
from google import genai
import logging
from typing import Dict, List, Optional

# Set up logging
logging.basicConfig(level=logging.INFO, format='%(asctime)s - %(levelname)s - %(message)s')
logger = logging.getLogger(__name__)

# Initialize Gemini client
def initialize_gemini_client():
    """Initialize the Gemini client with proper error handling."""
    logger.info("Initializing Gemini client...")
    
    # Check for API key in environment variables
    api_key = os.getenv('GEMINI_API_KEY') or os.getenv('GOOGLE_API_KEY')
    
    if not api_key:
        logger.error("❌ Error: API key not found!")
        logger.error("\nTo set it, run one of these commands:")
        logger.error("  export GEMINI_API_KEY='your-api-key-here'")
        logger.error("  # OR")
        logger.error("  export GOOGLE_API_KEY='your-api-key-here'")
        logger.error("\nFor permanent setup, add to ~/.zshrc:")
        logger.error("  echo 'export GEMINI_API_KEY=\"your-api-key-here\"' >> ~/.zshrc")
        logger.error("  source ~/.zshrc")
        return None
    
    try:
        # Initialize client (it should automatically use the environment variable)
        # But we can also pass it explicitly if needed
        try:
            client = genai.Client(api_key=api_key)
        except TypeError:
            # If Client doesn't accept api_key parameter, use environment variable
            client = genai.Client()
        
        logger.info("✓ Gemini client initialized successfully!")
        
        # Test the API with a simple request
        test_response = client.models.generate_content(
            model="gemini-3-pro-preview",
            contents="Hello"
        )
        logger.info(f"✓ API test successful: {test_response.text[:50]}...")
        return client
        
    except Exception as e:
        logger.error(f"Error initializing Gemini client: {e}")
        return None

# Initialize the client
client = initialize_gemini_client()

def call_gemini_api(contents, max_retries=5, initial_delay=2):
    """
    Calls Gemini API with retry logic for failed requests.
    Handles rate limiting with proper delay extraction from API response.
    """
    if client is None:
        logger.error("Client not initialized")
        return None
    
    delay = initial_delay
    for attempt in range(max_retries):
        try:
            response = client.models.generate_content(
                model="gemini-3-pro-preview",
                contents=contents
            )
            return response.text.strip()
        except Exception as e:
            error_msg = str(e)
            logger.warning(f"API call attempt {attempt + 1} failed: {error_msg}")
            
            # Check for rate limit errors (429)
            if "429" in error_msg or "RESOURCE_EXHAUSTED" in error_msg or "quota" in error_msg.lower():
                # Try to extract retry delay from error details
                retry_delay = None
                try:
                    # Parse error to find retry delay
                    if "retryDelay" in error_msg or "RetryInfo" in error_msg:
                        # Extract delay from error message (format: 'retryDelay': '59s')
                        import re
                        delay_match = re.search(r"retryDelay['\"]?\s*:\s*['\"]?(\d+)s", error_msg)
                        if delay_match:
                            retry_delay = int(delay_match.group(1))
                            logger.warning(f"Rate limit detected. API suggests waiting {retry_delay} seconds")
                except:
                    pass
                
                # Use API-suggested delay or minimum 60 seconds for rate limits
                if retry_delay:
                    delay = max(retry_delay, 60)  # At least 60 seconds
                else:
                    delay = max(delay, 60)  # Minimum 60 seconds for rate limits
                
                logger.warning(f"Rate limit exceeded. Waiting {delay} seconds before retry...")
            else:
                # For other errors, use exponential backoff
                delay = delay * 2 if attempt > 0 else initial_delay
            
            if attempt < max_retries - 1:
                logger.info(f"Retrying in {delay} seconds...")
                time.sleep(delay)
            else:
                logger.error("All retry attempts failed")
                return None

def is_description_valid(description):
    """
    Checks if a description is valid (not a failure indicator).
    """
    if not description:
        return False
    
    failure_indicators = [
        "Summary not found.",
        "API call failed.",
        "Error during generation.",
        "No generated text found.",
        "Model not available",
        "API client not available"
    ]
    
    return not any(indicator.lower() in description.lower() for indicator in failure_indicators)

def extract_description_from_response(response_text):
    """Extract description from API response using multiple patterns."""
    patterns = [
        r"<Summary_description>\s*(.*?)\s*</Summary_description>",
        r"### Response:\s*(.*)",
        r"Summary_description>\s*(.*?)(?:</Summary_description>|$)",
    ]
    
    for pattern in patterns:
        match = re.search(pattern, response_text, re.DOTALL)
        if match:
            extracted = match.group(1).strip()
            if extracted and len(extracted) > 10:  # Minimum length check
                return extracted
    
    # If no pattern matched, return the original text
    return response_text.strip()

def generate_description(java_code):
    """
    Generates three natural language descriptions for Java code using Gemini API.
    Returns a dictionary with three descriptions from different prompts.
    """
    # Check if client is available
    if client is None:
        return {
            "description_simple": "API client not available - Gemini client failed to initialize",
            "description_reason": "API client not available - Gemini client failed to initialize", 
            "description_fewshot": "API client not available - Gemini client failed to initialize"
        }
    
    # Define prompts
    prompts = {
        "simple": f"""
        ### Instruction: Analyze the code and tell me what it does. Explain clearly the goal of this code and its functions. Your response must contain a title, the main goal of the code.

        Here is the Java code snippet:
        <code>
        {java_code}
        </code>

        Analyzing carefully the <code>.

        ### Important: Provide only your short summary description within :
        
        ### Response:\n 
        <Summary_description>
        """,
        
        "reason": f"""
        ### Instruction: Analyze the following Java code step by step to understand its purpose and functionality.

        First, you will be presented with a code snippet:
        <code>
        {java_code}
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
        """,
        
        "fewshot": f"""
        ###Instruction: Your task is to generate a short summary description for a given piece of code. Your description should focus on how the code addresses the problem it was designed to solve. Here is how to proceed:

        First, you will be presented with a code snippet:
        <code>
        {java_code}
        </code>

        Next, you will be given an example of code following to his associate problem statement:
        <Example_code>
        import java.util.Scanner;
        public class Main_3 {{
            public static void main(String[] args) {{
                Scanner sc = new Scanner(System.in);
                String str = sc.nextLine();
                StringBuffer sb = new StringBuffer(str);
                String rv = sb.reverse().toString();
                System.out.println(rv);
            }}
        }}
        </Example_code>

        And <Example_problem>
        Exercise: Reverse a String
        Problem Statement: This program that takes a string as input and reverses its characters. The program should then output the reversed string.

        Requirements
        The input string will have a maximum length of 20 characters.
        The program must read the string and output its reversed version on a single line.
        Ensure the program handles uppercase, lowercase, digits, and special characters correctly.
        </Example_problem>

        Analyze carefully the <code>, paying attention of it structure, functions and logic. Consider How each part of the code contributes to solving the given problem.

        Present only your summary description within :
        
        ### Response:\n
        <Summary_description>
        """
    }
    
    descriptions = {}
    prompt_types = [
        ("description_simple", "simple"),
        ("description_reason", "reason"), 
        ("description_fewshot", "fewshot")
    ]
    
    for desc_key, prompt_key in prompt_types:
        try:
            # Add delay before each API call (except the first one)
            if desc_key != prompt_types[0][0]:
                logger.info(f"⏳ Waiting 8 seconds before {prompt_key} API call to respect rate limits...")
                time.sleep(8)  # 8 seconds between calls (10 req/min = 6 sec, use 8 for safety)
            
            logger.info(f"Calling Gemini API with {prompt_key} prompt...")
            result = call_gemini_api(prompts[prompt_key])
            
            if result:
                description = extract_description_from_response(result)
                descriptions[desc_key] = description
                logger.info(f"✓ {prompt_key} description generated successfully")
            else:
                descriptions[desc_key] = "API call failed."
                logger.warning(f"API call failed for {prompt_key} prompt")
                
        except Exception as e:
            logger.error(f"Error during {prompt_key} description generation: {e}")
            descriptions[desc_key] = f"Error during generation: {str(e)}"

    # Check if descriptions are valid and retry if needed
    logger.info("Validating generated descriptions...")
    
    retry_count = 0
    for desc_key, prompt_key in prompt_types:
        if not is_description_valid(descriptions[desc_key]):
            retry_count += 1
            logger.warning(f"{desc_key} failed validation. Current value: '{descriptions[desc_key][:100]}...'")
            logger.warning(f"Retrying {desc_key} with exact same prompt...")
            
            # Add delay before retry to avoid rate limits
            logger.info(f"⏳ Waiting 8 seconds before retry API call...")
            time.sleep(8)
            
            try:
                result_retry = call_gemini_api(prompts[prompt_key])
                if result_retry:
                    retry_description = extract_description_from_response(result_retry)
                    if retry_description and len(retry_description.strip()) > 10:
                        descriptions[desc_key] = retry_description.strip()
                        logger.info(f"✓ {desc_key} retry successful")
                    else:
                        logger.warning(f"⚠ {desc_key} retry returned description too short")
                else:
                    logger.warning(f"⚠ {desc_key} retry returned None")
            except Exception as e:
                logger.error(f"{desc_key} retry failed: {e}")
    
    if retry_count > 0:
        logger.info(f"Completed {retry_count} retry attempt(s)")

    # Final validation check
    valid_count = sum(is_description_valid(descriptions[key]) for key in descriptions)
    logger.info(f"✓ Generated {valid_count}/3 valid descriptions")

    return descriptions

def process_batch_entries(batch_entries, max_workers=5):
    """
    Process a batch of entries sequentially (one at a time) to avoid rate limits.
    Returns a list of results in the same order as input.
    """
    results = [None] * len(batch_entries)
    
    # Process sequentially when max_workers is 1 (one at a time)
    if max_workers == 1:
        for idx, entry in enumerate(batch_entries):
            sub_directory = entry["Sub Directory"]
            java_code = entry["Java Code"]
            
            logger.info(f"Processing entry {idx + 1}/{len(batch_entries)}: {sub_directory}")
            
            # Add delay before processing each entry (except the first one)
            if idx > 0:
                logger.info(f"⏳ Waiting 10 seconds before processing next entry to respect rate limits...")
                time.sleep(10)
            
            try:
                descriptions = generate_description(java_code)
                result_entry = {
                    "Sub Directory": sub_directory, 
                    "Description_Simple": descriptions["description_simple"],
                    "Description_Reason": descriptions["description_reason"],
                    "Description_Fewshot": descriptions["description_fewshot"]
                }
                logger.info(f"✓ Completed: {sub_directory}")
                results[idx] = result_entry
            except Exception as e:
                logger.error(f"✗ Error processing {sub_directory}: {e}")
                error_entry = {
                    "Sub Directory": sub_directory, 
                    "Description_Simple": f"Error: {str(e)}",
                    "Description_Reason": f"Error: {str(e)}",
                    "Description_Fewshot": f"Error: {str(e)}"
                }
                results[idx] = error_entry
    else:
        # Process in parallel for max_workers > 1 (not recommended for rate-limited APIs)
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
        failed_entries = []
        
        # First, collect all failed entries
        for idx, entry in enumerate(existing_data):
            has_failed_description = any(
                "API call failed." in entry.get(f"Description_{desc}", "") 
                for desc in ["Simple", "Reason", "Fewshot"]
            )
            
            if has_failed_description:
                failed_entries.append((idx, entry))
        
        if not failed_entries:
            logger.info("✓ No entries found with 'API call failed.' - all descriptions are valid!")
            return
        
        logger.info(f"Found {len(failed_entries)} entries with failed API calls. Starting retry process...")
        
        # Add initial delay before starting retries (to reset rate limit window)
        logger.info("⏳ Waiting 10 seconds before starting retries to respect rate limits...")
        time.sleep(10)
        
        for entry_idx, (idx, entry) in enumerate(failed_entries):
            sub_directory = entry["Sub Directory"]
            logger.info(f"🔄 Retrying entry {entry_idx + 1}/{len(failed_entries)}: {sub_directory}")
            
            if sub_directory in java_code_lookup:
                java_code = java_code_lookup[sub_directory]
                try:
                    # Add delay before each retry (except the first one which already waited)
                    if entry_idx > 0:
                        logger.info(f"⏳ Waiting 7 seconds before API call to respect rate limits...")
                        time.sleep(7)
                    
                    # Generate new descriptions
                    descriptions = generate_description(java_code)
                    
                    # Update the entry
                    entry["Description_Simple"] = descriptions["description_simple"]
                    entry["Description_Reason"] = descriptions["description_reason"]
                    entry["Description_Fewshot"] = descriptions["description_fewshot"]
                    
                    logger.info(f"✓ Retried descriptions for {sub_directory}")
                    retry_count += 1
                    
                    # Save progress after each successful retry
                    with open(output_file, "w") as file:
                        json.dump(existing_data, file, indent=4)
                    logger.info(f"💾 Progress saved: {retry_count}/{len(failed_entries)} entries retried")
                    
                except Exception as e:
                    logger.error(f"✗ Error retrying {sub_directory}: {e}")
                    # Still save progress even if this one failed
                    with open(output_file, "w") as file:
                        json.dump(existing_data, file, indent=4)
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
                    
                    logger.info(f"Processing {filename} - {total_entries} entries")
                    logger.info(f"Batch size: {batch_size}, Max workers: {max_workers}")

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
                        
                        logger.info(f"📦 Processing batch {batch_num}/{total_batches} ({len(current_batch)} entries)")
                        
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
                        
                        # Delay between batches to avoid rate limiting (10 requests/min = 6 sec between, use 10 for safety)
                        if batch_num < total_batches:
                            logger.info(f"Waiting 10 seconds before next batch to respect rate limits...")
                            time.sleep(10)

                    logger.info(f"Completed {filename}")
                    logger.info(f"Total entries: {total_entries}")
                    logger.info(f"Already processed: {skipped_count}")
                    logger.info(f"Newly processed: {processed_count}")
                    logger.info(f"Final results saved to: {output_file}")
                    
                except Exception as e:
                    logger.error(f"Error processing {filename}: {e}")
            else:
                logger.warning(f"Warning: {input_file} not found.")

if __name__ == "__main__":
    # Check if API client loaded successfully
    if client is None:
        logger.error("❌ Failed to initialize Gemini client. Exiting...")
        exit(1)

    # Input and output folder paths
    input_folder = "Datasets"
    output_folder = "gemini_Generation"

    # Create output folder if it doesn't exist
    if not os.path.exists(output_folder):
        os.makedirs(output_folder)

    # Batch processing configuration - Very conservative for Gemini rate limits (10 req/min)
    BATCH_SIZE = 1  # Process 1 entry at a time to respect rate limits
    MAX_WORKERS = 1  # Single worker to avoid concurrent rate limit issues

    # FIRST: Check for any failed descriptions and retry them BEFORE processing new entries
    logger.info("=" * 60)
    logger.info("STEP 1: Checking for failed descriptions and retrying...")
    logger.info("=" * 60)
    
    # Check each output file for failed descriptions
    for filename in sorted(os.listdir(input_folder)):
        if filename.endswith(".json"):
            output_file = os.path.join(output_folder, f"{os.path.splitext(filename)[0]}_Description.json")
            if os.path.exists(output_file):
                logger.info(f"Checking {output_file} for failed entries...")
                retry_failed_entries(output_file, input_folder)
    
    logger.info("=" * 60)
    logger.info("STEP 2: Processing new entries...")
    logger.info("=" * 60)
    
    # THEN: Process the datasets with batch processing
    process_dataset(input_folder, output_folder, batch_size=BATCH_SIZE, max_workers=MAX_WORKERS)

    # FINALLY: Check again for any failed descriptions after processing
    logger.info("=" * 60)
    logger.info("STEP 3: Final check for failed descriptions...")
    logger.info("=" * 60)
    
    for filename in sorted(os.listdir(input_folder)):
        if filename.endswith(".json"):
            output_file = os.path.join(output_folder, f"{os.path.splitext(filename)[0]}_Description.json")
            if os.path.exists(output_file):
                logger.info(f"Final check for {output_file}...")
                retry_failed_entries(output_file, input_folder)

    logger.info("Code execution finished.")
