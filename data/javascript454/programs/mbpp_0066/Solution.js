function posCount(list) {
  let posCount = 0;
  for (const num of list) {
    if (num >= 0) {
      posCount++;
    }
  }
  return posCount;
}
