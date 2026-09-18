public class DigitDistance {
    public static int digitDistanceNums(int n1, int n2) {
        int diff = Math.abs(n1 - n2);
        int sum = 0;
        for (char c : String.valueOf(diff).toCharArray()) {
            sum += c - '0';
        }
        return sum;
    }
}
