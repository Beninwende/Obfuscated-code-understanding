var input = function()
{
  return input= require('fs').readFileSync('/dev/stdin', 'utf8').split(" ").map(Number);
};

var out = function(x)
{
  console.log(x);
  return x;
}

var divInt =function(a,b)
{
  return Math.floor(a/b);
}

var rem = function(a,b)
{
  return a%b;
}

var div = function(a,b)
{
  return (a/b).toFixed(5);
}

var calc = function(x)
{
  var str = divInt(x[0],x[1]) +" " +  rem(x[0],x[1]) +" " + div(x[0],x[1]);
  out(str);
  return str;
};

calc(input());