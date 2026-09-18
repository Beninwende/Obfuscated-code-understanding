function maxOccurrences(nums) {
    let maxVal = 0;
    let result = nums[0];
    for (const i of nums) {
        const occu = nums.filter(x => x === i).length;
        if (occu > maxVal) {
            maxVal = occu;
            result = i;
        }
    }
    return result;
}
