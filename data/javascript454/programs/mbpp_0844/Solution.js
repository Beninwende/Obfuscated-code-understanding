function getNumber(n, k) {
  const arr = new Array(n);
  let i = 0;
  let odd = 1;
  while (odd <= n) {
    arr[i] = odd;
    i++;
    odd += 2;
  }
  let even = 2;
  while (even <= n) {
    arr[i] = even;
    i++;
    even += 2;
  }
  return arr[k - 1];
}
