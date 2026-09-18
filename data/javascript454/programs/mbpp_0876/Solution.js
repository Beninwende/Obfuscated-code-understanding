function lcm(x, y) {
  let z = x > y ? x : y;
  while (true) {
    if (z % x === 0 && z % y === 0) {
      return z;
    }
    z++;
  }
}
