function getSum(n) {
  let sum = 0;
  for (let i = 1; i <= Math.sqrt(n); i++) {
    if (n % i === 0) {
      if (n / i === i) {
        sum += i;
      } else {
        sum += i;
        sum += n / i;
      }
    }
  }
  sum -= n;
  return sum;
}

function checkAbundant(n) {
  return getSum(n) > n;
}
