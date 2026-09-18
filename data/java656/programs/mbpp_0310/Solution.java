import java.util.ArrayList;
import java.util.List;

public class StringConverter {
    public static Character[] stringToTuple(String str) {
        List<Character> list = new ArrayList<>();
        for (char c : str.toCharArray()) {
            if (!Character.isWhitespace(c)) {
                list.add(c);
            }
        }
        return list.toArray(new Character[0]);
    }
}
