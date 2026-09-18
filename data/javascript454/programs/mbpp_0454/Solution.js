function textMatchWordz(text) {
    const pattern = /\w*z.\w*/;
    if (pattern.test(text)) {
        return 'Found a match!';
    } else {
        return 'Not matched!';
    }
}
