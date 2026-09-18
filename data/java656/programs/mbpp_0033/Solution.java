public class DecimalToBinary {
    public static long decimalToBinary(int N) {
        long bNumber = 0;
        int cnt = 0;
        while (N != 0) {
            int rem = N % 2;
            long c = (long)Math.pow(10, cnt);
            bNumber += rem * c;
            N /= 2;
            cnt++;
        }
        return bNumber;
    }
}
