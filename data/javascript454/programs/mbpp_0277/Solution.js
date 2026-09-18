function dictFilter(obj, n) {
  const result = {};
  for (const [key, value] of Object.entries(obj)) {
    if (value >= n) {
      result[key] = value;
    }
  }
  return result;
}
