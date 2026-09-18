function checkMinHeap(arr, i = 0) {
    if (2 * i + 2 > arr.length) {
        return true;
    }
    const leftChild = arr[i] <= arr[2 * i + 1] && checkMinHeap(arr, 2 * i + 1);
    const rightChild = 2 * i + 2 === arr.length || (arr[i] <= arr[2 * i + 2] && checkMinHeap(arr, 2 * i + 2));
    return leftChild && rightChild;
}
