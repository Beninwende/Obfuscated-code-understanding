function rearangeString(S) {
  const count = {};
  for (const ch of S) {
    count[ch] = (count[ch] || 0) + 1;
  }
  const heap = [];
  for (const ch in count) {
    heap.push({ ch, count: count[ch] });
  }
  const n = S.length;
  let maxCount = 0;
  for (const item of heap) {
    if (item.count > maxCount) {
      maxCount = item.count;
    }
  }
  if (maxCount * 2 > n + 1) {
    return "";
  }
  const ans = [];
  while (heap.length >= 2) {
    heap.sort((a, b) => b.count - a.count);
    const item1 = heap.shift();
    const item2 = heap.shift();
    ans.push(item1.ch, item2.ch);
    item1.count--;
    item2.count--;
    if (item1.count > 0) heap.push(item1);
    if (item2.count > 0) heap.push(item2);
  }
  if (heap.length === 1) {
    ans.push(heap[0].ch);
  }
  return ans.join("");
}
