public class LastOccurrence {
    public static Integer lastOccurrenceChar(String string, char ch) {
        int flag = -1;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ch) {
                flag = i;
            }
        }
        if (flag == -1) {
            return null;
        } else {
            return flag + 1;
        }
    }
}
