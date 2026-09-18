import java.util.*;
import java.util.regex.*;

public class DateExtractor {
    public static List<String[]> extractDate(String url) {
        List<String[]> dates = new ArrayList<>();
        Pattern pattern = Pattern.compile("/(\\d{4})/(\\d{1,2})/(\\d{1,2})/");
        Matcher matcher = pattern.matcher(url);
        while (matcher.find()) {
            dates.add(new String[]{matcher.group(1), matcher.group(2), matcher.group(3)});
        }
        return dates;
    }
}
