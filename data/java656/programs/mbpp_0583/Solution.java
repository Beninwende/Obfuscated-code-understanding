public class Catalan {
    public static long catalanNumber(int num) {
        if (num <= 1) {
            return 1;
        }
        long res = 0;
        for (int i = 0; i < num; i++) {
            res += catalanNumber(i) * catalanNumber(num - i - 1);
        }
        return res;
    }
}
