function findLength(string, n) {
  let currentSum = 0;
  let maxSum = 0;
  for (let i = 0; i < n; i++) {
    currentSum += string[i] === '0' ? 1 : -1;
    if (currentSum < 0) {
      currentSum = 0;
    }
    maxSum = Math.max(currentSum, maxSum);
  }
  return maxSum;
}
