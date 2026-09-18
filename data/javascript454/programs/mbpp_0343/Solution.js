function digLet(s) {
  let l = 0, d = 0;
  for (const c of s) {
    if (/\d/.test(c)) {
      d++;
    } else if (/[a-zA-Z]/.test(c)) {
      l++;
    }
  }
  return [l, d];
}
