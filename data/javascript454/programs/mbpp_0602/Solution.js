function firstRepeatedChar(str1) {
  for (let index = 0; index < str1.length; index++) {
    const c = str1[index];
    const substring = str1.slice(0, index + 1);
    const count = substring.split(c).length - 1;
    if (count > 1) {
      return c;
    }
  }
  return "None";
}
