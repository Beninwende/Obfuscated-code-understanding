function isNumKeith(x) {
    let terms = [];
    let temp = x;
    let n = 0;
    while (temp > 0) {
        terms.push(temp % 10);
        temp = Math.floor(temp / 10);
        n++;
    }
    terms.reverse();
    let nextTerm = 0;
    let i = n;
    while (nextTerm < x) {
        nextTerm = 0;
        for (let j = 1; j <= n; j++) {
            nextTerm += terms[i - j];
        }
        terms.push(nextTerm);
        i++;
    }
    return nextTerm === x;
}
