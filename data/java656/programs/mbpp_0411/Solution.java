public class StringUtils {
    public static String snakeToCamel(String word) {
        StringBuilder result = new StringBuilder();
        for (String x : word.split("_")) {
            if (!x.isEmpty()) {
                result.append(Character.toUpperCase(x.charAt(0)));
                if (x.length() > 1) {
                    result.append(x.substring(1));
                }
            } else {
                result.append("_");
            }
        }
        return result.toString();
    }
}
