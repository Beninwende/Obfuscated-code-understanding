function maxVolume(s) {
    let maxValue = 0;
    for (let i = 0; i < s - 1; i++) {
        for (let j = 0; j < s; j++) {
            const k = s - i - j;
            maxValue = Math.max(maxValue, i * j * k);
        }
    }
    return maxValue;
}
