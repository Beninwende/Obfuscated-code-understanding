function factorial(start, end) {
  let res = 1;
  for (let i = start; i <= end; i++) {
    res *= i;
  }
  return res;
}

function sumOfSquare(n) {
  return Math.floor(factorial(n + 1, 2 * n) / factorial(1, n));
}
