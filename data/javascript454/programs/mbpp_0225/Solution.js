function findMin(arr, low, high) {
    while (low < high) {
        const mid = low + Math.floor((high - low) / 2);
        if (arr[mid] === arr[high]) {
            high -= 1;
        } else if (arr[mid] > arr[high]) {
            low = mid + 1;
        } else {
            high = mid;
        }
    }
    return arr[high];
}
