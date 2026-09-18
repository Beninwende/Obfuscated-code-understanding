function myin(){return require("fs").readFileSync("/dev/stdin", "utf8").trim();}
function myout(t){console.log(t);}//standard output
function myerr(t){console.log(t);}//standard error
//[no]param
//0:何もしない  1:数値へ変換  2:半角SPで分割  3:改行で分割  4:半角SPで分割し、数値配列へ
//5:改行で分割し、数値配列へ  6:1文字に分割  7:1文字に分割し、数値配列へ
function myconv(i,no){switch(no){case 0:return i;case 1:return parseInt(i);case 2:return i.split(" ");case 3:return i.split("\n");case 4:return i.split(" ").map((a)=>Number(a));case 5:return i.split("\n").map((a)=>Number(a));case 6:return i.split("");case 7:return i.split("").map((a)=>Number(a));}}

function Main(input) {
  input = myconv(input,3);
  //次の地点に対して時間内にユークリッド距離で到達できること,かつ、t差と距離の偶奇が一致すること
  var N = myconv(input[0],1);
  var maeT = 0;
  var maeX = 0;
  var maeY = 0;
  for(var i = 1; i <= N; i++){
    var t = myconv(input[i],4)[0];
    var x = myconv(input[i],4)[1];
    var y = myconv(input[i],4)[2];
    var dt = Math.abs(t - maeT);
    var dx = Math.abs(x - maeX);
    var dy = Math.abs(y - maeY);
    if(dx + dy <= dt && (dx+dy) % 2 == dt % 2){
       maeT = t;
      maeX = x;
      maeY = y;
    }else{
      myout("No");
      return;
    }
  }
  myout("Yes");
}

Main(myin());
