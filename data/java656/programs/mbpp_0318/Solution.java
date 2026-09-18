public class MaxVolumeCuboid {
    public static int maxVolume(int s) {
        int maxValue = 0;
        for (int i = 0; i < s - 1; i++) {
            for (int j = 0; j < s; j++) {
                int k = s - i - j;
                maxValue = Math.max(maxValue, i * j * k);
            }
        }
        return maxValue;
    }
}
