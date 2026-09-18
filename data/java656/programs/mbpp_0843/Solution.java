import java.util.PriorityQueue;

public class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int[] ugly = new int[n];
        ugly[0] = 1;
        PriorityQueue<Node> pq = new PriorityQueue<>();
        for (int p : primes) {
            pq.offer(new Node(p, p, 0));
        }
        int count = 1;
        while (count < n) {
            Node node = pq.poll();
            int val = node.value;
            if (val != ugly[count - 1]) {
                ugly[count++] = val;
            }
            node.index++;
            node.value = ugly[node.index] * node.prime;
            pq.offer(node);
        }
        return ugly[n - 1];
    }

    private static class Node implements Comparable<Node> {
        int value, prime, index;

        Node(int value, int prime, int index) {
            this.value = value;
            this.prime = prime;
            this.index = index;
        }

        @Override
        public int compareTo(Node other) {
            return Integer.compare(this.value, other.value);
        }
    }
}
