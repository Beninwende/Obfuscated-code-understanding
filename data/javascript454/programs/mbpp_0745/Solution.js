function divisibleByDigits(startnum, endnum) {
    const result = [];
    for (let n = startnum; n <= endnum; n++) {
        const digits = String(n).split('');
        if (digits.every(d => {
            const digit = parseInt(d, 10);
            return digit !== 0 && n % digit === 0;
        })) {
            result.push(n);
        }
    }
    return result;
}
