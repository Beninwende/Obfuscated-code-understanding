function sectorArea(r, a) {
    const pi = 22/7;
    if (a >= 360) {
        return null;
    }
    const sectorArea = (pi * r * r) * (a / 360);
    return sectorArea;
}
