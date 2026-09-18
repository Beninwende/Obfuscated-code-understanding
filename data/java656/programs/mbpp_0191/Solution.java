public class MonthUtils {
    public static boolean checkMonthNumber(String monthName) {
        if (monthName.equals("April") || monthName.equals("June") || monthName.equals("September") || monthName.equals("November")) {
            return true;
        } else {
            return false;
        }
    }
}
