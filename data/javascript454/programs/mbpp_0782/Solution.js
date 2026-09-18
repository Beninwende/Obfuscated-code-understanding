function oddLengthSum(arr) {
  let sum = 0;
  const l = arr.length;
  for (let i = 0; i < l; i++) {
    sum += Math.floor(((i + 1) * (l - i) + 1) / 2) * arr[i];
  }
  return sum;
}
