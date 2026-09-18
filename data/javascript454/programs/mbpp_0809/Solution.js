function checkSmaller(testTup1, testTup2) {
  const len = Math.min(testTup1.length, testTup2.length);
  for (let i = 0; i < len; i++) {
    if (!(testTup1[i] > testTup2[i])) {
      return false;
    }
  }
  return true;
}
