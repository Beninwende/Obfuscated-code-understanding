function validate(n) {
  for (let i = 0; i <= 9; i++) {
    let temp = n;
    let count = 0;
    while (temp) {
      if (temp % 10 === i) {
        count++;
      }
      if (count > i) {
        return false;
      }
      temp = Math.floor(temp / 10);
    }
  }
  return true;
}
