import java.util.List;

public class SampleNam {
    public static int sampleNam(List<String> sampleNames) {
        int totalLength = 0;
        for (String s : sampleNames) {
            if (s.length() > 1 && Character.isUpperCase(s.charAt(0))) {
                boolean allLower = true;
                for (int i = 1; i < s.length(); i++) {
                    if (!Character.isLowerCase(s.charAt(i))) {
                        allLower = false;
                        break;
                    }
                }
                if (allLower) {
                    totalLength += s.length();
                }
            }
        }
        return totalLength;
    }
}
