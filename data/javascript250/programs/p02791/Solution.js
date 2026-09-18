var output;
var input = require("fs").readFileSync("/dev/stdin", "utf8").trim().split("\n");
var obj = {
  "list" : input,
  "index" : 0,
  "max" : input.length,
  "next" : function(){
    if(!this.hasNext()){return null;}
    var returnObj = this.list[this.index];
    this.index++;
    return returnObj;
  },
  "hasNext" : function(){return (this.index < this.max);}
}
Main();
function next(){return obj.next();}
function hasNext(){return obj.hasNext();}
function myout(t){console.log(t);}//standard output
function myerr(t){console.error(t);}//standard error
//[no]param
//不明値:何もしない 異常時:文字列「error」を返す（できる？）
//1:数値へ変換 2:半角SPで分割 4:半角SPで分割し、数値配列へ
//6:1文字に分割 7:1文字に分割し、数値配列へ
//8:半角SPで結合 9:改行で結合 0:文字なしで結合
function myconv(i,no){try{switch(no){case 1:return parseInt(i);case 2:return i.split(" ");case 4:return i.split(" ").map((a)=>Number(a));case 6:return i.split("");case 7:return i.split("").map((a)=>Number(a));case 8:return i.join(" ");case 9:return i.join("\n");case 0:return i.join("");default:return i;}}catch(e){return "error";}}
function Main() {
  var N = myconv(next(),1);
  var list = myconv(next(),4);
  var output = 0;
  var last = 0;
  for(var i = 0; i < N; i++){
    if(i == 0){
       output++;
      last = list[i];
    }else{
      if(last > list[i]){
         output++;
        last = list[i];
      }
    }
  }
  myout(output);
}
