import java.util.*;

public class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> pairs = new ArrayList<>();
        if (nums1.length == 0 || nums2.length == 0 || k <= 0) {
            return pairs;
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.offer(new int[]{nums1[0] + nums2[0], 0, 0});
        while (!pq.isEmpty() && pairs.size() < k) {
            int[] curr = pq.poll();
            int i = curr[1], j = curr[2];
            pairs.add(Arrays.asList(nums1[i], nums2[j]));
            if (j + 1 < nums2.length) {
                pq.offer(new int[]{nums1[i] + nums2[j + 1], i, j + 1});
            }
            if (j == 0 && i + 1 < nums1.length) {
                pq.offer(new int[]{nums1[i + 1] + nums2[j], i + 1, j});
            }
        }
        return pairs;
    }
}
