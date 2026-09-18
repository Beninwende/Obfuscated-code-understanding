public class Demlo {
    public static String findDemlo(String s) {
        int l = s.length();
        StringBuilder res = new StringBuilder();
        for (int i = 1; i <= l; i++) {
            res.append(i);
        }
        for (int i = l - 1; i >= 1; i--) {
            res.append(i);
        }
        return res.toString();
    }
}
