function findFirstMissing(array, start, end) {
  if (start > end) {
    return end + 1;
  }
  if (start !== array[start]) {
    return start;
  }
  const mid = Math.floor((start + end) / 2);
  if (array[mid] === mid) {
    return findFirstMissing(array, mid + 1, end);
  }
  return findFirstMissing(array, start, mid);
}
