function moveNum(testStr) {
  let res = '';
  let dig = '';
  for (const ele of testStr) {
    if (/\d/.test(ele)) {
      dig += ele;
    } else {
      res += ele;
    }
  }
  return res + dig;
}
