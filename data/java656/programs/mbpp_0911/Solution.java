import java.util.*;

public class Solution {
    public int maximumProduct(int[] nums) {
        PriorityQueue<Integer> largest = new PriorityQueue<>();
        PriorityQueue<Integer> smallest = new PriorityQueue<>(Collections.reverseOrder());
        for (int n : nums) {
            largest.offer(n);
            if (largest.size() > 3) {
                largest.poll();
            }
            smallest.offer(n);
            if (smallest.size() > 2) {
                smallest.poll();
            }
        }
        int third = largest.poll();
        int second = largest.poll();
        int first = largest.poll();
        int secondSmallest = smallest.poll();
        int smallestNum = smallest.poll();
        return Math.max(first * second * third, first * smallestNum * secondSmallest);
    }
}
