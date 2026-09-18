function validityTriangle(a, b, c) {
  const total = a + b + c;
  if (total === 180) {
    return true;
  } else {
    return false;
  }
}
