function isTwoAlter(s) {
    for (let i = 0; i < s.length - 2; i++) {
        if (s[i] !== s[i + 2]) {
            return false;
        }
    }
    if (s[0] === s[1]) {
        return false;
    }
    return true;
}
