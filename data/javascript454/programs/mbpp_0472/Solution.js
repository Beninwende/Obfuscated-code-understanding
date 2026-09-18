function checkConsecutive(arr) {
    const sorted = [...arr].sort((a, b) => a - b);
    const min = sorted[0];
    const max = sorted[sorted.length - 1];
    const range = Array.from({ length: max - min + 1 }, (_, i) => min + i);
    if (sorted.length !== range.length) return false;
    return sorted.every((v, i) => v === range[i]);
}
