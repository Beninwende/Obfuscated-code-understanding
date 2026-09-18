function extractElements(numbers, n) {
    const result = [];
    let i = 0;
    while (i < numbers.length) {
        let count = 1;
        while (i + count < numbers.length && numbers[i + count] === numbers[i]) {
            count++;
        }
        if (count === n) {
            result.push(numbers[i]);
        }
        i += count;
    }
    return result;
}
