class Node {
    constructor(value, listNum, index) {
        this.value = value;
        this.listNum = listNum;
        this.index = index;
    }
}

class MinHeap {
    constructor() {
        this.heap = [];
    }
    size() {
        return this.heap.length;
    }
    push(node) {
        this.heap.push(node);
        this._bubbleUp(this.heap.length - 1);
    }
    pop() {
        if (this.heap.length === 0) return null;
        const top = this.heap[0];
        const end = this.heap.pop();
        if (this.heap.length > 0) {
            this.heap[0] = end;
            this._bubbleDown(0);
        }
        return top;
    }
    _bubbleUp(idx) {
        const heap = this.heap;
        while (idx > 0) {
            const parentIdx = Math.floor((idx - 1) / 2);
            if (heap[idx].value < heap[parentIdx].value) {
                [heap[idx], heap[parentIdx]] = [heap[parentIdx], heap[idx]];
                idx = parentIdx;
            } else {
                break;
            }
        }
    }
    _bubbleDown(idx) {
        const heap = this.heap;
        const length = heap.length;
        while (true) {
            let left = 2 * idx + 1;
            let right = 2 * idx + 2;
            let smallest = idx;
            if (left < length && heap[left].value < heap[smallest].value) {
                smallest = left;
            }
            if (right < length && heap[right].value < heap[smallest].value) {
                smallest = right;
            }
            if (smallest !== idx) {
                [heap[idx], heap[smallest]] = [heap[smallest], heap[idx]];
                idx = smallest;
            } else {
                break;
            }
        }
    }
}

function findMinimumRange(lists) {
    let high = -Infinity;
    let range = [0, Infinity];
    const heap = new MinHeap();

    for (let i = 0; i < lists.length; i++) {
        const value = lists[i][0];
        heap.push(new Node(value, i, 0));
        if (value > high) high = value;
    }

    while (true) {
        const top = heap.pop();
        const low = top.value;
        const i = top.listNum;
        const j = top.index;
        if (high - low < range[1] - range[0]) {
            range = [low, high];
        }
        if (j === lists[i].length - 1) {
            return range;
        }
        const nextVal = lists[i][j + 1];
        heap.push(new Node(nextVal, i, j + 1));
        if (nextVal > high) high = nextVal;
    }
}
