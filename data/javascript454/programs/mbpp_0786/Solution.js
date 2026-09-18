function rightInsertion(a, x) {
    let lo = 0, hi = a.length;
    while (lo < hi) {
        const mid = Math.floor((lo + hi) / 2);
        if (x < a[mid]) {
            hi = mid;
        } else {
            lo = mid + 1;
        }
    }
    return lo;
}
