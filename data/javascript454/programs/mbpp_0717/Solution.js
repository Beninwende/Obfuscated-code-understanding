function avg_calc(ls) {
    const n = ls.length;
    if (n <= 1) {
        return Number(ls[0]);
    }
    let mean = 0.0;
    for (const el of ls) {
        mean += Number(el);
    }
    return mean / n;
}

function sd_calc(data) {
    const n = data.length;
    if (n <= 1) {
        return 0.0;
    }
    const mean = avg_calc(data);
    let sd = 0.0;
    for (const el of data) {
        sd += (Number(el) - mean) ** 2;
    }
    return Math.sqrt(sd / (n - 1));
}
