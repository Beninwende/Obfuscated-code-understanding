public class StringUtil {
    private static final int NO_OF_CHARS = 256;

    public static char[] strToList(String string) {
        return string.toCharArray();
    }

    public static String lstToString(char[] list) {
        return new String(list);
    }

    public static int[] getCharCountArray(String string) {
        int[] count = new int[NO_OF_CHARS];
        for (char c : string.toCharArray()) {
            count[c]++;
        }
        return count;
    }

    public static String removeDirtyChars(String string, String secondString) {
        int[] count = getCharCountArray(secondString);
        int ipInd = 0, resInd = 0;
        char[] strList = strToList(string);
        while (ipInd != strList.length) {
            char temp = strList[ipInd];
            if (count[temp] == 0) {
                strList[resInd++] = strList[ipInd];
            }
            ipInd++;
        }
        char[] result = new char[resInd];
        System.arraycopy(strList, 0, result, 0, resInd);
        return lstToString(result);
    }
}
