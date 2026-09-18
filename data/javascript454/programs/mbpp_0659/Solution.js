function Repeat(x) {
  const size = x.length;
  const repeated = [];
  for (let i = 0; i < size; i++) {
    const k = i + 1;
    for (let j = k; j < size; j++) {
      if (x[i] === x[j] && !repeated.includes(x[i])) {
        repeated.push(x[i]);
      }
    }
  }
  return repeated;
}
