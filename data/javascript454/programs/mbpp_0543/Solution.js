function countDigits(num1, num2) {
  let number = num1 + num2;
  let count = 0;
  while (number > 0) {
    number = Math.floor(number / 10);
    count++;
  }
  return count;
}
