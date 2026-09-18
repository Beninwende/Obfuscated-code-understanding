function isSublist(l, s) {
  let subSet = false;
  if (s.length === 0) {
    subSet = true;
  } else if (s.length === l.length && l.every((v, i) => v === s[i])) {
    subSet = true;
  } else if (s.length > l.length) {
    subSet = false;
  } else {
    for (let i = 0; i < l.length; i++) {
      if (l[i] === s[0]) {
        let n = 1;
        while (n < s.length && l[i + n] === s[n]) {
          n++;
        }
        if (n === s.length) {
          subSet = true;
        }
      }
    }
  }
  return subSet;
}
