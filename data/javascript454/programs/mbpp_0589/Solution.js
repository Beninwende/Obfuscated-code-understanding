function perfectSquares(a, b) {
  const result = [];
  for (let i = a; i <= b; i++) {
    let j = 1;
    while (j * j <= i) {
      if (j * j === i) {
        result.push(i);
      }
      j++;
    }
  }
  return result;
}
