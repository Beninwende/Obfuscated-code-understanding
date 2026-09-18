function generateMatrix(n) {
    if (n <= 0) {
        return [];
    }
    const matrix = Array.from({ length: n }, () => Array(n).fill(0));
    let rowSt = 0, rowEd = n - 1, colSt = 0, colEd = n - 1, current = 1;
    const max = n * n;
    while (true) {
        if (current > max) break;
        for (let c = colSt; c <= colEd; c++) {
            matrix[rowSt][c] = current++;
        }
        rowSt++;
        for (let r = rowSt; r <= rowEd; r++) {
            matrix[r][colEd] = current++;
        }
        colEd--;
        for (let c = colEd; c >= colSt; c--) {
            matrix[rowEd][c] = current++;
        }
        rowEd--;
        for (let r = rowEd; r >= rowSt; r--) {
            matrix[r][colSt] = current++;
        }
        colSt++;
    }
    return matrix;
}
