function heapAscending(nums) {
  const heap = nums.slice();
  const n = heap.length;
  for (let i = Math.floor(n / 2) - 1; i >= 0; i--) {
    siftDown(heap, i, n);
  }
  const result = [];
  let size = n;
  while (size > 0) {
    result.push(heap[0]);
    heap[0] = heap[size - 1];
    size--;
    siftDown(heap, 0, size);
  }
  return result;
}

function siftDown(heap, i, n) {
  while (true) {
    let smallest = i;
    const left = 2 * i + 1;
    const right = 2 * i + 2;
    if (left < n && heap[left] < heap[smallest]) smallest = left;
    if (right < n && heap[right] < heap[smallest]) smallest = right;
    if (smallest !== i) {
      [heap[i], heap[smallest]] = [heap[smallest], heap[i]];
      i = smallest;
    } else {
      break;
    }
  }
}
