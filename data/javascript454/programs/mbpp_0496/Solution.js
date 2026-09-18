function heapQueueSmallest(nums, n) {
  const heap = nums.slice();
  for (let i = Math.floor(heap.length / 2) - 1; i >= 0; i--) {
    siftDown(heap, i, heap.length);
  }
  const result = [];
  for (let i = 0; i < n && heap.length > 0; i++) {
    result.push(heap[0]);
    heap[0] = heap.pop();
    siftDown(heap, 0, heap.length);
  }
  return result;
}

function siftDown(heap, i, len) {
  while (true) {
    let left = 2 * i + 1;
    let right = 2 * i + 2;
    let smallest = i;
    if (left < len && heap[left] < heap[smallest]) smallest = left;
    if (right < len && heap[right] < heap[smallest]) smallest = right;
    if (smallest === i) break;
    [heap[i], heap[smallest]] = [heap[smallest], heap[i]];
    i = smallest;
  }
}
