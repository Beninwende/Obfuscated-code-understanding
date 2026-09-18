public class SeasonFinder {
    public static String monthSeason(String month, int days) {
        String season;
        if (month.equals("January") || month.equals("February") || month.equals("March")) {
            season = "winter";
        } else if (month.equals("April") || month.equals("May") || month.equals("June")) {
            season = "spring";
        } else if (month.equals("July") || month.equals("August") || month.equals("September")) {
            season = "summer";
        } else {
            season = "autumn";
        }
        if (month.equals("March") && days > 19) {
            season = "spring";
        } else if (month.equals("June") && days > 20) {
            season = "summer";
        } else if (month.equals("September") && days > 21) {
            season = "autumn";
        } else if (month.equals("October") && days > 21) {
            season = "autumn";
        } else if (month.equals("November") && days > 21) {
            season = "autumn";
        } else if (month.equals("December") && days > 20) {
            season = "winter";
        }
        return season;
    }
}
