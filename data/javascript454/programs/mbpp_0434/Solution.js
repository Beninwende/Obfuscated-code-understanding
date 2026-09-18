function text_match_one(text) {
    const pattern = /ab+?/;
    if (pattern.test(text)) {
        return 'Found a match!';
    } else {
        return 'Not matched!';
    }
}
