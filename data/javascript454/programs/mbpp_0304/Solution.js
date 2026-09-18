function find_Element(arr, ranges, rotations, index) {
    for (let i = rotations - 1; i >= 0; i--) {
        const left = ranges[i][0];
        const right = ranges[i][1];
        if (left <= index && right >= index) {
            if (index === left) {
                index = right;
            } else {
                index = index - 1;
            }
        }
    }
    return arr[index];
}
