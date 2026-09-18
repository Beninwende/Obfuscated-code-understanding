import java.util.ArrayList;
import java.util.List;

public class LudicNumbers {
    public static List<Integer> getLudic(int n) {
        List<Integer> ludics = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            ludics.add(i);
        }
        int index = 1;
        while (index != ludics.size()) {
            int firstLudic = ludics.get(index);
            int removeIndex = index + firstLudic;
            while (removeIndex < ludics.size()) {
                ludics.remove(removeIndex);
                removeIndex += firstLudic - 1;
            }
            index++;
        }
        return ludics;
    }
}
