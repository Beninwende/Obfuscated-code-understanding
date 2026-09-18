function mostOccurrences(testList) {
  const temp = {};
  testList.forEach(sub => {
    sub.split(/\s+/).forEach(wrd => {
      temp[wrd] = (temp[wrd] || 0) + 1;
    });
  });
  let maxWord = null;
  let maxCount = 0;
  for (const wrd in temp) {
    if (temp[wrd] > maxCount) {
      maxCount = temp[wrd];
      maxWord = wrd;
    }
  }
  return maxWord;
}
