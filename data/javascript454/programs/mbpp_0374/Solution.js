function permuteString(str) {
    if (str.length === 0) {
        return [''];
    }
    const prevList = permuteString(str.slice(1));
    const nextList = [];
    for (let i = 0; i < prevList.length; i++) {
        for (let j = 0; j < str.length; j++) {
            const newStr = prevList[i].slice(0, j) + str[0] + prevList[i].slice(j);
            if (!nextList.includes(newStr)) {
                nextList.push(newStr);
            }
        }
    }
    return nextList;
}
