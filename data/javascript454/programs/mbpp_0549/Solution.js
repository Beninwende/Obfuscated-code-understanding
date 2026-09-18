function odd_Num_Sum(n) {
    let j = 0;
    let sm = 0;
    for (let i = 1; i <= n; i++) {
        j = 2 * i - 1;
        sm += j * j * j * j * j;
    }
    return sm;
}
