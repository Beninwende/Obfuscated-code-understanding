function check(string) {
  const p = new Set(string);
  if ((p.size === 2 && p.has('0') && p.has('1')) ||
      (p.size === 1 && (p.has('0') || p.has('1')))) {
    return "Yes";
  } else {
    return "No";
  }
}
