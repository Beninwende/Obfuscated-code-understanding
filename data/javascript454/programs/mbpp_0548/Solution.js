function longestIncreasingSubsequence(arr) {
  const n = arr.length;
  const lis = new Array(n).fill(1);
  for (let i = 1; i < n; i++) {
    for (let j = 0; j < i; j++) {
      if (arr[i] > arr[j] && lis[i] < lis[j] + 1) {
        lis[i] = lis[j] + 1;
      }
    }
  }
  let maximum = 0;
  for (let i = 0; i < n; i++) {
    maximum = Math.max(maximum, lis[i]);
  }
  return maximum;
}
