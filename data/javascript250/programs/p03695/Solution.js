function myin(){return require("fs").readFileSync("/dev/stdin", "utf8").trim();}
function myout(t){console.log(t);}//standard output
function myerr(t){console.error(t);}//standard error
//[no]param
//0:何もしない  1:数値へ変換  2:半角SPで分割  3:改行で分割  4:半角SPで分割し、数値配列へ
//5:改行で分割し、数値配列へ  6:1文字に分割  7:1文字に分割し、数値配列へ
function myconv(i,no){switch(no){case 0:return i;case 1:return parseInt(i);case 2:return i.split(" ");case 3:return i.split("\n");case 4:return i.split(" ").map((a)=>Number(a));case 5:return i.split("\n").map((a)=>Number(a));case 6:return i.split("");case 7:return i.split("").map((a)=>Number(a));}}
function Main(input) {
  input = myconv(input,3);
  var N = myconv(input[0],1);
  var list = myconv(input[1],4);
  var set = {
  	"gray" : false,
    "brown" : false,
    "green" : false,
    "water" : false,
    "blue" : false,
    "yellow" : false,
    "orange" : false,
    "red" : false,
    "all" : 0
  };
  var notall = 0;
  for(var i = 0; i < N; i++){
    if(list[i] >=1 && list[i] <= 399 && !set["gray"]){
       set["gray"] = true;
      notall++;
    }
    if(list[i] >=400 && list[i] <= 799 && !set["brown"]){
       set["brown"] = true;
      notall++;
    }
    if(list[i] >=800 && list[i] <= 1199 && !set["green"]){
       set["green"] = true;;
      notall++;
    }
    if(list[i] >=1200 && list[i] <= 1599 && !set["water"]){
       set["water"] = true;
      notall++;
    }
    if(list[i] >=1600 && list[i] <= 1999 && !set["blue"]){
       set["blue"] = true;
      notall++;
    }
    if(list[i] >=2000 && list[i] <= 2399 && !set["yellow"]){
       set["yellow"] = true;
      notall++;
    }
    if(list[i] >=2400 && list[i] <= 2799 && !set["orange"]){
       set["orange"] = true;
      notall++;
    }
    if(list[i] >=2800 && list[i] <= 3199 && !set["red"]){
       set["red"] = true;
      notall++;
    }
    if(list[i] >=3200){
       set["all"]++;
    }
  }
  myerr(set);
  var min = notall;
  var max = notall + set["all"];
  if(min == 0 && set["all"] >=1){
     min = 1;
  }
  myout(min + " " + max);
}
Main(myin());