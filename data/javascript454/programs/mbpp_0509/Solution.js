function averageOdd(n) {
  if (n % 2 === 0) {
    return "Invalid Input";
  }
  let sm = 0;
  let count = 0;
  while (n >= 1) {
    count++;
    sm += n;
    n -= 2;
  }
  return Math.floor(sm / count);
}
