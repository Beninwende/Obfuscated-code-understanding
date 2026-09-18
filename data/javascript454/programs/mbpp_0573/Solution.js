function uniqueProduct(listData) {
    const temp = [...new Set(listData)];
    let p = 1;
    for (const i of temp) {
        p *= i;
    }
    return p;
}
