
function main(inputData) {
    var output = [];
    for(var i = 0; i < inputData.length; i++) {
        if(0 != inputData[i]) {
            output.push('Case ' + (i + 1) + ': ' + inputData[i]);
        }
    }
    console.log(output.join('\n'));
  }
  
  process.stdin.resume();
  var input = '';  
  process.stdin.setEncoding('utf-8');
  process.stdin.on('data', function(chunk) {
    input += chunk;
  });
  process.stdin.on('end', function() {
    var inputData = input.split('\n');
    main(inputData);
  });