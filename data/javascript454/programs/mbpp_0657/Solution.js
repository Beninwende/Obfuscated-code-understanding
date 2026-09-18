function firstDigit(n) {
  let fact = 1;
  for (let i = 2; i <= n; i++) {
    fact *= i;
    while (fact % 10 === 0) {
      fact = fact / 10;
    }
    fact = Math.floor(fact);
  }
  while (fact >= 10) {
    fact = Math.floor(fact / 10);
  }
  return fact;
}
