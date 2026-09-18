function lenLog(list1) {
    let max = list1[0].length;
    for (const word of list1) {
        if (word.length > max) {
            max = word.length;
        }
    }
    return max;
}
