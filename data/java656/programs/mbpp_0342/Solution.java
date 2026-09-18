import java.util.*;

public class Solution {
    static class Node implements Comparable<Node> {
        int value, listNum, index;
        Node(int value, int listNum, int index) {
            this.value = value;
            this.listNum = listNum;
            this.index = index;
        }
        @Override
        public int compareTo(Node other) {
            return Integer.compare(this.value, other.value);
        }
    }

    public static int[] findMinimumRange(List<List<Integer>> lists) {
        int high = Integer.MIN_VALUE;
        int[] range = {0, Integer.MAX_VALUE};
        PriorityQueue<Node> pq = new PriorityQueue<>();
        for (int i = 0; i < lists.size(); i++) {
            int val = lists.get(i).get(0);
            pq.offer(new Node(val, i, 0));
            high = Math.max(high, val);
        }
        while (true) {
            Node top = pq.poll();
            int low = top.value;
            int i = top.listNum;
            int j = top.index;
            if (high - low < range[1] - range[0]) {
                range[0] = low;
                range[1] = high;
            }
            if (j == lists.get(i).size() - 1) {
                return range;
            }
            int newVal = lists.get(i).get(j + 1);
            pq.offer(new Node(newVal, i, j + 1));
            high = Math.max(high, newVal);
        }
    }
}
