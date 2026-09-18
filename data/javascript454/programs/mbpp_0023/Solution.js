function maximum_Sum(list1) {
    let maxi = -100000;
    for (const x of list1) {
        let sum = 0;
        for (const y of x) {
            sum += y;
        }
        maxi = Math.max(sum, maxi);
    }
    return maxi;
}
