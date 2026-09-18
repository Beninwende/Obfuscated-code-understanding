function lastTwoDigits(N) {
  if (N >= 10) {
    return;
  }
  let fac = 1;
  for (let i = 1; i <= N; i++) {
    fac = (fac * i) % 100;
  }
  return fac;
}
