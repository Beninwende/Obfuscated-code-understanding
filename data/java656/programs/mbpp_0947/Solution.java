import java.util.List;

public class ShortestWordLength {
    public static int lenLog(List<String> list1) {
        int min = list1.get(0).length();
        for (String s : list1) {
            if (s.length() < min) {
                min = s.length();
            }
        }
        return min;
    }
}
