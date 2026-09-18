
function Main(inputData) {
    init(inputData);
    
    var n = inI();
    var cnt = 0;
    for(var i = 1; i <= n;i+=2){
	var cnt8 = 0;
	for(var j = 1; j <= i; j++){
	    if(i%j == 0)cnt8++;
	}
	if(cnt8 == 8)cnt++;
    }
    outln(cnt);
}

////////////////////////////////////////////////////////////////////////////////////
var input,inputCnt;

// "実行する"ボタンを押した時に実行される関数 (デバッグ用)
function debug(){
	Main(document.getElementById("input").value);
}

function init(inputData){
    //配列inputに順番に代入
	input = inputData.replace( /\n/g , " " );
	input = input.split(" ");
	inputCnt = 0;
}
//output
const out = (output) => { console.log(output) }
const outln = (output) => { console.log(output+"\n") }

//input
const inS = () => {return input[inputCnt++]};
const inI = () => {return parseInt(inS(), 10)};
const inF = () => {return parseFloat(inS())};

//prototype
Array.prototype.rsort = function(){
  return this.sort(function(a,b){return (a<b ? 1:-1);});
}

Array.prototype.max = function(){
  return Math.max.apply(null, this);
}

Array.prototype.min = function(){
  return Math.min.apply(null, this);
}

//function
function values(array) {
    var values = [];
    if(array)for(var key in array)values.push(array[key]);
    return values;
};

function keys(array) {
    var keys = [];
    if(array)for(var key in array)keys.push(key);
    return keys;
};

//*この行以降は編集しないでください（標準入出力から一度に読み込み、Mainを呼び出します）
Main(require("fs").readFileSync("/dev/stdin", "utf8"));
