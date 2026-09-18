function count_With_Odd_SetBits(n) {
  if (n % 2 !== 0) {
    return (n + 1) >> 1;
  }
  const count = (n.toString(2).match(/1/g) || []).length;
  let ans = n >> 1;
  if (count % 2 !== 0) {
    ans++;
  }
  return ans;
}
