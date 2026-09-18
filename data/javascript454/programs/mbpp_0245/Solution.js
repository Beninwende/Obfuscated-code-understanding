function maxSum(arr, n) {
  const MSIBS = arr.slice();
  for (let i = 0; i < n; i++) {
    for (let j = 0; j < i; j++) {
      if (arr[i] > arr[j] && MSIBS[i] < MSIBS[j] + arr[i]) {
        MSIBS[i] = MSIBS[j] + arr[i];
      }
    }
  }

  const MSDBS = arr.slice();
  for (let i = 1; i <= n; i++) {
    const idxI = n - i;
    for (let j = 1; j < i; j++) {
      const idxJ = n - j;
      if (arr[idxI] > arr[idxJ] && MSDBS[idxI] < MSDBS[idxJ] + arr[idxI]) {
        MSDBS[idxI] = MSDBS[idxJ] + arr[idxI];
      }
    }
  }

  let maxSum = -Infinity;
  for (let i = 0; i < n; i++) {
    const sum = MSIBS[i] + MSDBS[i] - arr[i];
    if (sum > maxSum) {
      maxSum = sum;
    }
  }
  return maxSum;
}
