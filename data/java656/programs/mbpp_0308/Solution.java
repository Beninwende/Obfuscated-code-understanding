import java.util.*;

public class Solution {
    public static List<Integer> largeProduct(List<Integer> nums1, List<Integer> nums2, int N) {
        List<Integer> products = new ArrayList<>();
        for (int x : nums1) {
            for (int y : nums2) {
                products.add(x * y);
            }
        }
        products.sort(Collections.reverseOrder());
        return products.subList(0, Math.min(N, products.size()));
    }
}
