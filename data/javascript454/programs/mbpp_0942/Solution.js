function checkElement(testTup, checkList) {
  let res = false;
  for (const ele of checkList) {
    if (testTup.includes(ele)) {
      res = true;
      break;
    }
  }
  return res;
}
