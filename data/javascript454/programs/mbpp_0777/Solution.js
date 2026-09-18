function findSum(arr, n) {
  arr.sort((a, b) => a - b);
  let sum = arr[0];
  for (let i = 0; i < n - 1; i++) {
    if (arr[i] !== arr[i + 1]) {
      sum += arr[i + 1];
    }
  }
  return sum;
}
