function babylonianSquareroot(number) {
    if (number === 0) {
        return 0;
    }
    let g = number / 2.0;
    let g2 = g + 1;
    while (g !== g2) {
        const n = number / g;
        g2 = g;
        g = (g + n) / 2;
    }
    return g;
}
