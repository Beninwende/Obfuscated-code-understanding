function pancakeSort(nums) {
    let arrLen = nums.length;
    while (arrLen > 1) {
        const maxVal = Math.max(...nums.slice(0, arrLen));
        const mi = nums.indexOf(maxVal);
        nums = nums.slice(0, mi + 1).reverse().concat(nums.slice(mi + 1));
        nums = nums.slice(0, arrLen).reverse().concat(nums.slice(arrLen));
        arrLen--;
    }
    return nums;
}
