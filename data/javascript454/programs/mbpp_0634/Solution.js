function evenPowerSum(n) {
  let sum = 0;
  for (let i = 1; i <= n; i++) {
    let j = 2 * i;
    sum += Math.pow(j, 4);
  }
  return sum;
}
