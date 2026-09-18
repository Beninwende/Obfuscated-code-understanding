function overlapping(list1, list2) {
    const c = list1.length;
    const d = list2.length;
    for (let i = 0; i < c; i++) {
        for (let j = 0; j < d; j++) {
            if (list1[i] === list2[j]) {
                return 1;
            }
        }
    }
    return 0;
}
