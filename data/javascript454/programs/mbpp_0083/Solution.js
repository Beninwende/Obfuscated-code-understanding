function getChar(strr) {
    let summ = 0;
    for (let i = 0; i < strr.length; i++) {
        summ += strr.charCodeAt(i) - 'a'.charCodeAt(0) + 1;
    }
    if (summ % 26 === 0) {
        return 'z';
    } else {
        summ = summ % 26;
        return String.fromCharCode('a'.charCodeAt(0) + summ - 1);
    }
}
