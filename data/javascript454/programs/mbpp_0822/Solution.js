function passValidity(p) {
    let x = true;
    while (x) {
        if (p.length < 6 || p.length > 12) {
            break;
        } else if (!/[a-z]/.test(p)) {
            break;
        } else if (!/[0-9]/.test(p)) {
            break;
        } else if (!/[A-Z]/.test(p)) {
            break;
        } else if (!/[$#@]/.test(p)) {
            break;
        } else if (/\s/.test(p)) {
            break;
        } else {
            return true;
            x = false;
            break;
        }
    }
    if (x) {
        return false;
    }
}
