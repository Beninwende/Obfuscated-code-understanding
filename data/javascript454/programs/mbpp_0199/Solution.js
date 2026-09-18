function highestPowerOf2(n) {
  let res = 0;
  for (let i = n; i > 0; i--) {
    if ((i & (i - 1)) === 0) {
      res = i;
      break;
    }
  }
  return res;
}
