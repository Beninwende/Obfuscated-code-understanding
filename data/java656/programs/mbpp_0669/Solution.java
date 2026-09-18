import java.util.regex.Pattern;

public class IPValidator {
    private static final String REGEX = "^(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\."
        + "(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\."
        + "(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\."
        + "(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)$";
    private static final Pattern PATTERN = Pattern.compile(REGEX);

    public static String checkIP(String ip) {
        if (PATTERN.matcher(ip).matches()) {
            return "Valid IP address";
        } else {
            return "Invalid IP address";
        }
    }
}
