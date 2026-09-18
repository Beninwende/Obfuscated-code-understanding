//Don't have to see. start------------------------------------------
var read = require('readline').createInterface({
  input: process.stdin, output: process.stdout
});
var obj; var inLine = [];
read.on('line', function(input){inLine.push(input);});
read.on('close', function(){
  obj = init(inLine);
  console.error('\n');
  var start = Date.now();
  Main();
  var end = Date.now() - start;
  myerr('time : ' + end + 'ms');
  myerr('memory : ' + Math.round(process.memoryUsage().heapTotal / 1024) + 'KB');
});
function makeClone(obj){return (obj instanceof Set) ? new Set(Array.from(obj)) : JSON.parse(JSON.stringify(obj));}
function nextInt(){return myconv(next(),1);} function nextStrArray(){return myconv(next(),2);}
function nextIntArray(){return myconv(next(),4);} function nextCharArray(){return myconv(next(),6);}
function next(){return obj.next();} function hasNext(){return obj.hasNext();}
function init(input){  
  return {
    list : input, index : 0, max : input.length,
    hasNext : function(){return (this.index < this.max);},
    next : function(){if(this.hasNext()){return this.list[this.index++];}else{throw 'ArrayIndexOutOfBoundsException ‚There is no more input';}}
  };
}
function myout(s){console.log(s);}
function myerr(s){console.error('debug:' + require('util').inspect(s,false,null));}
//param "no" is
//unknown or outlier : return i. 1: parseInt.
//2: split space. 4: split space and parseInt.
//6: split 1 character. 7: split 1 character and parseInt.
//8: join space. 9: join nextline. 0: join no character.
function myconv(i,no){try{switch(no){case 1:return parseInt(i);case 2:return i.split(' ');case 4:return i.split(' ').map(Number);case 6:return i.split('');case 7:return i.split('').map(Number);case 8:return i.join(' ');case 9:return i.join('\n');case 0:return i.join('');default:return i;}}catch(e){return i;}}

//Don't have to see. end------------------------------------------
function Main(){
  var N = nextInt();
  var output = "";
  var map = {};
  var list = "abcdefghijklmnopqrstuvwxyz".split("");
  for(var i = 0; i < list.length; i++){
    map[i + 1] = list[i];
  }
  map[0] = "z";
  var count = 1;
  while(true){
    var min = Math.pow(26, count) + Math.pow(26, count - 1);
    if(N >= min){
      count++;
    }else{
      break;
    }
  }
  while(N > 0){
    var single = N % 26;
    if(single == 0){
      N -= 26;
    }
    output = map[single] + output;
    N = Math.floor(N / 26);
  }
  myout(output);
}
