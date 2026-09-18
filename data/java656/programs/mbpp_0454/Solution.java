import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static String textMatchWordz(String text) {
        Pattern pattern = Pattern.compile("\\w*z.\\w*");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            return "Found a match!";
        } else {
            return "Not matched!";
        }
    }
}
