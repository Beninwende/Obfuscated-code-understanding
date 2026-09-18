function func(nums, k) {
    const d = new Map();
    for (const row of nums) {
        for (const i of row) {
            d.set(i, (d.get(i) || 0) + 1);
        }
    }
    class MinHeap {
        constructor() { this.heap = []; }
        size() { return this.heap.length; }
        peek() { return this.heap[0]; }
        swap(i, j) { [this.heap[i], this.heap[j]] = [this.heap[j], this.heap[i]]; }
        push(val) {
            this.heap.push(val);
            this.bubbleUp(this.heap.length - 1);
        }
        pop() {
            if (this.heap.length === 0) return null;
            const min = this.heap[0];
            const last = this.heap.pop();
            if (this.heap.length > 0) {
                this.heap[0] = last;
                this.bubbleDown(0);
            }
            return min;
        }
        bubbleUp(index) {
            while (index > 0) {
                const parent = Math.floor((index - 1) / 2);
                if (this.heap[index][0] < this.heap[parent][0]) {
                    this.swap(index, parent);
                    index = parent;
                } else {
                    break;
                }
            }
        }
        bubbleDown(index) {
            const length = this.heap.length;
            while (true) {
                let left = 2 * index + 1;
                let right = 2 * index + 2;
                let smallest = index;
                if (left < length && this.heap[left][0] < this.heap[smallest][0]) {
                    smallest = left;
                }
                if (right < length && this.heap[right][0] < this.heap[smallest][0]) {
                    smallest = right;
                }
                if (smallest !== index) {
                    this.swap(index, smallest);
                    index = smallest;
                } else {
                    break;
                }
            }
        }
    }
    const heap = new MinHeap();
    for (const [key, v] of d) {
        if (heap.size() < k) {
            heap.push([v, key]);
        } else if (v > heap.peek()[0]) {
            heap.pop();
            heap.push([v, key]);
        }
    }
    const result = [];
    while (heap.size()) {
        result.push(heap.pop()[1]);
    }
    return result;
}
