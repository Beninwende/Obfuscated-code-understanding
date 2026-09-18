function testThreeEqual(x, y, z) {
  const result = new Set([x, y, z]);
  if (result.size === 3) {
    return 0;
  } else {
    return 4 - result.size;
  }
}
