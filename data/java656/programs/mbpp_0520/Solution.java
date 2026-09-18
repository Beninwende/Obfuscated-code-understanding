public class LCMCalculator {
    public static int findLcm(int num1, int num2) {
        int num, den;
        if (num1 > num2) {
            num = num1;
            den = num2;
        } else {
            num = num2;
            den = num1;
        }
        int rem = num % den;
        while (rem != 0) {
            num = den;
            den = rem;
            rem = num % den;
        }
        int gcd = den;
        return (num1 * num2) / gcd;
    }

    public static int getLcm(int[] l) {
        int lcm = findLcm(l[0], l[1]);
        for (int i = 2; i < l.length; i++) {
            lcm = findLcm(lcm, l[i]);
        }
        return lcm;
    }
}
