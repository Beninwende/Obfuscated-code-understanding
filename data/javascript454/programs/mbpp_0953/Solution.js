function subset(ar, n) {
    let res = 0;
    ar.sort((a, b) => a - b);
    for (let i = 0; i < n; i++) {
        let count = 1;
        for (let j = 0; j < n - 1; j++) {
            if (ar[j] === ar[j + 1]) {
                count++;
            } else {
                break;
            }
        }
        res = Math.max(res, count);
    }
    return res;
}
