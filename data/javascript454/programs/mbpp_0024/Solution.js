function binaryToDecimal(binary) {
  let decimal = 0;
  let i = 0;
  while (binary !== 0) {
    const dec = binary % 10;
    decimal += dec * Math.pow(2, i);
    binary = Math.floor(binary / 10);
    i++;
  }
  return decimal;
}
