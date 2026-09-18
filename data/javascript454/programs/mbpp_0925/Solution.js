function mutiple_tuple(nums) {
    const temp = Array.from(nums);
    let product = 1;
    for (const x of temp) {
        product *= x;
    }
    return product;
}
