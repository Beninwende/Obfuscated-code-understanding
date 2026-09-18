function equilibriumIndex(arr) {
  let totalSum = arr.reduce((acc, curr) => acc + curr, 0);
  let leftSum = 0;
  for (let i = 0; i < arr.length; i++) {
    totalSum -= arr[i];
    if (leftSum === totalSum) {
      return i;
    }
    leftSum += arr[i];
  }
  return -1;
}
