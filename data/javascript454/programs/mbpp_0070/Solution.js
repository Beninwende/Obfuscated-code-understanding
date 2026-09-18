function findEqualTuple(input, k) {
    let flag = 1;
    for (const tup of input) {
        if (tup.length !== k) {
            flag = 0;
            break;
        }
    }
    return flag;
}

function getEqual(input, k) {
    if (findEqualTuple(input, k) === 1) {
        return "All tuples have same length";
    } else {
        return "All tuples do not have same length";
    }
}
