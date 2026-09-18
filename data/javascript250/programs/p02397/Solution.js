
process.stdin.resume();
process.stdin.setEncoding('utf8');

process.stdin.on('data', function (chunk) {
    const n = chunk.toString();
    n.split('\n')
        .filter(x => x !== "")
        .map(x => x.split(' ')
            .map(x => Number(x)))
        .map(x => sortary(x[0],x[1]))
        .forEach(x => {
            if (x[0] != 0 || x[1] != 0) {
                console.log(`${x[0]} ${x[1]}`);
            }
        });
})

function sortary(a,b){
    if(a>b){
        return [b,a];
    }
        return [a,b];
}
