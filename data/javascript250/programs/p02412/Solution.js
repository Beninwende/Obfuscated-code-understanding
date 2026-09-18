const fs = require('fs');

const createMemoizedFunction = (func, serializeFunc = JSON.stringify) => {
  let memo = new Map();
  const memoized = (...args) => {
    const key = serializeFunc(args);
    if (!memo[key]) {
      memo[key] = func(...args);
    }

    return memo[key];
  };

  return memoized;
};

const select = createMemoizedFunction((nums, m) => {
  if (m === 1) {
    return nums.map((n) => [n]);
  } else {
    const [fst, ...rest] = nums;
    return [
      ...(rest.length >= m ? select(rest, m) : []),
      ...select(rest, m - 1).map(c => [fst, ...c])
    ];
  }
});

const solve = (n, x) => {
  const nums = [...new Array(n).keys()].map(n => n + 1);
  return select(nums, 3).filter(c => c.reduce((prev, cur) => prev + cur) === x);
};

const main = input => {
  const result = input
    .split(/(\r)?\n/g)
    .filter(s => !!s && s !== "0 0")
    .map(s => {
      const [fst, snd] = s.split(" ");
      return solve(parseInt(fst), parseInt(snd)).length;
    }).join("\n");

  console.log(result);
}

main(fs.readFileSync('/dev/stdin', 'UTF-8'));

