function isSubset(arr1, m, arr2, n) {
    const hashset = new Set();
    for (let i = 0; i < m; i++) {
        hashset.add(arr1[i]);
    }
    for (let i = 0; i < n; i++) {
        if (!hashset.has(arr2[i])) {
            return false;
        }
    }
    return true;
}
