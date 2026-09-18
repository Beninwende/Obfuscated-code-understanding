function maxChar(str1) {
    const counts = {};
    for (const char of str1) {
        counts[char] = (counts[char] || 0) + 1;
    }
    let maxChar = '';
    let maxCount = 0;
    for (const char in counts) {
        if (counts[char] > maxCount) {
            maxCount = counts[char];
            maxChar = char;
        }
    }
    return maxChar;
}
