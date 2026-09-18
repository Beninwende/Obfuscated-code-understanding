const MAX = 1000;
function replaceSpaces(str) {
  str = str.trim();
  const i = str.length;
  const spaceCount = (str.match(/ /g) || []).length;
  const newLength = i + spaceCount * 2;
  if (newLength > MAX) return -1;
  let index = newLength - 1;
  const arr = str.split('');
  for (let f = i - 2; f < newLength - 2; f++) {
    arr.push('0');
  }
  for (let j = i - 1; j > 0; j--) {
    if (arr[j] === ' ') {
      arr[index] = '0';
      arr[index - 1] = '2';
      arr[index - 2] = '%';
      index -= 3;
    } else {
      arr[index] = arr[j];
      index--;
    }
  }
  return arr.join('');
}
