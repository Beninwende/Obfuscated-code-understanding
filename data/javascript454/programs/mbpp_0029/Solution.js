function getOddOccurrence(arr, arrSize) {
  for (let i = 0; i < arrSize; i++) {
    let count = 0;
    for (let j = 0; j < arrSize; j++) {
      if (arr[i] === arr[j]) {
        count++;
      }
    }
    if (count % 2 !== 0) {
      return arr[i];
    }
  }
  return -1;
}
