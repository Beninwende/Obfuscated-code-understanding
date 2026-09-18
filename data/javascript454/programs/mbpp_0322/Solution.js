function positionMin(list1) {
  const minVal = Math.min(...list1);
  const minResult = [];
  list1.forEach((value, index) => {
    if (value === minVal) {
      minResult.push(index);
    }
  });
  return minResult;
}
