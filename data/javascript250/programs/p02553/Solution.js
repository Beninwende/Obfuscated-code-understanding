"use strict"
const create = () => {
    const input = require("fs").readFileSync("/dev/stdin", "utf8").trim().split("\n");
    const res = {
        "list": input, "index": 0, "max": input.length,
        "hasNext": function() {return this.index < this.max},
        "next": function() { if (!this.hasNext()) {throw "ArrayIndexOutOfBoundsException";}else{return this.list[this.index++];}}
    };
    return res;
}
const o = create();
const next = () => o.next()
const nextInt = () => parseInt(o.next())
const nextStrArray = () => o.next().split(" ")
const nextIntArray = () => o.next().split(" ").map(el => parseInt(el))
const nextCharArray = () => o.next().split("")
const hasNext = () => o.hasNext()
const myout = (...x) => console.log(...x)
const Main = () => {
    let [a,b,c,d] = nextStrArray().map(val => BigInt(val))
    let ac = a*c
    let ad = a*d
    let bc = b*c
    let bd = b*d
    let ans = -10000000000000000000
    if(a<=0n && b >= 0n || c<=0n && d >=0n){
        if(ans < ac) ans = ac
        if(ans < ad) ans = ad
        if(ans < bc) ans = bc
        if(ans < bd) ans = bd
        if(ans < 0) ans = 0n
    } else {
        if(ans < ac) ans = ac
        if(ans < ad) ans = ad
        if(ans < bc) ans = bc
        if(ans < bd) ans = bd
    }
    console.log(String(ans))
}
Main()

