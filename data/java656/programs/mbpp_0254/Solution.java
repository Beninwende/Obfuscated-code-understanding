import java.util.regex.*;
import java.util.*;

public class AEWordsFinder {
    public static List<String> wordsAE(String text) {
        Pattern pattern = Pattern.compile("[ae]\\w+");
        Matcher matcher = pattern.matcher(text);
        List<String> list = new ArrayList<>();
        while (matcher.find()) {
            list.add(matcher.group());
        }
        return list;
    }
}
