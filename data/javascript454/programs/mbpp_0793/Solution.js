function last(arr, x, n) {
  let low = 0;
  let high = n - 1;
  let res = -1;
  while (low <= high) {
    const mid = Math.floor((low + high) / 2);
    if (arr[mid] > x) {
      high = mid - 1;
    } else if (arr[mid] < x) {
      low = mid + 1;
    } else {
      res = mid;
      low = mid + 1;
    }
  }
  return res;
}
