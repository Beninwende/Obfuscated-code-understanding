function findRotations(str) {
    const tmp = str + str;
    const n = str.length;
    for (let i = 1; i <= n; i++) {
        const substring = tmp.slice(i, i + n);
        if (str === substring) {
            return i;
        }
    }
    return n;
}
