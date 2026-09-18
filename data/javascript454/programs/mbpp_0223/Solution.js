function isMajority(arr, n, x) {
    const i = binarySearch(arr, 0, n - 1, x);
    if (i === -1) {
        return false;
    }
    if (i + Math.floor(n / 2) <= n - 1 && arr[i + Math.floor(n / 2)] === x) {
        return true;
    } else {
        return false;
    }
}

function binarySearch(arr, low, high, x) {
    if (high >= low) {
        const mid = Math.floor((low + high) / 2);
        if ((mid === 0 || x > arr[mid - 1]) && arr[mid] === x) {
            return mid;
        } else if (x > arr[mid]) {
            return binarySearch(arr, mid + 1, high, x);
        } else {
            return binarySearch(arr, low, mid - 1, x);
        }
    }
    return -1;
}
