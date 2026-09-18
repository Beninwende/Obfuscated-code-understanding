public class Converter {
    public static String snakeToCamel(String word) {
        StringBuilder result = new StringBuilder();
        for (String part : word.split("_", -1)) {
            if (part.isEmpty()) {
                result.append("_");
            } else {
                result.append(Character.toUpperCase(part.charAt(0)));
                if (part.length() > 1) {
                    result.append(part.substring(1).toLowerCase());
                }
            }
        }
        return result.toString();
    }
}
