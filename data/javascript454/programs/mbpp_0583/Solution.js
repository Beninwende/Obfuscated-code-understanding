function catalanNumber(num) {
  if (num <= 1) {
    return 1;
  }
  let resNum = 0;
  for (let i = 0; i < num; i++) {
    resNum += catalanNumber(i) * catalanNumber(num - i - 1);
  }
  return resNum;
}
