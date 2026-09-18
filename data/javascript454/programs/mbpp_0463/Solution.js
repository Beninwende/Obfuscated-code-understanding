function maxSubarrayProduct(arr) {
  let n = arr.length;
  let maxEndingHere = 1;
  let minEndingHere = 1;
  let maxSoFar = 0;
  let flag = 0;
  for (let i = 0; i < n; i++) {
    if (arr[i] > 0) {
      maxEndingHere = maxEndingHere * arr[i];
      minEndingHere = Math.min(minEndingHere * arr[i], 1);
      flag = 1;
    } else if (arr[i] === 0) {
      maxEndingHere = 1;
      minEndingHere = 1;
    } else {
      let temp = maxEndingHere;
      maxEndingHere = Math.max(minEndingHere * arr[i], 1);
      minEndingHere = temp * arr[i];
    }
    if (maxSoFar < maxEndingHere) {
      maxSoFar = maxEndingHere;
    }
  }
  if (flag === 0 && maxSoFar === 0) {
    return 0;
  }
  return maxSoFar;
}
