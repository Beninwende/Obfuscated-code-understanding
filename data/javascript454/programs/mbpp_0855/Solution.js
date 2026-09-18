function checkEvenParity(x) {
    let parity = 0;
    while (x !== 0) {
        x = x & (x - 1);
        parity++;
    }
    return parity % 2 === 0;
}
