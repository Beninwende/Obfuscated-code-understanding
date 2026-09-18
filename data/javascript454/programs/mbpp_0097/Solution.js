function frequencyLists(list1) {
    const flattened = list1.flat();
    const dicData = {};
    for (const num of flattened) {
        if (dicData.hasOwnProperty(num)) {
            dicData[num] += 1;
        } else {
            dicData[num] = 1;
        }
    }
    return dicData;
}
