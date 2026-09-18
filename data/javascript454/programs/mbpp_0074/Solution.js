function isSamePatterns(colors, patterns) {
    if (colors.length !== patterns.length) {
        return false;
    }
    const sdict = {};
    const pset = new Set();
    const sset = new Set();
    for (let i = 0; i < patterns.length; i++) {
        pset.add(patterns[i]);
        sset.add(colors[i]);
        const key = patterns[i];
        if (!sdict[key]) {
            sdict[key] = [];
        }
        sdict[key].push(colors[i]);
    }
    if (pset.size !== sset.size) {
        return false;
    }
    for (const values of Object.values(sdict)) {
        for (let i = 0; i < values.length - 1; i++) {
            if (values[i] !== values[i + 1]) {
                return false;
            }
        }
    }
    return true;
}
