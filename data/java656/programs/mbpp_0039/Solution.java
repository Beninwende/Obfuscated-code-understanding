import java.util.*;

public class Solution {
    public String rearangeString(String S) {
        Map<Character, Integer> count = new HashMap<>();
        for (char c : S.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> b.count - a.count);
        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            pq.offer(new Node(entry.getKey(), entry.getValue()));
        }
        if (!pq.isEmpty() && pq.peek().count * 2 > S.length() + 1) {
            return "";
        }
        StringBuilder ans = new StringBuilder();
        while (pq.size() >= 2) {
            Node n1 = pq.poll();
            Node n2 = pq.poll();
            ans.append(n1.ch).append(n2.ch);
            if (--n1.count > 0) {
                pq.offer(n1);
            }
            if (--n2.count > 0) {
                pq.offer(n2);
            }
        }
        if (!pq.isEmpty()) {
            ans.append(pq.poll().ch);
        }
        return ans.toString();
    }

    private static class Node {
        char ch;
        int count;
        Node(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }
}
