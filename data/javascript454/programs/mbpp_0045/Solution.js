function findGcd(x, y) {
  while (y !== 0) {
    [x, y] = [y, x % y];
  }
  return x;
}

function getGcd(arr) {
  let gcd = findGcd(arr[0], arr[1]);
  for (let i = 2; i < arr.length; i++) {
    gcd = findGcd(gcd, arr[i]);
  }
  return gcd;
}
