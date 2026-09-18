function noOfTriangle(N, K) {
    if (N < K) {
        return -1;
    } else {
        const triUp = Math.floor((N - K + 1) * (N - K + 2) / 2);
        const triDown = Math.floor((N - 2 * K + 1) * (N - 2 * K + 2) / 2);
        return triUp + triDown;
    }
}
