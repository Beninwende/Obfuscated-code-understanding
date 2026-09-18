function lbs(arr) {
  const n = arr.length;
  const lis = new Array(n).fill(1);
  for (let i = 1; i < n; i++) {
    for (let j = 0; j < i; j++) {
      if (arr[i] > arr[j] && lis[i] < lis[j] + 1) {
        lis[i] = lis[j] + 1;
      }
    }
  }
  const lds = new Array(n).fill(1);
  for (let i = n - 2; i >= 0; i--) {
    for (let j = n - 1; j > i; j--) {
      if (arr[i] > arr[j] && lds[i] < lds[j] + 1) {
        lds[i] = lds[j] + 1;
      }
    }
  }
  let maximum = lis[0] + lds[0] - 1;
  for (let i = 1; i < n; i++) {
    maximum = Math.max(lis[i] + lds[i] - 1, maximum);
  }
  return maximum;
}
