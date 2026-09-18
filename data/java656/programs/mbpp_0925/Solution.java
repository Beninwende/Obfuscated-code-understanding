public class TupleProduct {
    public static int multiplyTuple(int[] nums) {
        int product = 1;
        for (int num : nums) {
            product *= num;
        }
        return product;
    }
}
