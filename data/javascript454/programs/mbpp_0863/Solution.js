function findLongestConseqSubseq(arr, n) {
  let ans = 0;
  let count = 0;
  arr.sort((a, b) => a - b);
  const v = [];
  v.push(arr[0]);
  for (let i = 1; i < n; i++) {
    if (arr[i] !== arr[i - 1]) {
      v.push(arr[i]);
    }
  }
  for (let i = 0; i < v.length; i++) {
    if (i > 0 && v[i] === v[i - 1] + 1) {
      count += 1;
    } else {
      count = 1;
    }
    ans = Math.max(ans, count);
  }
  return ans;
}
