function previousPalindrome(num) {
  for (let x = num - 1; x > 0; x--) {
    const s = x.toString();
    if (s === s.split('').reverse().join('')) {
      return x;
    }
  }
}
