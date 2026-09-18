function main(){
	var n = scan();
	var x = 100000;
	rep(n, function(){
		x += x / 20;
		if(x % 1000 > 0){
			x = (Math.floor(x / 1000) + 1) * 1000;
		}
	});
	print(x);
}
 
function rep(a, b, c){
	if(c == null){
		c = b;
		b = a;
		a = 0;
	}
	for(var i = a; i < b; ++i){
		c(i);
	}
}
 
process.stdin.resume();
process.stdin.setEncoding('utf8');
 
var input = '';
var input_index = 0;
 
function scan(type){
	if(type === 'string'){
		return input[input_index++];
	}
	else{
		return +input[input_index++];
	}
}
 
function print(val){
	console.log(val);
}
 
process.stdin.on('data', function(chunk){
	input += chunk;
});
process.stdin.on('end', function(){
	input = input.split(/\s+/);
	main();
});