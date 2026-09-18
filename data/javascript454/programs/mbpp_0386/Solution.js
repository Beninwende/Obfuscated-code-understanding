function swapCount(s) {
    let countLeft = 0;
    let countRight = 0;
    let swap = 0;
    let imbalance = 0;
    for (let i = 0; i < s.length; i++) {
        if (s[i] === '[') {
            countLeft++;
            if (imbalance > 0) {
                swap += imbalance;
                imbalance--;
            }
        } else if (s[i] === ']') {
            countRight++;
            imbalance = countRight - countLeft;
        }
    }
    return swap;
}
