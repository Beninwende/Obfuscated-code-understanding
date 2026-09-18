function getPosition(a, n, m) {
    for (let i = 0; i < n; i++) {
        a[i] = Math.ceil(a[i] / m);
    }
    let result = -1;
    let maxx = -1;
    for (let i = n - 1; i >= 0; i--) {
        if (a[i] > maxx) {
            maxx = a[i];
            result = i;
        }
    }
    return result + 1;
}
