function sumOfAlternates(arr) {
  let sum1 = 0;
  let sum2 = 0;
  arr.forEach((ele, idx) => {
    if (idx % 2) {
      sum1 += ele;
    } else {
      sum2 += ele;
    }
  });
  return [sum1, sum2];
}
