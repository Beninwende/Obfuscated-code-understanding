function charFrequency(str1) {
  const freq = {};
  for (const char of str1) {
    if (freq[char]) {
      freq[char] += 1;
    } else {
      freq[char] = 1;
    }
  }
  return freq;
}
