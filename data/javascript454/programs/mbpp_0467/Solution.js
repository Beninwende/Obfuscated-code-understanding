function decimalToOctal(deciNum) {
    let octalNum = 0;
    let countVal = 1;
    let dNo = deciNum;
    while (deciNum !== 0) {
        const remainder = deciNum % 8;
        octalNum += remainder * countVal;
        countVal *= 10;
        deciNum = Math.floor(deciNum / 8);
    }
    return octalNum;
}
