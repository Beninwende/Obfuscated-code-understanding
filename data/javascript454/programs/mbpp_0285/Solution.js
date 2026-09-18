function textMatchTwoThree(text) {
    const pattern = /ab{2,3}/;
    if (pattern.test(text)) {
        return 'Found a match!';
    } else {
        return 'Not matched!';
    }
}
