function Main(input) {
    input = input.split(" ")
    var a = parseInt(input[0]); 
    var b = parseInt(input[1]);
    var c = parseInt(input[2]);
    if (a <= b && b <= c && a <= c) { //123
        console.log(a + " " + b + " " + c);
    }else if (a <= b && c <= b && a <= c) { //132
        console.log(a + " " + c + " " + b);
    }else if (b <= a && b <= c && a <= c) { //213
        console.log(b + " " + a + " " + c);
    }else if (a <= b && c <= b && c <= a) { //231
        console.log(c + " " + a + " " + b);
    }else if (b <= a && b <= c && c <= a) { //312
        console.log(b + " " + c + " " + a);
    }else if (b <= a && c <= b && c <= a) { //321
        console.log(c + " " + b + " " + a);
    }
}
// "実行する"ボタンを押した時に実行される関数 (デバッグ用)
function debug() {
    var input = document.getElementById("input").value;
    Main(input);
}

//* この行以降は編集しないでください（標準入出力から一度に読み込み、Mainを呼び出します）
Main(require("fs").readFileSync("/dev/stdin", "utf8"));
