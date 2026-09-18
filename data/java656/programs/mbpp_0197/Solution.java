public class Exponentiation {
    public static double[] findExponentio(double[] testTup1, double[] testTup2) {
        int length = Math.min(testTup1.length, testTup2.length);
        double[] res = new double[length];
        for (int i = 0; i < length; i++) {
            res[i] = Math.pow(testTup1[i], testTup2[i]);
        }
        return res;
    }
}
