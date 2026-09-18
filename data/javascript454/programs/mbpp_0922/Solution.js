function maxProduct(arr) {
    const arrLen = arr.length;
    if (arrLen < 2) {
        return null;
    }
    let x = arr[0], y = arr[1];
    for (let i = 0; i < arrLen; i++) {
        for (let j = i + 1; j < arrLen; j++) {
            if (arr[i] * arr[j] > x * y) {
                x = arr[i];
                y = arr[j];
            }
        }
    }
    return [x, y];
}
