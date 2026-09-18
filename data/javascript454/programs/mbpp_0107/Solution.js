function countHexadecimal(L, R) {
  let count = 0;
  for (let i = L; i <= R; i++) {
    if (i >= 10 && i <= 15) {
      count++;
    } else if (i > 15) {
      let k = i;
      while (k !== 0) {
        if (k % 16 >= 10) {
          count++;
        }
        k = Math.floor(k / 16);
      }
    }
  }
  return count;
}
