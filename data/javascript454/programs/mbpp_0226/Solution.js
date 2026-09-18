function oddValuesString(str) {
  let result = "";
  for (let i = 0; i < str.length; i++) {
    if (i % 2 === 0) {
      result += str[i];
    }
  }
  return result;
}
