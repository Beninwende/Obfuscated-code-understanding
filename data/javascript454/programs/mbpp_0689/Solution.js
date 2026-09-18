function minJumps(arr, n) {
    const jumps = new Array(n).fill(0);
    if (n === 0 || arr[0] === 0) {
        return Infinity;
    }
    jumps[0] = 0;
    for (let i = 1; i < n; i++) {
        jumps[i] = Infinity;
        for (let j = 0; j < i; j++) {
            if (i <= j + arr[j] && jumps[j] !== Infinity) {
                jumps[i] = Math.min(jumps[i], jumps[j] + 1);
                break;
            }
        }
    }
    return jumps[n - 1];
}
