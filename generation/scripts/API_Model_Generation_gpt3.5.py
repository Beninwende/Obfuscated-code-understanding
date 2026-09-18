import json
import re
import os
import time
from concurrent.futures import ThreadPoolExecutor, as_completed
from openai import OpenAI

# Initialize OpenAI client
print("Initializing OpenAI client...")
try:
    client = OpenAI()
    print("✓ OpenAI client initialized successfully!")
    
    # Test the API with a simple request
    test_response = client.chat.completions.create(
        model="gpt-3.5-turbo",
        messages=[{"role": "user", "content": "Hello"}],
        max_tokens=10,
        temperature=0.3
    )
    print(f"✓ API test successful: {test_response.choices[0].message.content[:50]}...")
    
except Exception as e:
    print(f"Error initializing OpenAI client: {e}")
    print("Please ensure your OpenAI API key is set in the environment variable OPENAI_API_KEY")
    client = None


def call_gpt4o_api(messages, max_retries=3, delay=1):
    """
    Calls GPT-4o API with retry logic for failed requests.
    """
    if client is None:
        return None
    
    for attempt in range(max_retries):
        try:
            response = client.chat.completions.create(
                model="gpt-3.5-turbo",
                messages=messages,
                max_tokens=512,
                temperature=0.3,
                top_p=1
            )
            return response.choices[0].message.content.strip()
        except Exception as e:
            print(f"API call attempt {attempt + 1} failed: {e}")
            if attempt < max_retries - 1:
                print(f"Retrying in {delay} seconds...")
                time.sleep(delay)
                delay *= 2  # Exponential backoff
            else:
                print("All retry attempts failed")
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
    
    return not any(indicator in description for indicator in failure_indicators)

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
        print(f"Calling GPT-4o API with simple prompt...")
        messages1 = [{"role": "user", "content": prompt_simple}]
        result1 = call_gpt4o_api(messages1)
        
        if result1:
            # Extract only the response part
            description1 = result1.split("### Response:\n", 1)[-1]
            descriptions["description_simple"] = description1.strip()
        else:
            descriptions["description_simple"] = "API call failed."
    except Exception as e:
        print(f"Error during simple description generation: {e}")
        descriptions["description_simple"] = "Error during generation."

    # Generate description using reasoning prompt (second)
    try:
        print(f"Calling GPT-4o API with reasoning prompt...")
        messages2 = [{"role": "user", "content": prompt_reason}]
        result2 = call_gpt4o_api(messages2)
        
        if result2:
            match = re.search(r"<Summary_description>\s*### Response:\s*(.*?)(?:</Summary_description>|$)", result2, re.S)
            if match:
                descriptions["description_reason"] = match.group(1).strip()
            else:
                match = re.search(r"### Response:\s*(.*)", result2, re.S)
                if match:
                    descriptions["description_reason"] = match.group(1).strip()
                else:
                    descriptions["description_reason"] = "Summary not found."
        else:
            descriptions["description_reason"] = "API call failed."
    except Exception as e:
        print(f"Error during reasoning description generation: {e}")
        descriptions["description_reason"] = "Error during generation."

    # Generate description using few-shot prompt (third)
    try:
        print(f"Calling GPT-4o API with few-shot prompt...")
        messages3 = [{"role": "user", "content": prompt_fewshot}]
        result3 = call_gpt4o_api(messages3)
        
        if result3:
            match = re.search(r"<Summary_description>\s*### Response:\s*(.*?)(?:</Summary_description>|$)", result3, re.S)
            if match:
                descriptions["description_fewshot"] = match.group(1).strip()
            else:
                match = re.search(r"### Response:\s*(.*)", result3, re.S)
                if match:
                    descriptions["description_fewshot"] = match.group(1).strip()
                else:
                    descriptions["description_fewshot"] = "Summary not found."
        else:
            descriptions["description_fewshot"] = "API call failed."
    except Exception as e:
        print(f"Error during few-shot description generation: {e}")
        descriptions["description_fewshot"] = "Error during generation."

    # Check if descriptions are valid and retry if needed
    print("Validating generated descriptions...")
    
    # Check and retry simple description if needed
    if not is_description_valid(descriptions["description_simple"]):
        print("Simple description failed, retrying with alternative prompt...")
        try:
            alternative_simple_prompt = f"""
            Analyze this Java code and provide a clear, concise summary of what it does:

            ```{java_code}```

            Provide a brief explanation of the code's purpose and main functionality:

            ### Response:
            """
            messages_retry = [{"role": "user", "content": alternative_simple_prompt}]
            result_retry = call_gpt4o_api(messages_retry)
            if result_retry:
                retry_description = result_retry.split("### Response:", 1)[-1].strip()
                if retry_description and len(retry_description) > 10:
                    descriptions["description_simple"] = retry_description
                    print(f"✓ Simple description retry successful")
        except Exception as e:
            print(f"Simple description retry failed: {e}")

    # Check and retry reasoning description if needed
    if not is_description_valid(descriptions["description_reason"]):
        print("Reasoning description failed, retrying with alternative prompt...")
        try:
            alternative_reason_prompt = f"""
            Analyze this Java code step by step and explain what it does:

            ```{java_code}```

            Break down the code's functionality and purpose:

            ### Response:
            """
            messages_retry = [{"role": "user", "content": alternative_reason_prompt}]
            result_retry = call_gpt4o_api(messages_retry)
            if result_retry:
                retry_description = result_retry.split("### Response:", 1)[-1].strip()
                if retry_description and len(retry_description) > 10:
                    descriptions["description_reason"] = retry_description
                    print(f"✓ Reasoning description retry successful")
        except Exception as e:
            print(f"Reasoning description retry failed: {e}")

    # Check and retry few-shot description if needed
    if not is_description_valid(descriptions["description_fewshot"]):
        print("Few-shot description failed, retrying with alternative prompt...")
        try:
            alternative_fewshot_prompt = f"""
            Analyze the following Java code and provide a concise summary of what it does.

            Code to analyze:
            ```{java_code}```

            Example of good analysis:
            Code: ```{example_code}```
            Analysis: This program reads a string from user input, reverses it using StringBuffer, and outputs the reversed string.

            Now analyze the given code and provide a similar concise summary:

            ### Response:
            """
            messages_retry = [{"role": "user", "content": alternative_fewshot_prompt}]
            result_retry = call_gpt4o_api(messages_retry)
            if result_retry:
                retry_description = result_retry.split("### Response:", 1)[-1].strip()
                if retry_description and len(retry_description) > 10:
                    descriptions["description_fewshot"] = retry_description
                    print(f"✓ Few-shot description retry successful")
        except Exception as e:
            print(f"Few-shot description retry failed: {e}")

    # Final validation check
    valid_count = sum([
        is_description_valid(descriptions["description_simple"]),
        is_description_valid(descriptions["description_reason"]),
        is_description_valid(descriptions["description_fewshot"])
    ])
    print(f"✓ Generated {valid_count}/3 valid descriptions")

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
        
        print(f"Processing: {sub_directory}")
        try:
            descriptions = generate_description(java_code)
            result_entry = {
                "Sub Directory": sub_directory, 
                "Description_Simple": descriptions["description_simple"],
                "Description_Reason": descriptions["description_reason"],
                "Description_Fewshot": descriptions["description_fewshot"]
            }
            print(f"✓ Completed: {sub_directory}")
            return idx, result_entry
        except Exception as e:
            print(f"✗ Error processing {sub_directory}: {e}")
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
                print(f"✗ Future failed for index {original_idx}: {e}")
                # Create error entry for failed future
                error_entry = {
                    "Sub Directory": batch_entries[original_idx]["Sub Directory"], 
                    "Description_Simple": f"Future Error: {str(e)}",
                    "Description_Reason": f"Future Error: {str(e)}",
                    "Description_Fewshot": f"Future Error: {str(e)}"
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
                            print(f"✓ Found existing results: {len(existing_results)} entries already processed")
                        except Exception as e:
                            print(f"Warning: Could not load existing results: {e}")
                            existing_results = {}

                    output_data = []
                    total_entries = len(dataset)
                    skipped_count = 0
                    processed_count = 0
                    
                    print(f"\n{'='*60}")
                    print(f"Processing {filename} - {total_entries} entries")
                    print(f"Batch size: {batch_size}, Max workers: {max_workers}")
                    print(f"{'='*60}")

                    # Separate entries into already processed and new ones
                    new_entries = []
                    for entry in dataset:
                        sub_directory = entry["Sub Directory"]
                        if sub_directory in existing_results:
                            output_data.append(existing_results[sub_directory])
                            skipped_count += 1
                        else:
                            new_entries.append(entry)
                    
                    print(f"⏭️  Skipping {skipped_count} already processed entries")
                    print(f"🔄 Processing {len(new_entries)} new entries in batches")
                    
                    # Process new entries in batches
                    for batch_start in range(0, len(new_entries), batch_size):
                        batch_end = min(batch_start + batch_size, len(new_entries))
                        current_batch = new_entries[batch_start:batch_end]
                        batch_num = (batch_start // batch_size) + 1
                        total_batches = (len(new_entries) + batch_size - 1) // batch_size
                        
                        print(f"\n📦 Processing batch {batch_num}/{total_batches} ({len(current_batch)} entries)")
                        print("-" * 50)
                        
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
                        
                        print(f"✓ Batch {batch_num} completed and saved")
                        
                        # Small delay between batches to avoid rate limiting
                        if batch_num < total_batches:
                            time.sleep(1)

                    print(f"\n{'='*60}")
                    print(f"Completed {filename}")
                    print(f"Total entries: {total_entries}")
                    print(f"Already processed: {skipped_count}")
                    print(f"Newly processed: {processed_count}")
                    print(f"Final results saved to: {output_file}")
                    print(f"{'='*60}")
                    
                except Exception as e:
                    print(f"Error processing {filename}: {e}")
            else:
                print(f"Warning: {input_file} not found.")

# Check if API client loaded successfully
if client is None:
    print("❌ Failed to initialize OpenAI client. Exiting...")
    exit(1)

# Input and output folder paths
input_folder = "Datasets"
output_folder = "GPT3.5_Generation"

# Batch processing configuration
BATCH_SIZE = 5  # Number of entries to process in parallel per batch
MAX_WORKERS = 3  # Maximum number of concurrent API calls

# Process the datasets with batch processing
process_dataset(input_folder, output_folder, batch_size=BATCH_SIZE, max_workers=MAX_WORKERS)

print("Code execution finished.")