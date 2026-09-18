public class Main {
    public static Integer lossAmount(int actualCost, int saleAmount) {
        if (saleAmount > actualCost) {
            return saleAmount - actualCost;
        } else {
            return null;
        }
    }
}
