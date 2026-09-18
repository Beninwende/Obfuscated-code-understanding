function isAbundant(n) {
  let fctrsum = 0;
  for (let fctr = 1; fctr < n; fctr++) {
    if (n % fctr === 0) {
      fctrsum += fctr;
    }
  }
  return fctrsum > n;
}
