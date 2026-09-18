function doesContainB(a, b, c) {
    if (a === b) {
        return true;
    }
    if ((b - a) * c > 0 && (b - a) % c === 0) {
        return true;
    }
    return false;
}
