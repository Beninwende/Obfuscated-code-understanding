function gcd(a, b) {
    while (b !== 0) {
        [a, b] = [b, a % b];
    }
    return a;
}

function minOperations(A, B) {
    if (A > B) {
        [A, B] = [B, A];
    }
    B = B / gcd(A, B);
    return B - 1;
}
