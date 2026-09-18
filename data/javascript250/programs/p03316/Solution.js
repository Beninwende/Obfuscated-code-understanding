function myin(){return require("fs").readFileSync("/dev/stdin", "utf8").trim();}
function myout(text){console.log(text);}//standard output
//[no]param
//0:noConvert	1:singleNum	2:spaceList	3:newLineList	4:spaceNumList	5:newLineNumList
function myconv(i,no){switch(no){case 0:return i;case 1:return parseInt(i);case 2:return i.split(" ");case 3:return i.split("\n");case 4:return i.split(" ").map((a)=>Number(a));case 5:return i.split("\n").map((a)=>Number(a));}}

function Main(input) {
  input = myconv(input,1);
  var tmpInput = input.toString();
  var check = 0;
  for(var i = 0; i < tmpInput.length; i++){
    check += parseInt(tmpInput.slice(i,i+1));
  }
  if(input % check == 0){
     myout("Yes");
     }else{
     myout("No");
     }
  
}

Main(myin());
