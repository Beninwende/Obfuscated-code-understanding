public class ArmstrongNumberChecker {
    public static boolean isArmstrong(int number) {
        int sum = 0;
        int digits = 0;
        int temp = number;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }
        temp = number;
        while (temp > 0) {
            int remainder = temp % 10;
            sum += (int) Math.pow(remainder, digits);
            temp /= 10;
        }
        return number == sum;
    }
}
