process.stdin.resume();
process.stdin.setEncoding('ascii');

var input_stdin = "";
var input_stdin_array = "";
var input_currentline = 0;

process.stdin.on('data', function (data) {
    input_stdin += data;
});
/*
process.on('SIGINT', function(){
    input_stdin_array = input_stdin.split("\n");
    main();
    process.exit();
});
*/
process.stdin.on('end', function () {
    input_stdin_array = input_stdin.split("\n");
    main();    
});

function readLine() {
    return input_stdin_array[input_currentline++];
}

/////////////// ignore above this line ////////////////////


function main() {
	var s = readLine();
	var alpha = "qwertyuiopasdfghjklzxcvbnm";
	var cont = {};
	
	/*Initialazing asociative array cont*/
	for (var i=0; i < alpha.length; i++){
		cont[alpha.charAt(i)]=0;
	}
	
	for (var i=0; i < s.length; i++){
		cont[s.charAt(i)]++;
	}
	
	for (var i=0; i < alpha.length; i++){
		if (cont[alpha.charAt(i)]%2 == 1){
			console.log("No");
			return;
		}
	}
	console.log("Yes");
}