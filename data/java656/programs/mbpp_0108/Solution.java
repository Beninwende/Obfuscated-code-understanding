import java.util.*;

public class MergeSortedLists {
    private static class Node implements Comparable<Node> {
        int value;
        Iterator<Integer> iterator;
        Node(int value, Iterator<Integer> iterator) {
            this.value = value;
            this.iterator = iterator;
        }
        public int compareTo(Node other) {
            return Integer.compare(this.value, other.value);
        }
    }

    public static List<Integer> mergeSortedList(List<Integer> num1, List<Integer> num2, List<Integer> num3) {
        Collections.sort(num1);
        Collections.sort(num2);
        Collections.sort(num3);

        Iterator<Integer> it1 = num1.iterator();
        Iterator<Integer> it2 = num2.iterator();
        Iterator<Integer> it3 = num3.iterator();

        PriorityQueue<Node> pq = new PriorityQueue<>();
        if (it1.hasNext()) pq.add(new Node(it1.next(), it1));
        if (it2.hasNext()) pq.add(new Node(it2.next(), it2));
        if (it3.hasNext()) pq.add(new Node(it3.next(), it3));

        List<Integer> result = new ArrayList<>();
        while (!pq.isEmpty()) {
            Node node = pq.poll();
            result.add(node.value);
            if (node.iterator.hasNext()) {
                pq.add(new Node(node.iterator.next(), node.iterator));
            }
        }
        return result;
    }
}
