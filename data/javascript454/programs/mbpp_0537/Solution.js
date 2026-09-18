function firstRepeatedWord(str1) {
  const temp = new Set();
  for (const word of str1.split(/\s+/)) {
    if (temp.has(word)) {
      return word;
    }
    temp.add(word);
  }
  return 'None';
}
