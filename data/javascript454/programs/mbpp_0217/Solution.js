function first_Repeated_Char(str) {
    const h = {};
    for (const ch of str) {
        if (ch in h) {
            return ch;
        } else {
            h[ch] = 0;
        }
    }
    return '\0';
}
