function maxOccurrences(nums) {
    const counts = {};
    for (const num of nums) {
        counts[num] = (counts[num] || 0) + 1;
    }
    let maxItem = null;
    let maxCount = 0;
    for (const [item, count] of Object.entries(counts)) {
        if (count > maxCount) {
            maxCount = count;
            maxItem = item;
        }
    }
    return [maxItem, maxCount];
}
