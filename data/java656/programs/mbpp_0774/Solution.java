import java.util.regex.Pattern;

public class EmailValidator {
    private static final String REGEX = "^[a-z0-9]+[\\._]?[a-z0-9]+[@]\\w+[.]\\w{2,3}$";

    public static String checkEmail(String email) {
        if (Pattern.matches(REGEX, email)) {
            return "Valid Email";
        } else {
            return "Invalid Email";
        }
    }
}
