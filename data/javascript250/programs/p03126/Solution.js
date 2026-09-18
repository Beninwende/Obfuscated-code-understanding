"use strict"
function Main(stdin){
stdin = stdin.trim().split("\n").reverse();
let stdout = [];
function input(){return stdin.pop()};
function maput(){return input().split(" ").map(n=>parseInt(n))};
function print(x){stdout.push(x)};
function exist(x, xs){return xs.indexOf(x) > -1}
function max(x){return x.reduce(function(a,b){ return Math.max(a,b) }) }
function min(x){return x.reduce(function(a,b){ return Math.min(a,b) }) }
function sum(x){return x.reduce(function(a,b){ return a+b }) }
function sorting(x, index){x.sort((a, b) => a[index] - b[index])}
function all(x){return x.reduce(function(a,b){ return a && b }) }
function any(x){return x.reduce(function(a,b){ return a || b }) }
function list(iterable){return Array.from(iterable)}
function vint(iterable){return Array.from(iterable, x => parseInt(x))}
function tile(val, len){return Array(len).fill(val)}
const range = (start, stop, step) => Array.from(
    { length: (stop - start) / step }, (_, i) => start + (i * step));
/*START*/

function diff(setA, setB) {
    var _difference = new Set(setA);
    for (var elem of setB) {
        _difference.delete(elem);
    }
    return _difference;
}


let tmp = maput()
let n = tmp[0]
let m = tmp[1]
let s = new Set(range(1, m+1, 1))
let t = new Set(range(1, m+1, 1)) 
for (let i = 0; i < n; i++){
    let tmp = new Set(maput().slice(1))
    s = diff(s, diff(t, tmp))
}

print(list(s).length)



/*END*/
stdout = stdout.join("\n");
console.log(stdout);
return stdout
}
Main(require("fs").readFileSync("/dev/stdin", "utf8"))