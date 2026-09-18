function longWords(n, str) {
  const wordLen = [];
  const txt = str.split(" ");
  for (const x of txt) {
    if (x.length > n) {
      wordLen.push(x);
    }
  }
  return wordLen;
}
