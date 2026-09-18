function wordLen(s) {
    const words = s.split(' ');
    for (let word of words) {
        if (word.length % 2 === 0) {
            return true;
        } else {
            return false;
        }
    }
}
