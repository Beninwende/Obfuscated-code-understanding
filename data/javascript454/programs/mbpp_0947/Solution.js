function lenLog(list1) {
    let minLen = list1[0].length;
    for (const word of list1) {
        if (word.length < minLen) {
            minLen = word.length;
        }
    }
    return minLen;
}
