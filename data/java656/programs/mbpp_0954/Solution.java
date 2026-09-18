public class ProfitCalculator {
    public static Integer profitAmount(int actualCost, int saleAmount) {
        if (actualCost > saleAmount) {
            int amount = actualCost - saleAmount;
            return amount;
        } else {
            return null;
        }
    }
}
