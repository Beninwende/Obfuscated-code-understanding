function removeEven(str1) {
  let str2 = '';
  for (let i = 1; i <= str1.length; i++) {
    if (i % 2 !== 0) {
      str2 += str1[i - 1];
    }
  }
  return str2;
}
