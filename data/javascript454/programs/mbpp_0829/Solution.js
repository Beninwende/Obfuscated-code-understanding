function secondFrequent(arr) {
  const freq = {};
  arr.forEach(item => {
    freq[item] = (freq[item] || 0) + 1;
  });
  const values = Object.values(freq).sort((a, b) => b - a);
  const secondLarge = values[1];
  for (const key in freq) {
    if (freq[key] === secondLarge) {
      return key;
    }
  }
}
