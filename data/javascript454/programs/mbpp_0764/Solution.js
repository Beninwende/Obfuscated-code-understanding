function number_ctr(str) {
    let number_ctr = 0;
    for (let i = 0; i < str.length; i++) {
        if (str[i] >= '0' && str[i] <= '9') {
            number_ctr++;
        }
    }
    return number_ctr;
}
