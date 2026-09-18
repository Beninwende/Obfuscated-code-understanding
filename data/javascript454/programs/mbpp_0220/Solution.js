function replaceMaxSpecialChar(text, n) {
  let count = 0;
  return text.replace(/[ ,\.]/g, match => {
    if (count < n) {
      count++;
      return ':';
    }
    return match;
  });
}
