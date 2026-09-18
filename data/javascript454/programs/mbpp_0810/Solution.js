function countVariable(a, b, c, d) {
  const counts = { p: a, q: b, r: c, s: d };
  const result = [];
  for (const [key, count] of Object.entries(counts)) {
    for (let i = 0; i < count; i++) {
      result.push(key);
    }
  }
  return result;
}
