function extractIndexList(l1, l2, l3) {
    const result = [];
    const length = Math.min(l1.length, l2.length, l3.length);
    for (let i = 0; i < length; i++) {
        const m = l1[i], n = l2[i], o = l3[i];
        if (m === n && n === o) {
            result.push(m);
        }
    }
    return result;
}
