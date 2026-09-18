function main(input){
	var n = +input.shift();
	var m = +input.shift();

	var x = [];
	rep(n, function(i){
		x.push(i + 1);
	});

	rep(m, function(i){
		var t = input.shift().split(',');
		var a = t[0] - 1;
		var b = t[1] - 1;
		var tmp = x[a];
		x[a] = x[b];
		x[b] = tmp;
	});

	rep(n, function(i){
		console.log(x[i]);
	});
}

function rep(n, func){
	for(var i = 0; i < n; ++i){
		func(i);
	}
}

(function(){
	process.stdin.resume();
	process.stdin.setEncoding('utf8');
	var input = '';
	process.stdin.on('data', function(chunk){
		input += chunk;
	});
	process.stdin.on('end', function(){
		main(input.split(/\s+/));
	});
})();