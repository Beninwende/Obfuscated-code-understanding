function prime_num(num) {
  if (num >= 1) {
    for (let i = 2; i < Math.floor(num / 2); i++) {
      if (num % i === 0) {
        return false;
      } else {
        return true;
      }
    }
  } else {
    return false;
  }
}
