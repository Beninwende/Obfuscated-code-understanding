class MinHeap {
  constructor() {
    this.heap = [];
  }
  push(val) {
    this.heap.push(val);
    this._siftUp();
  }
  pop() {
    if (this.size() === 0) return null;
    const top = this.heap[0];
    const end = this.heap.pop();
    if (this.size() > 0) {
      this.heap[0] = end;
      this._siftDown();
    }
    return top;
  }
  size() {
    return this.heap.length;
  }
  _siftUp() {
    let idx = this.heap.length - 1;
    const element = this.heap[idx];
    while (idx > 0) {
      let parentIdx = Math.floor((idx - 1) / 2);
      let parent = this.heap[parentIdx];
      if (element[0] >= parent[0]) break;
      this.heap[parentIdx] = element;
      this.heap[idx] = parent;
      idx = parentIdx;
    }
  }
  _siftDown() {
    let idx = 0;
    const length = this.heap.length;
    const element = this.heap[0];
    while (true) {
      let leftIdx = 2 * idx + 1;
      let rightIdx = 2 * idx + 2;
      let swapIdx = null;
      if (leftIdx < length) {
        let left = this.heap[leftIdx];
        if (left[0] < element[0]) swapIdx = leftIdx;
      }
      if (rightIdx < length) {
        let right = this.heap[rightIdx];
        if (
          (swapIdx === null && right[0] < element[0]) ||
          (swapIdx !== null && right[0] < this.heap[swapIdx][0])
        ) {
          swapIdx = rightIdx;
        }
      }
      if (swapIdx === null) break;
      this.heap[idx] = this.heap[swapIdx];
      this.heap[swapIdx] = element;
      idx = swapIdx;
    }
  }
}

function kSmallestPairs(nums1, nums2, k) {
  const heap = new MinHeap();
  function push(i, j) {
    if (i < nums1.length && j < nums2.length) {
      heap.push([nums1[i] + nums2[j], i, j]);
    }
  }
  push(0, 0);
  const pairs = [];
  while (heap.size() > 0 && pairs.length < k) {
    const [, i, j] = heap.pop();
    pairs.push([nums1[i], nums2[j]]);
    push(i, j + 1);
    if (j === 0) push(i + 1, 0);
  }
  return pairs;
}
