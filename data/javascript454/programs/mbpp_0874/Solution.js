function checkConcat(str1, str2) {
    const N = str1.length;
    const M = str2.length;
    if (N % M !== 0) {
        return false;
    }
    for (let i = 0; i < N; i++) {
        if (str1[i] !== str2[i % M]) {
            return false;
        }
    }
    return true;
}
