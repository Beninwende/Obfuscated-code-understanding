public class Solution {
    public static double[] averageTuple(double[][] nums) {
        int rows = nums.length;
        if (rows == 0) {
            return new double[0];
        }
        int cols = nums[0].length;
        double[] result = new double[cols];
        for (int j = 0; j < cols; j++) {
            double sum = 0;
            for (int i = 0; i < rows; i++) {
                sum += nums[i][j];
            }
            result[j] = sum / rows;
        }
        return result;
    }
}
