public class BitwiseXor {
    public static int[] bitwiseXor(int[] tuple1, int[] tuple2) {
        int length = Math.min(tuple1.length, tuple2.length);
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = tuple1[i] ^ tuple2[i];
        }
        return result;
    }
}
