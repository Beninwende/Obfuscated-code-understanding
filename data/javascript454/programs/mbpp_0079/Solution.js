function wordLen(s) {
  const words = s.split(' ');
  for (const word of words) {
    if (word.length % 2 !== 0) {
      return true;
    } else {
      return false;
    }
  }
}
