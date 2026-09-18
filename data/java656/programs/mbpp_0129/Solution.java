import java.util.*;

public class MagicSquare {
    public static boolean magicSquareTest(int[][] myMatrix) {
        int iSize = myMatrix[0].length;
        List<Integer> sumList = new ArrayList<>();
        for (int[] row : myMatrix) {
            int sum = 0;
            for (int val : row) sum += val;
            sumList.add(sum);
        }
        for (int col = 0; col < iSize; col++) {
            int sum = 0;
            for (int[] row : myMatrix) sum += row[col];
            sumList.add(sum);
        }
        int result1 = 0;
        for (int i = 0; i < iSize; i++) result1 += myMatrix[i][i];
        sumList.add(result1);
        int result2 = 0;
        for (int i = iSize - 1; i >= 0; i--) result2 += myMatrix[i][i];
        sumList.add(result2);
        return new HashSet<>(sumList).size() <= 1;
    }
}
