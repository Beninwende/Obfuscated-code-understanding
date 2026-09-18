function removeEven(arr) {
    for (const num of arr) {
        if (num % 2 === 0) {
            const index = arr.indexOf(num);
            if (index !== -1) {
                arr.splice(index, 1);
            }
        }
    }
    return arr;
}
