function removeChar(s, c) {
    let count = 0;
    for (let i = 0; i < s.length; i++) {
        if (s[i] === c) count++;
    }
    let arr = s.split('');
    while (count > 0) {
        const idx = arr.indexOf(c);
        if (idx !== -1) {
            arr.splice(idx, 1);
        }
        count--;
    }
    return arr.join('');
}
