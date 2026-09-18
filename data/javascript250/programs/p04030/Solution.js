process.stdin.resume();
process.stdin.setEncoding('ascii');

var input_stdin = "";
var input_stdin_array = "";
var input_currentline = 0;

process.stdin.on('data', function (data) {
    input_stdin += data;
});

process.stdin.on('end', function () {
    input_stdin_array = input_stdin.split("\n");
    main();    
});

function readLine() {
    return input_stdin_array[input_currentline++];
}

/////////////// ignore above this line ////////////////////

function hacking(s) {
    var ret="";
    for (var i=0; i < s.length; i++){
        if (s[i] == '0'){
            ret += '0';
        } else if (s[i] == '1'){
            ret += '1';
        } else if (s[i] == 'B' && ret.length > 0){
            ret = ret.substr(0, ret.length-1);
        }
    }
    return ret;
}

function main() {
    //var l = parseInt(readLine());
    var s = readLine();
    var result = hacking(s);
    process.stdout.write("" + result + "\n");
}
