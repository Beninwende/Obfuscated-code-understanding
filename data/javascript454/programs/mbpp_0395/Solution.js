function firstNonRepeatingCharacter(str1) {
    const charOrder = [];
    const ctr = {};
    for (const c of str1) {
        if (ctr[c] !== undefined) {
            ctr[c]++;
        } else {
            ctr[c] = 1;
            charOrder.push(c);
        }
    }
    for (const c of charOrder) {
        if (ctr[c] === 1) {
            return c;
        }
    }
    return null;
}
