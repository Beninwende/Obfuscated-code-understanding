function Sum(N) {
    const sumOfPrimeDivisors = new Array(N + 1).fill(0);
    for (let i = 2; i <= N; i++) {
        if (sumOfPrimeDivisors[i] === 0) {
            for (let j = i; j <= N; j += i) {
                sumOfPrimeDivisors[j] += i;
            }
        }
    }
    return sumOfPrimeDivisors[N];
}
