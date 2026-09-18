function luckyNum(n) {
    let List = [];
    for (let v = -1; v < n * n + 9; v += 2) {
        List.push(v);
    }
    let i = 2;
    while (List.slice(i).length) {
        const step = List[i];
        const toRemove = new Set();
        for (let idx = step; idx < List.length; idx += step) {
            toRemove.add(List[idx]);
        }
        List = List.filter(x => !toRemove.has(x));
        i++;
    }
    return List.slice(1, n + 1);
}
