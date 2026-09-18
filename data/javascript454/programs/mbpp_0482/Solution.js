function match(text) {
    const pattern = /[A-Z]+[a-z]+$/;
    if (pattern.test(text)) {
        return 'Yes';
    } else {
        return 'No';
    }
}
