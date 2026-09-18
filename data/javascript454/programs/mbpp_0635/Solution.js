class MinHeap {
    constructor() {
        this.heap = [];
    }
    push(value) {
        this.heap.push(value);
        this._siftUp();
    }
    pop() {
        if (this.heap.length === 0) return undefined;
        const min = this.heap[0];
        const last = this.heap.pop();
        if (this.heap.length > 0) {
            this.heap[0] = last;
            this._siftDown();
        }
        return min;
    }
    size() {
        return this.heap.length;
    }
    _siftUp() {
        let idx = this.heap.length - 1;
        const value = this.heap[idx];
        while (idx > 0) {
            const parentIdx = Math.floor((idx - 1) / 2);
            if (this.heap[parentIdx] <= value) break;
            this.heap[idx] = this.heap[parentIdx];
            idx = parentIdx;
        }
        this.heap[idx] = value;
    }
    _siftDown() {
        let idx = 0;
        const length = this.heap.length;
        const value = this.heap[0];
        while (true) {
            const left = 2 * idx + 1;
            const right = 2 * idx + 2;
            let swapIdx = null;
            if (left < length) {
                if (this.heap[left] < value) swapIdx = left;
            }
            if (right < length) {
                if ((swapIdx === null && this.heap[right] < value) || (swapIdx !== null && this.heap[right] < this.heap[left])) {
                    swapIdx = right;
                }
            }
            if (swapIdx === null) break;
            this.heap[idx] = this.heap[swapIdx];
            idx = swapIdx;
        }
        this.heap[idx] = value;
    }
}
function heapSort(iterable) {
    const h = new MinHeap();
    for (const value of iterable) {
        h.push(value);
    }
    const result = [];
    while (h.size() > 0) {
        result.push(h.pop());
    }
    return result;
}
