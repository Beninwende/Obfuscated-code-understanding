function getMedian(arr1, arr2, n) {
  let i = 0;
  let j = 0;
  let m1 = -1;
  let m2 = -1;
  let count = 0;
  while (count < n + 1) {
    count++;
    if (i === n) {
      m1 = m2;
      m2 = arr2[0];
      break;
    } else if (j === n) {
      m1 = m2;
      m2 = arr1[0];
      break;
    }
    if (arr1[i] <= arr2[j]) {
      m1 = m2;
      m2 = arr1[i];
      i++;
    } else {
      m1 = m2;
      m2 = arr2[j];
      j++;
    }
  }
  return (m1 + m2) / 2;
}
