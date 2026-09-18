function findDemlo(s) {
  const l = s.length;
  let res = '';
  for (let i = 1; i <= l; i++) {
    res += i.toString();
  }
  for (let i = l - 1; i > 0; i--) {
    res += i.toString();
  }
  return res;
}
