function decimalToBinary(N) {
  let B_Number = 0;
  let cnt = 0;
  while (N !== 0) {
    const rem = N % 2;
    const c = Math.pow(10, cnt);
    B_Number += rem * c;
    N = Math.floor(N / 2);
    cnt += 1;
  }
  return B_Number;
}
