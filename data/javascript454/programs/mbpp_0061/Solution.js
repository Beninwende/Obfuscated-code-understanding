function countSubstrings(s, n) {
  let count = 0;
  let sum = 0;
  const mp = {};
  mp[0] = 1;
  for (let i = 0; i < n; i++) {
    sum += parseInt(s[i], 10);
    const key = sum - (i + 1);
    if (mp[key] === undefined) {
      mp[key] = 0;
    }
    count += mp[key];
    mp[key]++;
  }
  return count;
}
