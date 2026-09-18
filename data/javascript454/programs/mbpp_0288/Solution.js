function modularInverse(arr, N, P) {
    let currentElement = 0;
    for (let i = 0; i < N; i++) {
        if ((arr[i] * arr[i]) % P === 1) {
            currentElement++;
        }
    }
    return currentElement;
}
