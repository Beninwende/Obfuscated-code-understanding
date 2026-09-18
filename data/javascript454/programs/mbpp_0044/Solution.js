function textMatchString(text) {
    const pattern = /^\w+/;
    if (pattern.test(text)) {
        return 'Found a match!';
    } else {
        return 'Not matched!';
    }
}
