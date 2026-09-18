function oddNumSum(n) {
    let sm = 0;
    for (let i = 1; i <= n; i++) {
        let j = 2 * i - 1;
        sm += j ** 4;
    }
    return sm;
}
