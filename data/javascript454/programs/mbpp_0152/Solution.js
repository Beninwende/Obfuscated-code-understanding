function merge(a, b) {
    const c = [];
    while (a.length !== 0 && b.length !== 0) {
        if (a[0] < b[0]) {
            c.push(a.shift());
        } else {
            c.push(b.shift());
        }
    }
    return c.concat(a.length === 0 ? b : a);
}

function mergeSort(x) {
    if (x.length <= 1) {
        return x;
    }
    const middle = Math.floor(x.length / 2);
    const a = mergeSort(x.slice(0, middle));
    const b = mergeSort(x.slice(middle));
    return merge(a, b);
}
