function findMax(arr, low, high) {
    if (high < low) {
        return arr[0];
    }
    if (high === low) {
        return arr[low];
    }
    const mid = low + Math.floor((high - low) / 2);
    if (mid < high && arr[mid + 1] < arr[mid]) {
        return arr[mid];
    }
    if (mid > low && arr[mid] < arr[mid - 1]) {
        return arr[mid - 1];
    }
    if (arr[low] > arr[mid]) {
        return findMax(arr, low, mid - 1);
    } else {
        return findMax(arr, mid + 1, high);
    }
}
