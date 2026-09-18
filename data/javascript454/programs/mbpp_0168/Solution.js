function frequency(a, x) {
    let count = 0;
    for (const i of a) {
        if (i === x) {
            count++;
        }
    }
    return count;
}
