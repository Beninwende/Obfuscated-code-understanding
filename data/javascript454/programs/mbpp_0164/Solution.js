function divSum(n) {
  let sum = 1;
  let i = 2;
  while (i * i <= n) {
    if (n % i === 0) {
      sum += i + Math.floor(n / i);
    }
    i++;
  }
  return sum;
}

function areEquivalent(num1, num2) {
  return divSum(num1) === divSum(num2);
}
