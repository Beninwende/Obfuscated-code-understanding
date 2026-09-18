function allCharactersSame(s) {
    const n = s.length;
    for (let i = 1; i < n; i++) {
        if (s[i] !== s[0]) {
            return false;
        }
    }
    return true;
}
