function myin(){return require("fs").readFileSync("/dev/stdin", "utf8").trim();}
function myout(t){console.log(t);}//standard output
//[no]param
//0:何もしない  1:数値へ変換  2:半角SPで分割  3:改行で分割  4:半角SPで分割し、数値配列へ
//5:改行で分割し、数値配列へ  6:1文字に分割  7:1文字に分割し、数値配列へ
function myconv(i,no){switch(no){case 0:return i;case 1:return parseInt(i);case 2:return i.split(" ");case 3:return i.split("\n");case 4:return i.split(" ").map((a)=>Number(a));case 5:return i.split("\n").map((a)=>Number(a));case 6:return i.split("");case 7:return i.split("").map((a)=>Number(a));}}

function Main(input) {
  input = myconv(input,3);
  var N = myconv(input[0],4)[0];
  var M = myconv(input[0],4)[1];
  var X = myconv(input[0],4)[2];
  var costlist = myconv(input[1],4);
  
  var mass = new Array(N+1).fill(0);
  for(var i = 0; i < M; i++){
    mass[costlist[i]] = 1;
  }
  //myout(mass);
  var output1 = 0;
  var output2 = 0;
  for(var i = X+1; i <= N; i++){
    if(mass[i] == 1){
       output1++;
    }
  }
  for(var i = X-1; i >= 0; i--){
    if(mass[i] == 1){
       output2++;
    }
  }
  myout(Math.min(output1,output2));
}

Main(myin());
