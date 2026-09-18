function check_K(test_tup, K) {
  let res = false;
  for (const ele of test_tup) {
    if (ele === K) {
      res = true;
      break;
    }
  }
  return res;
}
