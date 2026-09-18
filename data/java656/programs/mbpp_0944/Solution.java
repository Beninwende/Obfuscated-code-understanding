import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static Integer numPosition(String text) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            return matcher.start();
        }
        return null;
    }
}
