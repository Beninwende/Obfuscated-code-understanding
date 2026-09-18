function combSort(nums) {
    const shrinkFact = 1.3;
    let gaps = nums.length;
    let swapped = true;
    while (gaps > 1 || swapped) {
        gaps = Math.floor(gaps / shrinkFact);
        swapped = false;
        for (let i = 0; i + gaps < nums.length; i++) {
            if (nums[i] > nums[i + gaps]) {
                [nums[i], nums[i + gaps]] = [nums[i + gaps], nums[i]];
                swapped = true;
            }
        }
    }
    return nums;
}
