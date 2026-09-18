function negCount(arr) {
  let count = 0;
  for (const num of arr) {
    if (num <= 0) {
      count++;
    }
  }
  return count;
}
