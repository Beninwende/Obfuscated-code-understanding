function arcLength(d, a) {
    const pi = 22/7;
    if (a >= 360) {
        return null;
    }
    const arclength = (pi * d) * (a / 360);
    return arclength;
}
