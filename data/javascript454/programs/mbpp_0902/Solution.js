function addDict(d1, d2) {
  const result = {};
  for (const [key, value] of Object.entries(d1)) {
    result[key] = value;
  }
  for (const [key, value] of Object.entries(d2)) {
    result[key] = (result[key] || 0) + value;
  }
  return result;
}
