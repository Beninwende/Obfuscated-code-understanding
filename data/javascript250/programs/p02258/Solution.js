function main(){
	var n = scan();
	var x = Array(n);
	rep(n, function(i){
		x[i] = scan();
	});

	var y;
	for(var i = n - 2; i >= 0; --i){
		if(y === undefined || y < x[i + 1] - x[i]){
			y = x[i + 1] - x[i];
		}
		x[i] = Math.max(x[i], x[i + 1]);
	}
	print(y);
}

function rep(n, func){
	for(var i = 0; i < n; ++i){
		func(i);
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