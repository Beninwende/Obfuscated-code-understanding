function count_occurance(s) {
  let count = 0;
  for (let i = 0; i < s.length; i++) {
    if (s[i] === 's' && s[i+1] === 't' && s[i+2] === 'd') {
      count++;
    }
  }
  return count;
}
