function minSwaps(s1, s2) {
    let c0 = 0;
    let c1 = 0;
    for (let i = 0; i < s1.length; i++) {
        if (s1[i] === '0' && s2[i] === '1') {
            c0++;
        } else if (s1[i] === '1' && s2[i] === '0') {
            c1++;
        }
    }
    const result = Math.floor(c0 / 2) + Math.floor(c1 / 2);
    if (c0 % 2 === 0 && c1 % 2 === 0) {
        return result;
    } else if ((c0 + c1) % 2 === 0) {
        return result + 2;
    } else {
        return -1;
    }
}
