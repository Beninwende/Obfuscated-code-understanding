public class MonthUtil {
    public static boolean checkMonthNumb(String monthName) {
        switch (monthName) {
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                return true;
            default:
                return false;
        }
    }
}
