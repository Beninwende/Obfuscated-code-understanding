function combinationsWithReplacement(arr, n, start = 0) {
  if (n === 0) return [[]];
  const result = [];
  for (let i = start; i < arr.length; i++) {
    for (const tail of combinationsWithReplacement(arr, n - 1, i)) {
      result.push([arr[i], ...tail]);
    }
  }
  return result;
}

function combinationsColors(l, n) {
  return combinationsWithReplacement(l, n);
}
