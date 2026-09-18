function last_occurence_char(string, char) {
  let flag = -1;
  for (let i = 0; i < string.length; i++) {
    if (string[i] === char) {
      flag = i;
    }
  }
  if (flag === -1) {
    return null;
  } else {
    return flag + 1;
  }
}
