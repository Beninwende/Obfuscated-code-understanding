var input = function()
{
  return input= require('fs').readFileSync('/dev/stdin', 'utf8').split('\n');
};

var out = function(x)
{
  console.log(x);
  return x;
}

var add =function(a,b)
{
  return a+b;
}

var sub = function(a,b)
{
  return a-b;
}

var mult = function(a,b)
{
  return a*b;
}

var dev = function(a,b)
{
  return Math.floor(a/b);
}

var operatorSelect = function(x)
{
  if(x=='+')return add;
  if(x=='-')return sub;
  if(x=='*')return mult;
  if(x=='/')return dev;
  if(x=='?')return "end";
  return "end";
}

var calc = function(a,op,b)
{
  var f = operatorSelect(op);
  if (f=="end")
  {
    return;
  }
  var str = f(a,b)
  out(str);
  return str;
};

var array = input();
array.forEach(function(a){
  var x = a.split(' ');
  calc(Number(x[0]),x[1],Number(x[2]));
});