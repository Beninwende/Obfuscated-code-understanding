public class Solution {
    public static String countBidirectional(int[][] testList) {
        int res = 0;
        for (int idx = 0; idx < testList.length; idx++) {
            for (int iidx = idx + 1; iidx < testList.length; iidx++) {
                if (testList[iidx][0] == testList[idx][1] && testList[idx][1] == testList[iidx][0]) {
                    res++;
                }
            }
        }
        return String.valueOf(res);
    }
}
