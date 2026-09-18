function countDuplic(lists) {
    const elements = [];
    const frequency = [];
    if (!lists.length) {
        return [elements, frequency];
    }
    let runningCount = 1;
    for (let i = 0; i < lists.length - 1; i++) {
        if (lists[i] === lists[i + 1]) {
            runningCount++;
        } else {
            frequency.push(runningCount);
            elements.push(lists[i]);
            runningCount = 1;
        }
    }
    frequency.push(runningCount);
    elements.push(lists[lists.length - 1]);
    return [elements, frequency];
}
