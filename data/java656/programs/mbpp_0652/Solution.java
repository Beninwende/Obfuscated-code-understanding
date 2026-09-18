import java.util.*;

public class MatrixToList {
    public static String matrixToList(List<List<int[]>> testList) {
        List<int[]> temp = new ArrayList<>();
        for (List<int[]> sub : testList) {
            temp.addAll(sub);
        }
        if (temp.isEmpty()) {
            return "[]";
        }
        int tupleLen = temp.get(0).length;
        List<int[]> res = new ArrayList<>();
        for (int i = 0; i < tupleLen; i++) {
            int[] arr = new int[temp.size()];
            for (int j = 0; j < temp.size(); j++) {
                arr[j] = temp.get(j)[i];
            }
            res.add(arr);
        }
        return Arrays.deepToString(res.toArray());
    }
}
