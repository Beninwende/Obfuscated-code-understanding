function solve(a, n) {
    let mx = -Infinity;
    for (let j = 1; j < n; j++) {
        if (mx > a[j]) {
            return false;
        }
        mx = Math.max(mx, a[j - 1]);
    }
    return true;
}
