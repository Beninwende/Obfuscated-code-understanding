import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class DecimalUtils {
    private static final Pattern DECIMAL_PATTERN = Pattern.compile("^[0-9]+(\\.[0-9]{1,2})?$");

    public static boolean isDecimal(String num) {
        if (num == null) {
            return false;
        }
        Matcher matcher = DECIMAL_PATTERN.matcher(num);
        return matcher.matches();
    }
}
