function findTripletArray(A, arrSize, sum) {
  for (let i = 0; i < arrSize - 2; i++) {
    for (let j = i + 1; j < arrSize - 1; j++) {
      for (let k = j + 1; k < arrSize; k++) {
        if (A[i] + A[j] + A[k] === sum) {
          return [A[i], A[j], A[k]];
        }
      }
    }
  }
  return false;
}
