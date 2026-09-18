function countBidirectional(testList) {
  let res = 0;
  for (let idx = 0; idx < testList.length; idx++) {
    for (let iidx = idx + 1; iidx < testList.length; iidx++) {
      if (
        testList[iidx][0] === testList[idx][1] &&
        testList[idx][1] === testList[iidx][0]
      ) {
        res++;
      }
    }
  }
  return res.toString();
}
