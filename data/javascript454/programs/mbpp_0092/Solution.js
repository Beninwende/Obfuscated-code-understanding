function isUndulating(n) {
    if (n.length <= 2) {
        return false;
    }
    for (let i = 2; i < n.length; i++) {
        if (n[i - 2] !== n[i]) {
            return false;
        }
    }
    return true;
}
