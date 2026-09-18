function pairWise(l1) {
    const temp = [];
    for (let i = 0; i < l1.length - 1; i++) {
        const currentElement = l1[i];
        const nextElement = l1[i + 1];
        temp.push([currentElement, nextElement]);
    }
    return temp;
}
