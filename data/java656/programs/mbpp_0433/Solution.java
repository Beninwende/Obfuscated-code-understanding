import java.util.Arrays;

public class Checker {
    public static String checkGreater(int[] arr, int number) {
        Arrays.sort(arr);
        if (number > arr[arr.length - 1]) {
            return "Yes, the entered number is greater than those in the array";
        } else {
            return "No, entered number is less than those in the array";
        }
    }
}
