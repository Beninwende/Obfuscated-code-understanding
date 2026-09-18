function combineLists(num1, num2) {
  const merged = [];
  let i = 0, j = 0;
  while (i < num1.length && j < num2.length) {
    if (num1[i] < num2[j]) {
      merged.push(num1[i++]);
    } else {
      merged.push(num2[j++]);
    }
  }
  return merged.concat(num1.slice(i)).concat(num2.slice(j));
}
