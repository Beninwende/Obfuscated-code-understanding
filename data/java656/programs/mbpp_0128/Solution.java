import java.util.List;
import java.util.ArrayList;

public class WordFilter {
    public static List<String> longWords(int n, String str) {
        List<String> wordLen = new ArrayList<>();
        String[] txt = str.split(" ");
        for (String x : txt) {
            if (x.length() > n) {
                wordLen.add(x);
            }
        }
        return wordLen;
    }
}
