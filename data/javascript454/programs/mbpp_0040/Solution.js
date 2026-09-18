function freqElement(nums) {
  const counts = {};
  for (const sub of nums) {
    for (const item of sub) {
      counts[item] = (counts[item] || 0) + 1;
    }
  }
  return counts;
}
