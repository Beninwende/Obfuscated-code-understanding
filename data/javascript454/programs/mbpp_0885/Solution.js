function isIsomorphic(str1, str2) {
    const dict1 = {};
    const dict2 = {};
    for (let i = 0; i < str1.length; i++) {
        const ch = str1[i];
        dict1[ch] = dict1[ch] || [];
        dict1[ch].push(i);
    }
    for (let j = 0; j < str2.length; j++) {
        const ch = str2[j];
        dict2[ch] = dict2[ch] || [];
        dict2[ch].push(j);
    }
    const vals1 = Object.values(dict1).map(arr => arr.join(',')).sort();
    const vals2 = Object.values(dict2).map(arr => arr.join(',')).sort();
    return vals1.length === vals2.length && vals1.every((v, i) => v === vals2[i]);
}
