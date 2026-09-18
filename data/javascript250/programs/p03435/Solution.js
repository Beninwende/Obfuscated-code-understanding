function myin(){return require("fs").readFileSync("/dev/stdin", "utf8").trim();}
function myout(t){console.log(t);}//standard output
function myerr(t){console.error(t);}//standard error
//[no]param
//0:何もしない  1:数値へ変換  2:半角SPで分割  3:改行で分割  4:半角SPで分割し、数値配列へ
//5:改行で分割し、数値配列へ  6:1文字に分割  7:1文字に分割し、数値配列へ
function myconv(i,no){switch(no){case 0:return i;case 1:return parseInt(i);case 2:return i.split(" ");case 3:return i.split("\n");case 4:return i.split(" ").map((a)=>Number(a));case 5:return i.split("\n").map((a)=>Number(a));case 6:return i.split("");case 7:return i.split("").map((a)=>Number(a));}}
function Main(input) {
  input = myconv(input,3);
  input[0] = myconv(input[0],4);
  input[1] = myconv(input[1],4);
  input[2] = myconv(input[2],4);
  //行中の0-1番目の差、1-2番目の差がすべての行で一致している
  //または、列中の0-1番目の差、1-2番目の差がすべての列で一致している
  var output = "Yes";
  var gyo112 = Math.abs(input[0][0] - input[0][1]);
  var gyo212 = Math.abs(input[1][0] - input[1][1]);
  var gyo312 = Math.abs(input[2][0] - input[2][1]);
  var gyo123 = Math.abs(input[0][2] - input[0][1]);
  var gyo223 = Math.abs(input[1][2] - input[1][1]);
  var gyo323 = Math.abs(input[2][2] - input[2][1]);
  var retu112 = Math.abs(input[0][0] - input[1][0]);
  var retu212 = Math.abs(input[0][1] - input[1][1]);
  var retu312 = Math.abs(input[0][2] - input[1][2]);
  var retu123 = Math.abs(input[2][0] - input[1][0]);
  var retu223 = Math.abs(input[2][1] - input[1][1]);
  var retu323 = Math.abs(input[2][2] - input[1][2]);
  if(gyo112 != gyo212 || gyo212 != gyo312 || gyo112 != gyo312
    || retu112 != retu212 || retu212 != retu312 || retu112 != retu312
    || gyo123 != gyo223 || gyo223 != gyo323 || gyo123 != gyo323
    || retu123 != retu223 || retu223 != retu323 || retu123 != retu323){
    output = "No" ;
  }
  myout(output);
}
Main(myin());
