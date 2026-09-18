function groupTuples(input) {
    const out = {};
    for (const elem of input) {
        const key = elem[0];
        if (out.hasOwnProperty(key)) {
            out[key].push(...elem.slice(1));
        } else {
            out[key] = elem.slice();
        }
    }
    return Object.values(out);
}
