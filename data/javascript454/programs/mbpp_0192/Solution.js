function checkString(str) {
  let flagL = false;
  let flagN = false;
  for (const i of str) {
    if (/[A-Za-z]/.test(i)) flagL = true;
    if (/\d/.test(i)) flagN = true;
  }
  return flagL && flagN;
}
