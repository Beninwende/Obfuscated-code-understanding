function countX(tup, x) {
  let count = 0;
  for (const ele of tup) {
    if (ele === x) {
      count++;
    }
  }
  return count;
}
