function profitAmount(actualCost, saleAmount) {
    if (actualCost > saleAmount) {
        const amount = actualCost - saleAmount;
        return amount;
    } else {
        return null;
    }
}
