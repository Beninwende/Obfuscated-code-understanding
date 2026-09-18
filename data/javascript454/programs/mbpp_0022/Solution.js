function findFirstDuplicate(nums) {
  const numSet = new Set();
  const noDuplicate = -1;
  for (let i = 0; i < nums.length; i++) {
    if (numSet.has(nums[i])) {
      return nums[i];
    } else {
      numSet.add(nums[i]);
    }
  }
  return noDuplicate;
}
