public class DecimalToOctal {
    public static int decimalToOctal(int deciNum) {
        int octalNum = 0;
        int countval = 1;
        int dNo = deciNum;
        while (deciNum != 0) {
            int remainder = deciNum % 8;
            octalNum += remainder * countval;
            countval *= 10;
            deciNum /= 8;
        }
        return octalNum;
    }
}
