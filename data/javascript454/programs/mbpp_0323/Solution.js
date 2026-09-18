function rightRotate(arr, n, outOfPlace, cur) {
  let temp = arr[cur];
  for (let i = cur; i > outOfPlace; i--) {
    arr[i] = arr[i - 1];
  }
  arr[outOfPlace] = temp;
  return arr;
}

function reArrange(arr, n) {
  let outOfPlace = -1;
  for (let index = 0; index < n; index++) {
    if (outOfPlace >= 0) {
      if ((arr[index] >= 0 && arr[outOfPlace] < 0) ||
          (arr[index] < 0 && arr[outOfPlace] >= 0)) {
        arr = rightRotate(arr, n, outOfPlace, index);
        if (index - outOfPlace > 2) {
          outOfPlace += 2;
        } else {
          outOfPlace = -1;
        }
      }
    }
    if (outOfPlace === -1) {
      if ((arr[index] >= 0 && index % 2 === 0) ||
          (arr[index] < 0 && index % 2 === 1)) {
        outOfPlace = index;
      }
    }
  }
  return arr;
}
