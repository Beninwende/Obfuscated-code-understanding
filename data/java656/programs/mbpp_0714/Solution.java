public class Main {
    public static int countFac(int n) {
        int m = n;
        int count = 0;
        int i = 2;
        while (i * i <= m) {
            int total = 0;
            while (n % i == 0) {
                n /= i;
                total++;
            }
            int temp = 0;
            int j = 1;
            while (temp + j <= total) {
                temp += j;
                count++;
                j++;
            }
            i++;
        }
        if (n != 1) {
            count++;
        }
        return count;
    }
}
