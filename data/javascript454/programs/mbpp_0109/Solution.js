function odd_Equivalent(s, n) {
    let count = 0;
    for (let i = 0; i < n; i++) {
        if (s[i] === '1') {
            count++;
        }
    }
    return count;
}
