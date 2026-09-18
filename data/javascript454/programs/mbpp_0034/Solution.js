function findMissing(ar, N) {
    let l = 0;
    let r = N - 1;
    while (l <= r) {
        const mid = Math.floor((l + r) / 2);
        if (ar[mid] !== mid + 1 && ar[mid - 1] === mid) {
            return mid + 1;
        } else if (ar[mid] !== mid + 1) {
            r = mid - 1;
        } else {
            l = mid + 1;
        }
    }
    return -1;
}
