process.stdin.resume();
process.stdin.setEncoding('utf8');

process.stdin.on('data', function (chunk) {
    const n = chunk.toString()
        .split("\n")
        .filter(x => x !== "0 0" && x !== "")
        .map(x => x.split(" ")); // [[3, 4], [5, 6], [3, 3] ...]

    const ans = n.map(x => makeOneAns(Number(x[0]), Number(x[1])));
    ans.forEach(x => {
        x.forEach((y, i) => {
            console.log(y)

        });
    });
});


function makeOneAns(height, width) {
    let ans = []
    for (let i = 0; i < height; i++) {
        if (i % 2 === 0) {
            ans.push(makeEvenLine(width));
        } else {
            ans.push(makeOddLine(width));
        }
    }
    ans.push("")
    return ans
}

function makeOddLine(num) {
    let ans = "";
    for (let i = 0; i < num; i++) {
        if (i % 2 === 0) {
            ans = ans + "."
        } else {
            ans = ans + "#"
        }
    }
    return ans;
}

function makeEvenLine(num) {
    let ans = "";
    for (let i = 0; i < num; i++) {
        if (i % 2 !== 0) {
            ans = ans + "."
        } else {
            ans = ans + "#"
        }
    }
    return ans;
}
