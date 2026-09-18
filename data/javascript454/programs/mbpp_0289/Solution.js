function oddDays(N) {
    const hund1 = Math.floor(N / 100);
    const hund4 = Math.floor(N / 400);
    let leap = Math.floor(N / 4);
    let ordd = N - leap;
    if (hund1) {
        ordd += hund1;
        leap -= hund1;
    }
    if (hund4) {
        ordd -= hund4;
        leap += hund4;
    }
    const days = ordd + leap * 2;
    return days % 7;
}
