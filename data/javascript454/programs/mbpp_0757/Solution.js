function countReversePairs(testList) {
    let res = 0;
    for (let i = 0; i < testList.length; i++) {
        const reversed = testList[i].split('').reverse().join('');
        for (let j = i; j < testList.length; j++) {
            if (testList[j] === reversed) {
                res++;
            }
        }
    }
    return String(res);
}
