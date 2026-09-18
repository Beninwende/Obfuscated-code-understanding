function getMaxOccuringChar(str1) {
  const ASCII_SIZE = 256;
  const ctr = Array(ASCII_SIZE).fill(0);
  let max = -1;
  let ch = '';
  for (let i = 0; i < str1.length; i++) {
    ctr[str1.charCodeAt(i)]++;
  }
  for (let i = 0; i < str1.length; i++) {
    if (ctr[str1.charCodeAt(i)] > max) {
      max = ctr[str1.charCodeAt(i)];
      ch = str1[i];
    }
  }
  return ch;
}
