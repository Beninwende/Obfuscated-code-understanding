function secondSmallest(numbers) {
  if (!Array.isArray(numbers) || numbers.length < 2) {
    return;
  }
  if (numbers.length === 2 && numbers[0] === numbers[1]) {
    return;
  }
  const dupItems = new Set();
  const uniqItems = [];
  for (const x of numbers) {
    if (!dupItems.has(x)) {
      uniqItems.push(x);
      dupItems.add(x);
    }
  }
  uniqItems.sort((a, b) => a - b);
  return uniqItems[1];
}
