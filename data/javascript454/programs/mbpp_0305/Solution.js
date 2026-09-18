function startWithP(words) {
    for (const w of words) {
        const m = w.match(/^(P\w+)\W(P\w+)/);
        if (m) {
            return [m[1], m[2]];
        }
    }
}
