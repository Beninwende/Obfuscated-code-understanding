import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringValidator {
    public static List<String> checkString(String str) {
        List<Function<String, Object>> checks = Arrays.asList(
            s -> s.chars().anyMatch(Character::isUpperCase) ? Boolean.TRUE : "String must have 1 upper case character.",
            s -> s.chars().anyMatch(Character::isLowerCase) ? Boolean.TRUE : "String must have 1 lower case character.",
            s -> s.chars().anyMatch(Character::isDigit)     ? Boolean.TRUE : "String must have 1 number.",
            s -> s.length() >= 7                           ? Boolean.TRUE : "String length should be atleast 8."
        );

        List<String> result = checks.stream()
            .map(check -> check.apply(str))
            .filter(x -> !Boolean.TRUE.equals(x))
            .map(Object::toString)
            .collect(Collectors.toList());

        if (result.isEmpty()) {
            result.add("Valid string.");
        }

        return result;
    }
}
