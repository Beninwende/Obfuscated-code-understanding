public class Solution {
    public static String binaryToInteger(int[] testTup) {
        StringBuilder sb = new StringBuilder();
        for (int ele : testTup) {
            sb.append(ele);
        }
        int res = Integer.parseInt(sb.toString(), 2);
        return String.valueOf(res);
    }
}
