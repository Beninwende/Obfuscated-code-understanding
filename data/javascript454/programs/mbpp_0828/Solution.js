function countAlphaDigSpl(str) {
  let alphabets = 0, digits = 0, special = 0;
  for (let i = 0; i < str.length; i++) {
    const ch = str[i];
    if (/[A-Za-z]/.test(ch)) {
      alphabets++;
    } else if (/[0-9]/.test(ch)) {
      digits++;
    } else {
      special++;
    }
  }
  return [alphabets, digits, special];
}
