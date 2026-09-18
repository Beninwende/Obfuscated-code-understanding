import java.util.Map;
import java.util.HashMap;

public class RomanConverter {
    public static int romanToInt(String s) {
        Map<Character, Integer> romVal = new HashMap<>();
        romVal.put('I', 1);
        romVal.put('V', 5);
        romVal.put('X', 10);
        romVal.put('L', 50);
        romVal.put('C', 100);
        romVal.put('D', 500);
        romVal.put('M', 1000);
        int intVal = 0;
        for (int i = 0; i < s.length(); i++) {
            int curr = romVal.get(s.charAt(i));
            if (i > 0) {
                int prev = romVal.get(s.charAt(i - 1));
                if (curr > prev) {
                    intVal += curr - 2 * prev;
                    continue;
                }
            }
            intVal += curr;
        }
        return intVal;
    }
}
