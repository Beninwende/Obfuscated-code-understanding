function sortTuple(tup) {
    let lst = tup.length;
    for (let i = 0; i < lst; i++) {
        for (let j = 0; j < lst - i - 1; j++) {
            if (tup[j][tup[j].length - 1] > tup[j + 1][tup[j + 1].length - 1]) {
                let temp = tup[j];
                tup[j] = tup[j + 1];
                tup[j + 1] = temp;
            }
        }
    }
    return tup;
}
