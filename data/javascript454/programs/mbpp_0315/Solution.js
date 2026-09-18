function find_Max_Len_Even(str) {
    let n = str.length;
    let i = 0;
    let currlen = 0;
    let maxlen = 0;
    let st = -1;
    while (i < n) {
        if (str[i] === ' ') {
            if (currlen % 2 === 0) {
                if (maxlen < currlen) {
                    maxlen = currlen;
                    st = i - currlen;
                }
            }
            currlen = 0;
        } else {
            currlen++;
        }
        i++;
    }
    if (currlen % 2 === 0) {
        if (maxlen < currlen) {
            maxlen = currlen;
            st = i - currlen;
        }
    }
    if (st === -1) {
        return "-1";
    }
    return str.substring(st, st + maxlen);
}
