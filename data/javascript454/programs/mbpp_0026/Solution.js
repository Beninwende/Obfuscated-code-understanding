function checkKElements(testList, K) {
    let res = true;
    for (const tup of testList) {
        for (const ele of tup) {
            if (ele !== K) {
                res = false;
            }
        }
    }
    return res;
}
