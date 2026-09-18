public class Solution {
    public static String checkSolution(int a, int b, int c) {
        if (2 * b * b == 9 * a * c) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
