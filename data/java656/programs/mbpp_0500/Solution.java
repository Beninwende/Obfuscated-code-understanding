import java.util.List;

public class Concatenator {
    public static String concatenateElements(List<String> list) {
        StringBuilder ans = new StringBuilder(" ");
        for (String element : list) {
            ans.append(" ").append(element);
        }
        return ans.toString();
    }
}
