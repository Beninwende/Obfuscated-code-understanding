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

var re = /\s+|$/;
reader.on('close', () => {
    var rc = []
    var line=lines.shift() 
    var x=line.trim().split(' ').map(Number)
    var r=x[0]
    var c=x[1]
    
    while (lines.length > 0) {
	line=lines.shift()
	var l = line.trim().split(' ').map(Number);
	rc.push(l)
    }

    var rc1=aux(rc);

    rc1=rc.map(x=>x.map(y=>y.toString()).join(' '))
    rc1.forEach(x=>console.log(x))

});

function dump(rc)
{
    var n=rc.length
    var m=rc[0].length
    console.log("n: "+ n+" m: "+m)
    for (var i=0;i<n; i++){
	console.log(rc[i].map(Number).join(' '))
    }
	
}
function sum(r)
{
    return r.reduce(function(s,x){return s+x},0)
}

function aux(rc)
{
    rc.forEach(r=>r.push(sum(r)))
    //dump(rc)
    const cl=rc[0].length
    const rl=rc.length

    var cs=[]
    for (var j=0; j<cl; j++){
	let s=0
	for (var i=0; i<rl; i++){
	    s += rc[i][j]
	}
	cs.push(s)
    }
    rc.push(cs)
    //dump(rc)

    return(rc)
}
