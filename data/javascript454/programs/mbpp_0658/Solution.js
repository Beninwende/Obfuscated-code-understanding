function maxOccurrences(list1) {
    let maxVal = 0;
    let result = list1[0];
    for (const i of list1) {
        const occu = list1.filter(item => item === i).length;
        if (occu > maxVal) {
            maxVal = occu;
            result = i;
        }
    }
    return result;
}
