function textMatchThree(text) {
    const pattern = /ab{3}?/;
    if (pattern.test(text)) {
        return 'Found a match!';
    } else {
        return 'Not matched!';
    }
}
