function heapSort(arr) {
    heapify(arr);
    let end = arr.length - 1;
    while (end > 0) {
        [arr[end], arr[0]] = [arr[0], arr[end]];
        shiftDown(arr, 0, end - 1);
        end--;
    }
    return arr;
}

function heapify(arr) {
    let start = Math.floor(arr.length / 2);
    while (start >= 0) {
        shiftDown(arr, start, arr.length - 1);
        start--;
    }
}

function shiftDown(arr, start, end) {
    let root = start;
    while (root * 2 + 1 <= end) {
        let child = root * 2 + 1;
        if (child + 1 <= end && arr[child] < arr[child + 1]) {
            child++;
        }
        if (child <= end && arr[root] < arr[child]) {
            [arr[root], arr[child]] = [arr[child], arr[root]];
            root = child;
        } else {
            return;
        }
    }
}
