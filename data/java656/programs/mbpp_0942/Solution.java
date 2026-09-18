import java.util.List;

public class Checker {
    public static <T> boolean checkElement(List<T> testList, List<T> checkList) {
        for (T ele : checkList) {
            if (testList.contains(ele)) {
                return true;
            }
        }
        return false;
    }
}
