function largestNeg(list1) {
    let max = list1[0];
    for (const x of list1) {
        if (x < max) {
            max = x;
        }
    }
    return max;
}
