class MinHeap {
  constructor() {
    this.heap = [];
  }
  push(item) {
    this.heap.push(item);
    this._heapifyUp();
  }
  pop() {
    if (this.heap.length === 1) return this.heap.pop();
    const root = this.heap[0];
    this.heap[0] = this.heap.pop();
    this._heapifyDown();
    return root;
  }
  _heapifyUp() {
    let idx = this.heap.length - 1;
    while (idx > 0) {
      const parent = Math.floor((idx - 1) / 2);
      if (this.heap[parent].val <= this.heap[idx].val) break;
      [this.heap[parent], this.heap[idx]] = [this.heap[idx], this.heap[parent]];
      idx = parent;
    }
  }
  _heapifyDown() {
    let idx = 0;
    const length = this.heap.length;
    while (true) {
      let left = 2 * idx + 1;
      let right = 2 * idx + 2;
      let smallest = idx;
      if (left < length && this.heap[left].val < this.heap[smallest].val) smallest = left;
      if (right < length && this.heap[right].val < this.heap[smallest].val) smallest = right;
      if (smallest === idx) break;
      [this.heap[idx], this.heap[smallest]] = [this.heap[smallest], this.heap[idx]];
      idx = smallest;
    }
  }
}

function nthSuperUglyNumber(n, primes) {
  const uglies = [1];
  const heap = new MinHeap();
  for (const prime of primes) {
    heap.push({ val: prime, prime: prime, idx: 0 });
  }
  while (uglies.length < n) {
    const node = heap.pop();
    if (node.val !== uglies[uglies.length - 1]) {
      uglies.push(node.val);
    }
    heap.push({ val: node.prime * uglies[node.idx + 1], prime: node.prime, idx: node.idx + 1 });
  }
  return uglies[uglies.length - 1];
}
