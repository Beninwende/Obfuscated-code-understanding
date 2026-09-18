public class Converter {
    public static int[] strToTuple(String testStr) {
        String[] parts = testStr.split(", ");
        int[] res = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            res[i] = Integer.parseInt(parts[i]);
        }
        return res;
    }
}
