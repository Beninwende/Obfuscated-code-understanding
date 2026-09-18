function recurGcd(a, b) {
  const low = Math.min(a, b);
  const high = Math.max(a, b);
  if (low === 0) {
    return high;
  } else if (low === 1) {
    return 1;
  } else {
    return recurGcd(low, high % low);
  }
}
