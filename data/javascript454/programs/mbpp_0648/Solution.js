function exchangeElements(arr) {
  const odd = [];
  const even = [];
  for (let i = 0; i < arr.length; i++) {
    if (i % 2 === 1) {
      odd.push(arr[i]);
    } else {
      even.push(arr[i]);
    }
  }
  const result = [];
  const maxLen = Math.max(odd.length, even.length);
  for (let i = 0; i < maxLen; i++) {
    result.push(i < odd.length ? odd[i] : null);
    result.push(i < even.length ? even[i] : null);
  }
  return result;
}
