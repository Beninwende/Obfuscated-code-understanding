function textMatchWordzMiddle(text) {
    const pattern = /\Bz\B/;
    if (pattern.test(text)) {
        return 'Found a match!';
    } else {
        return 'Not matched!';
    }
}
