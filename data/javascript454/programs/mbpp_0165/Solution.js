function countCharPosition(str1) {
    let countChars = 0;
    for (let i = 0; i < str1.length; i++) {
        const code = str1.charCodeAt(i);
        if (i === code - 'A'.charCodeAt(0) || i === code - 'a'.charCodeAt(0)) {
            countChars++;
        }
    }
    return countChars;
}
