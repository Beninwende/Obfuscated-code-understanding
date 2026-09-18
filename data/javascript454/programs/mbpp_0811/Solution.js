function checkIdentical(list1, list2) {
  if (list1.length !== list2.length) return false;
  for (let i = 0; i < list1.length; i++) {
    const tuple1 = list1[i];
    const tuple2 = list2[i];
    if (!Array.isArray(tuple1) || !Array.isArray(tuple2) || tuple1.length !== tuple2.length) {
      return false;
    }
    for (let j = 0; j < tuple1.length; j++) {
      if (tuple1[j] !== tuple2[j]) {
        return false;
      }
    }
  }
  return true;
}
