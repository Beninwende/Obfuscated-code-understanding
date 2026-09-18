process.stdin.resume();
process.stdin.setEncoding('utf8');

var lines = []
var reader = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout
});

reader.on('line', (line) => {
  lines.push(line);
});

reader.on('close', () => {
 var ab = lines[0].split(' ');
 var a = Number(ab[0]);
 var b = Number(ab[1]);
 var count = 0;
 
 var s = lines[1].split('');
 if(s[a] !== '-'){
   count++;
 }

 if(s.length !== a+b+1){
   count++;
 }

 for(i=0; i<a; i++){
   s[i] = Number(s[i]);
 
   if(s[i] == 0 || s[i] == 1 || s[i] == 2 || 
      s[i] == 5 || s[i] == 4 || s[i] == 3 ||
      s[i] == 6 || s[i] == 7 || s[i] == 8 || s[i] == 9)
    {}else{
      count++;
    }
 }

 for(i=a+1; i<a+b+1; i++){
   s[i] = Number(s[i]);
   
   if(s[i] == 0 || s[i] == 1 || s[i] == 2 || 
      s[i] == 5 || s[i] == 4 || s[i] == 3 ||
      s[i] == 6 || s[i] == 7 || s[i] == 8 || s[i] == 9)
    {}else{
      count++;
    }
 }

 if(count == 0){
   console.log('Yes');
 }else{
   console.log('No');
 }
});