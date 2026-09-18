function Split(list) {
    const ev_li = [];
    for (const i of list) {
        if (i % 2 === 0) {
            ev_li.push(i);
        }
    }
    return ev_li;
}
