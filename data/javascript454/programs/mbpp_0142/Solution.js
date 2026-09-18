function countSamePair(list1, list2, list3) {
  let result = 0;
  const length = Math.min(list1.length, list2.length, list3.length);
  for (let i = 0; i < length; i++) {
    if (list1[i] === list2[i] && list2[i] === list3[i]) {
      result++;
    }
  }
  return result;
}
