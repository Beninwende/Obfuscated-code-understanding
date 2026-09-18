import java.util.List;

public class Solution {
    public int minSumPath(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] memo = new int[triangle.get(n - 1).size()];
        for (int i = 0; i < memo.length; i++) {
            memo[i] = triangle.get(n - 1).get(i);
        }
        for (int i = n - 2; i >= 0; i--) {
            List<Integer> row = triangle.get(i);
            for (int j = 0; j < row.size(); j++) {
                memo[j] = row.get(j) + Math.min(memo[j], memo[j + 1]);
            }
        }
        return memo[0];
    }
}
