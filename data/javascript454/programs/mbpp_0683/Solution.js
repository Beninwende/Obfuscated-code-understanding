function sumSquare(n) {
  for (let i = 1; i * i <= n; i++) {
    for (let j = 1; j * j <= n; j++) {
      if (i * i + j * j === n) {
        return true;
      }
    }
  }
  return false;
}
