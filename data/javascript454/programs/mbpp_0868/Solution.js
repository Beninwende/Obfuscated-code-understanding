function lengthOfLastWord(a) {
    let l = 0;
    const x = a.trim();
    for (let i = 0; i < x.length; i++) {
        if (x[i] === ' ') {
            l = 0;
        } else {
            l++;
        }
    }
    return l;
}
