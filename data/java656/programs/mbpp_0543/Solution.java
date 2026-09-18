public class CountDigits {
    public static int countDigits(int num1, int num2) {
        int number = num1 + num2;
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
