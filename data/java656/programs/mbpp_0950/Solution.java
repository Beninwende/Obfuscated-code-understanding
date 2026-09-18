public class ChineseZodiac {
    public static String chineseZodiac(int year) {
        int index = (year - 2000) % 12;
        if (index < 0) {
            index += 12;
        }
        String[] signs = {
            "Dragon", "Snake", "Horse", "sheep",
            "Monkey", "Rooster", "Dog", "Pig",
            "Rat", "Ox", "Tiger", "Hare"
        };
        return signs[index];
    }
}
