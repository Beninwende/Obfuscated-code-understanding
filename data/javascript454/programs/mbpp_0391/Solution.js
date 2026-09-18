function convertListDictionary(l1, l2, l3) {
    const result = [];
    const length = Math.min(l1.length, l2.length, l3.length);
    for (let i = 0; i < length; i++) {
        result.push({ [l1[i]]: { [l2[i]]: l3[i] } });
    }
    return result;
}
