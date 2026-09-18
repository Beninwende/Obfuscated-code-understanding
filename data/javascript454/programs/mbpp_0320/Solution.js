function sumDifference(n) {
  let sumOfSquares = 0;
  let squareOfSum = 0;
  for (let num = 1; num <= n; num++) {
    sumOfSquares += num * num;
    squareOfSum += num;
  }
  squareOfSum = squareOfSum ** 2;
  return squareOfSum - sumOfSquares;
}
