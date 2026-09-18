public class Main {
    public static int rev(int num) {
        int revNum = 0;
        while (num > 0) {
            revNum = revNum * 10 + num % 10;
            num /= 10;
        }
        return revNum;
    }

    public static boolean check(int n) {
        return 2 * rev(n) == n + 1;
    }
}
