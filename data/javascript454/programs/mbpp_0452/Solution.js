function lossAmount(actualCost, saleAmount) {
  if (saleAmount > actualCost) {
    const amount = saleAmount - actualCost;
    return amount;
  } else {
    return null;
  }
}
