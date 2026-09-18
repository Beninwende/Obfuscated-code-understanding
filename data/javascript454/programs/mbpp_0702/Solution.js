function find_ind(key, i, n, k, arr) {
  let ind = -1;
  let start = i + 1;
  let end = n - 1;
  while (start < end) {
    let mid = Math.floor(start + (end - start) / 2);
    if (arr[mid] - key <= k) {
      ind = mid;
      start = mid + 1;
    } else {
      end = mid;
    }
  }
  return ind;
}

function removals(arr, n, k) {
  let ans = n - 1;
  arr.sort((a, b) => a - b);
  for (let i = 0; i < n; i++) {
    const j = find_ind(arr[i], i, n, k, arr);
    if (j !== -1) {
      ans = Math.min(ans, n - (j - i + 1));
    }
  }
  return ans;
}
