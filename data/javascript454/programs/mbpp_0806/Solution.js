function maxRunUppercase(testStr) {
  let cnt = 0;
  let res = 0;
  for (let idx = 0; idx < testStr.length; idx++) {
    if (/[A-Z]/.test(testStr[idx])) {
      cnt++;
    } else {
      res = cnt;
      cnt = 0;
    }
  }
  if (/[A-Z]/.test(testStr[testStr.length - 1])) {
    res = cnt;
  }
  return res;
}
