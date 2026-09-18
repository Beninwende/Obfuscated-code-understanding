function textUppercaseLowercase(text) {
    const pattern = /[A-Z]+[a-z]+$/;
    if (pattern.test(text)) {
        return 'Found a match!';
    } else {
        return 'Not matched!';
    }
}
