function prodSquare(n) {
    for (let i = 2; i <= n; i++) {
        if (i * i < n + 1) {
            for (let j = 2; j <= n; j++) {
                if (i * i * j * j === n) {
                    return true;
                }
            }
        }
    }
    return false;
}
