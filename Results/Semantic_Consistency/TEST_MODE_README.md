# Test Mode for compute_pairwise_similarity.py

## Quick Test (Default)
Processes **1 model** with **2 problems** (15 pairs each = 30 API calls total):

```bash
cd /Users/lionel.nikiema/Desktop/combined_dataset
export OPENAI_API_KEY="your-key"
python3 Results/Semantic_Consistency/compute_pairwise_similarity.py --test
```

## Custom Test Parameters

**Test with 1 model, 1 problem** (15 pairs = 30 API calls):
```bash
python3 Results/Semantic_Consistency/compute_pairwise_similarity.py --test --test-models 1 --test-problems 1
```

**Test with 2 models, 3 problems each** (2 models × 3 problems × 15 pairs = 90 pairs = 180 API calls):
```bash
python3 Results/Semantic_Consistency/compute_pairwise_similarity.py --test --test-models 2 --test-problems 3
```

## Full Run (No Test Mode)
Processes all 14 models with all 250 problems each:

```bash
python3 Results/Semantic_Consistency/compute_pairwise_similarity.py
```

## Test Output Location
- Test results saved to: `Results/Semantic_Consistency/test_output/`
- Full run results saved to: `Results/Semantic_Consistency/`

## What Gets Tested
- ✅ Loading original descriptions from `problem_descriptions_2.0/`
- ✅ Loading transformation descriptions from JSON files
- ✅ Computing 15 pairs per problem
- ✅ GPT-4o scoring (score1_llm)
- ✅ GPT-3.5-turbo scoring (score2_llm)
- ✅ Sentence Transformers scoring (st_score)
- ✅ Average calculation (avg_llm_score)
- ✅ JSON and CSV output generation

## Expected Test Output
- `test_output/pairwise_similarity.json` - JSON with test results
- `test_output/pairwise_similarity.csv` - CSV with test results

## Verify Test Results
Check that:
1. JSON has correct structure (model → problems → pairs)
2. Each pair has: score1_llm, score2_llm, avg_llm_score, st_score
3. CSV has correct columns
4. Scores are between 0.0 and 1.0
5. avg_llm_score = (score1_llm + score2_llm) / 2
