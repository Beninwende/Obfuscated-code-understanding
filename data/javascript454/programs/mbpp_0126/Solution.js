function sum(a, b) {
  let sum = 0;
  for (let i = 1; i < Math.min(a, b); i++) {
    if (a % i === 0 && b % i === 0) {
      sum += i;
    }
  }
  return sum;
}
