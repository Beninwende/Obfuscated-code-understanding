function nextSmallestPalindrome(num) {
  for (let i = num + 1; ; i++) {
    const str = i.toString();
    if (str === str.split('').reverse().join('')) {
      return i;
    }
  }
}
