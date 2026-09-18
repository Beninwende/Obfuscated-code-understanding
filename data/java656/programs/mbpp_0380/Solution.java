public class MultiListGenerator {
    public static int[][] multiList(int rowNum, int colNum) {
        int[][] multiList = new int[rowNum][colNum];
        for (int row = 0; row < rowNum; row++) {
            for (int col = 0; col < colNum; col++) {
                multiList[row][col] = row * col;
            }
        }
        return multiList;
    }
}
