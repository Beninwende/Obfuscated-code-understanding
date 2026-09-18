function Split(list) {
    const od_li = [];
    for (const i of list) {
        if (i % 2 !== 0) {
            od_li.push(i);
        }
    }
    return od_li;
}
