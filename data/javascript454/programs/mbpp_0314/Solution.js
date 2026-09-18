function maxSumRectangularGrid(grid, n) {
    let incl = Math.max(grid[0][0], grid[1][0]);
    let excl = 0;
    for (let i = 1; i < n; i++) {
        const exclNew = Math.max(excl, incl);
        incl = excl + Math.max(grid[0][i], grid[1][i]);
        excl = exclNew;
    }
    return Math.max(excl, incl);
}
