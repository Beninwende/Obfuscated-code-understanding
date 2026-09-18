function averageEven(n) {
  if (n % 2 !== 0) {
    return "Invalid Input";
  }
  let sum = 0;
  let count = 0;
  while (n >= 2) {
    count++;
    sum += n;
    n -= 2;
  }
  return Math.floor(sum / count);
}
