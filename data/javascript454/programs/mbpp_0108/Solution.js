function mergeSortedList(num1, num2, num3) {
  num1 = num1.slice().sort((a, b) => a - b);
  num2 = num2.slice().sort((a, b) => a - b);
  num3 = num3.slice().sort((a, b) => a - b);
  const result = [];
  let i = 0, j = 0, k = 0;
  while (i < num1.length || j < num2.length || k < num3.length) {
    const candidates = [];
    if (i < num1.length) candidates.push({ val: num1[i], idx: 'i' });
    if (j < num2.length) candidates.push({ val: num2[j], idx: 'j' });
    if (k < num3.length) candidates.push({ val: num3[k], idx: 'k' });
    const min = candidates.reduce((prev, curr) => curr.val < prev.val ? curr : prev);
    result.push(min.val);
    if (min.idx === 'i') i++;
    else if (min.idx === 'j') j++;
    else k++;
  }
  return result;
}
