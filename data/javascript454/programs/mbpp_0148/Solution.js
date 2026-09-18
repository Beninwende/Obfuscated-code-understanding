function sumDigitsSingle(x) {
    let ans = 0;
    while (x > 0) {
        ans += x % 10;
        x = Math.floor(x / 10);
    }
    return ans;
}

function closest(x) {
    let ans = 0;
    while (ans * 10 + 9 <= x) {
        ans = ans * 10 + 9;
    }
    return ans;
}

function sumDigitsTwoParts(N) {
    const A = closest(N);
    return sumDigitsSingle(A) + sumDigitsSingle(N - A);
}
