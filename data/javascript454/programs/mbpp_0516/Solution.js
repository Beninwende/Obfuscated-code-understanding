function radixSort(nums) {
  const RADIX = 10;
  let placement = 1;
  const maxDigit = Math.max(...nums);
  while (placement < maxDigit) {
    const buckets = Array.from({ length: RADIX }, () => []);
    for (let i = 0; i < nums.length; i++) {
      const tmp = Math.floor((nums[i] / placement) % RADIX);
      buckets[tmp].push(nums[i]);
    }
    let a = 0;
    for (let b = 0; b < RADIX; b++) {
      const buck = buckets[b];
      for (let i = 0; i < buck.length; i++) {
        nums[a++] = buck[i];
      }
    }
    placement *= RADIX;
  }
  return nums;
}
