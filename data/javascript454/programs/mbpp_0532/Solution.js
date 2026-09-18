function checkPermutation(str1, str2) {
  const n1 = str1.length;
  const n2 = str2.length;
  if (n1 !== n2) {
    return false;
  }
  const a = str1.split('').sort();
  str1 = a.join('');
  const b = str2.split('').sort();
  str2 = b.join('');
  for (let i = 0; i < n1; i++) {
    if (str1[i] !== str2[i]) {
      return false;
    }
  }
  return true;
}
