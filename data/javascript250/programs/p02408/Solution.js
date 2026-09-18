process.stdin.resume();
process.stdin.setEncoding('utf8');

process.stdin.on('data', function (chunk) {
    const n = chunk.toString();
    const r = n.split("\n");
    const output = [];
    const all = ["S 1","S 2","S 3","S 4","S 5","S 6","S 7","S 8","S 9","S 10","S 11","S 12","S 13","H 1","H 2","H 3","H 4","H 5","H 6","H 7","H 8","H 9","H 10","H 11","H 12","H 13","C 1","C 2","C 3","C 4","C 5","C 6","C 7","C 8","C 9","C 10","C 11","C 12","C 13","D 1","D 2","D 3","D 4","D 5","D 6","D 7","D 8","D 9","D 10","D 11","D 12","D 13"];

    for(let i = 0; i<all.length; i++){
        if(r.some(item => item === all[i])===false){
            output.push(all[i]);
        }
    }
    const S = output.filter(item => item.includes("S"));
    const H = output.filter(item => item.includes("H"));
    const C = output.filter(item => item.includes("C"));
    const D = output.filter(item => item.includes("D"));
    S.sort(st);
    H.sort(st);
    C.sort(st);
    D.sort(st);
    S.forEach(x => console.log(x));
    H.forEach(x => console.log(x));
    C.forEach(x => console.log(x));
    D.forEach(x => console.log(x));
});

function st(a, b){
    const x = a.split(" ");
    const y = b.split(" ");
    const d = Number(x[1]);
    const q = Number(y[1]);
    return d - q;
}
