function count(s, c) {
    let res = 0;
    for (let i = 0; i < s.length; i++) {
        if (s[i] === c) {
            res++;
        }
    }
    return res;
}
