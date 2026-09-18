// ITP1_4_B
"use strict";
process.stdin.resume();
process.stdin.setEncoding('utf8');

var lines = []
var reader = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

reader.on('line', (line) => {
  lines.push(line);
});
/* 入力は 
2
*/
reader.on('close', () => {
    var s, l;
    var r = Number(lines[0]);
    [s, l] = aux(r);
    console.log(s.toString()+' '+l.toString());
});

function aux(r)
{
    var s = Math.PI*r*r;
    var l = Math.PI*2*r;

    return([s.toFixed(6), l.toFixed(6)]);
}
