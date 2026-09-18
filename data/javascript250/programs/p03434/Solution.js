function myin(){return require("fs").readFileSync("/dev/stdin", "utf8").trim();}
function myout(t){console.log(t);}//standard output
//[no]param
//0:noConvert	1:singleNum	2:spaceList	3:newLineList
//4:spaceNumList	5:newLineNumList	6:oneCharList	7:oneCharNumList
function myconv(i,no){switch(no){case 0:return i;case 1:return parseInt(i);case 2:return i.split(" ");case 3:return i.split("\n");case 4:return i.split(" ").map((a)=>Number(a));case 5:return i.split("\n").map((a)=>Number(a));case 6:return i.split("");case 7:return i.split("").map((a)=>Number(a));}}

function Main(input) {
  input = myconv(input,3);
  var N = myconv(input[0],1);
  var list = myconv(input[1],4).sort(function(a,b){
  	return b - a;
  });
  var alice = 0;
  var bob = 0;
  for(var i = 0; i < list.length; i++){
    if(i % 2 == 0){
       alice += list[i];
       }else{
       bob += list[i];
       }
  }
  myout(alice - bob);
}

Main(myin());
