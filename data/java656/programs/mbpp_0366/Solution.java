public class Solution {
    public static int adjacentNumProduct(int[] listNums) {
        if (listNums == null || listNums.length < 2) {
            throw new IllegalArgumentException("List must contain at least two elements");
        }
        int maxProduct = listNums[0] * listNums[1];
        for (int i = 1; i < listNums.length - 1; i++) {
            int product = listNums[i] * listNums[i + 1];
            if (product > maxProduct) {
                maxProduct = product;
            }
        }
        return maxProduct;
    }
}
