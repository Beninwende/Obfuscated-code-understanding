function checkEquality(s) {
    return s.charCodeAt(0) === s.charCodeAt(s.length - 1);
}

function countSubstringWithEqualEnds(s) {
    let result = 0;
    const n = s.length;
    for (let i = 0; i < n; i++) {
        for (let j = 1; j <= n - i; j++) {
            if (checkEquality(s.slice(i, i + j))) {
                result++;
            }
        }
    }
    return result;
}
