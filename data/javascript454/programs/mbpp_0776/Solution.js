function countVowels(testStr) {
  let res = 0;
  const vowels = ['a', 'e', 'i', 'o', 'u'];
  for (let i = 1; i < testStr.length - 1; i++) {
    if (
      !vowels.includes(testStr[i]) &&
      (vowels.includes(testStr[i - 1]) || vowels.includes(testStr[i + 1]))
    ) {
      res++;
    }
  }
  if (!vowels.includes(testStr[0]) && vowels.includes(testStr[1])) {
    res++;
  }
  if (
    !vowels.includes(testStr[testStr.length - 1]) &&
    vowels.includes(testStr[testStr.length - 2])
  ) {
    res++;
  }
  return res;
}
