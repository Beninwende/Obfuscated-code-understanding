public class Array3DGenerator {
    public static String[][][] array3d(int m, int n, int o) {
        String[][][] array = new String[o][n][m];
        for (int i = 0; i < o; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    array[i][j][k] = "*";
                }
            }
        }
        return array;
    }
}
