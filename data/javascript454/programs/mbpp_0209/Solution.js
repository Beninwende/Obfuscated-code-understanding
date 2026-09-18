function siftDown(heap, i) {
  const n = heap.length;
  while (true) {
    let left = 2 * i + 1;
    let right = 2 * i + 2;
    let smallest = i;
    if (left < n && heap[left] < heap[smallest]) smallest = left;
    if (right < n && heap[right] < heap[smallest]) smallest = right;
    if (smallest === i) break;
    [heap[i], heap[smallest]] = [heap[smallest], heap[i]];
    i = smallest;
  }
}

function heapify(heap) {
  for (let i = Math.floor((heap.length - 2) / 2); i >= 0; i--) {
    siftDown(heap, i);
  }
}

function heapReplace(heap, a) {
  heapify(heap);
  if (heap.length === 0) {
    heap.push(a);
  } else {
    heap[0] = a;
    siftDown(heap, 0);
  }
  return heap;
}
