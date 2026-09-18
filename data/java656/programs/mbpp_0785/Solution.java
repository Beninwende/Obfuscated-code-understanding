public class TupleConverter {
    public static int[] tupleStrInt(String testStr) {
        String cleaned = testStr.replace("(", "")
                                .replace(")", "")
                                .replace("...", "");
        String[] parts = cleaned.split(", ");
        int[] res = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            res[i] = Integer.parseInt(parts[i]);
        }
        return res;
    }
}
