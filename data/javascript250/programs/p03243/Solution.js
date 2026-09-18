// inputに入力データ全体が入る
function Main(input) {
  input = input.replace('\n', '');
  var N = parseInt(input);

  ans = 0;
  if(N >= 100 && N < 112){
    ans = 111;
  } else if(N >= 112 && N < 223){
    ans = 222;
  } else if(N >= 223 && N < 334){
    ans = 333;
  } else if(N >= 334 && N < 445){
    ans = 444;
  } else if(N >= 445 && N < 556){
    ans = 555;
  } else if(N >= 556 && N < 667){
    ans = 666;
  } else if(N >= 667 && N < 778){
    ans = 777;
  } else if(N >= 778 && N < 889){
    ans = 888;
  } else if(N >= 890 && N <= 999){
    ans = 999;
  }


  console.log('%d', ans);

}
//*この行以降は編集しないでください（標準入出力から一度に読み込み、Mainを呼び出します）
Main(require("fs").readFileSync("/dev/stdin", "utf8"));

