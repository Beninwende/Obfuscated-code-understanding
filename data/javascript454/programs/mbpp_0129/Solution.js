function magicSquareTest(myMatrix) {
    const iSize = myMatrix[0].length;
    const sumList = [];
    for (const row of myMatrix) {
        sumList.push(row.reduce((a, b) => a + b, 0));
    }
    for (let col = 0; col < iSize; col++) {
        let colSum = 0;
        for (let row = 0; row < myMatrix.length; row++) {
            colSum += myMatrix[row][col];
        }
        sumList.push(colSum);
    }
    let result1 = 0;
    for (let i = 0; i < iSize; i++) {
        result1 += myMatrix[i][i];
    }
    sumList.push(result1);
    let result2 = 0;
    for (let i = iSize - 1; i >= 0; i--) {
        result2 += myMatrix[i][i];
    }
    sumList.push(result2);
    return new Set(sumList).size === 1;
}
