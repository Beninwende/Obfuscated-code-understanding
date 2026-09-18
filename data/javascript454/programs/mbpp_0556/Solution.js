function findOddPair(A, N) {
    let oddPair = 0;
    for (let i = 0; i < N; i++) {
        for (let j = i + 1; j < N; j++) {
            if (((A[i] ^ A[j]) % 2) !== 0) {
                oddPair++;
            }
        }
    }
    return oddPair;
}
