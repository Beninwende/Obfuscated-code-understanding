let content = '';
process.stdin.resume();
process.stdin.setEncoding('utf8');
process.stdin.on('data', buf => {
  content += buf;
});
process.stdin.on('end', () => {
  const [matMeta, ...lines] = content.trim().split('\n');
  const [rowSize, colSize] = matMeta.split(' ').map(n => parseInt(n, 10));
  const matA = lines
    .slice(0, rowSize)
    .map(line => line.split(' ').map(n => parseInt(n, 10)));
  const matB = lines
    .slice(rowSize)
    .map(line => line.split(' ').map(n => parseInt(n, 10)));

  const result = multiply(matA, matB);
  console.log(result.join('\n'));
});

const multiply = (matA, matB) => {
  matB = matB.map(([n]) => n);
  return matA.map(row => row.reduce((prev, cur, i) => prev + cur * matB[i], 0));
};
