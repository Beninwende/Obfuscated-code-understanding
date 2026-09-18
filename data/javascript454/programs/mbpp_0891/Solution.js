function same_Length(A, B) {
    while (A > 0 && B > 0) {
        A = Math.floor(A / 10);
        B = Math.floor(B / 10);
    }
    if (A === 0 && B === 0) {
        return true;
    }
    return false;
}
