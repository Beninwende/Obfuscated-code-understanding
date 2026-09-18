function removeDuplicate(string) {
  const words = string.split(/\s+/);
  const seen = new Set();
  const result = [];
  for (const word of words) {
    if (!seen.has(word)) {
      seen.add(word);
      result.push(word);
    }
  }
  return result.join(' ');
}
