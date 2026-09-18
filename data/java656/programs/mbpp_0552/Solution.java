public class SequenceUtils {
    public static String seqLinear(int[] seqNums) {
        if (seqNums == null || seqNums.length < 2) {
            return "Non Linear Sequence";
        }
        int diff = seqNums[1] - seqNums[0];
        for (int i = 2; i < seqNums.length; i++) {
            if (seqNums[i] - seqNums[i - 1] != diff) {
                return "Non Linear Sequence";
            }
        }
        return "Linear Sequence";
    }
}
