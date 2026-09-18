function dogAge(hAge) {
  if (hAge < 0) {
    throw new Error('Invalid age');
  } else if (hAge <= 2) {
    return hAge * 10.5;
  } else {
    return 21 + (hAge - 2) * 4;
  }
}
