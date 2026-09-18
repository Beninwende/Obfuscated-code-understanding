import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Extractor {
    public static int extractMax(String input) {
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(input);
        int max = Integer.MIN_VALUE;
        boolean found = false;
        while (matcher.find()) {
            found = true;
            int num = Integer.parseInt(matcher.group());
            if (num > max) {
                max = num;
            }
        }
        if (!found) {
            throw new IllegalArgumentException("No numbers found in input");
        }
        return max;
    }
}
