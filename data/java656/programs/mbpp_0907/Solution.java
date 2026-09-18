import java.util.*;

public class LuckyNumbers {
    public static List<Integer> luckyNum(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = -1; i < n * n + 9; i += 2) {
            list.add(i);
        }
        int i = 2;
        while (i < list.size()) {
            int step = list.get(i);
            Set<Integer> toRemove = new HashSet<>();
            for (int j = step; j < list.size(); j += step) {
                toRemove.add(list.get(j));
            }
            List<Integer> newList = new ArrayList<>();
            for (Integer num : list) {
                if (!toRemove.contains(num)) {
                    newList.add(num);
                }
            }
            list = newList;
            i++;
        }
        return list.subList(1, Math.min(n + 1, list.size()));
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        List<Integer> result = luckyNum(n);
        for (Integer num : result) {
            System.out.println(num);
        }
    }
}
