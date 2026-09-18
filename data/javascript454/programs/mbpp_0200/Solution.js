function positionMax(list1) {
    const maxVal = Math.max(...list1);
    const maxResult = [];
    list1.forEach((value, index) => {
        if (value === maxVal) {
            maxResult.push(index);
        }
    });
    return maxResult;
}
