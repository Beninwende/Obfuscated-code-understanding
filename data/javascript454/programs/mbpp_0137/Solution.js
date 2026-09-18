function zeroCount(nums) {
    const n = nums.length;
    let n1 = 0;
    for (const x of nums) {
        if (x === 0) {
            n1++;
        }
    }
    return Math.round((n1 / n) * 100) / 100;
}
