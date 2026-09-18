var input = function()
{
  return require('fs').readFileSync('/dev/stdin', 'utf8');
};

var range = function(a,b)
{
  var array = [];
  for (var i = a; i <= b; i++) {
    array.push(i);
  }
  return array;
}

var getKeyNum = function()
{
  return 3;
}

var out = function(x)
{
  console.log(x);
  return x;
}

var check = function(a,b)
{
  if(a==1)a='';
  
  if (checkNum(b)==true)
  {
    return a + ' ' + b;
  }
  if (includeNum(b)==true)
  {
    return a + ' ' + b;
  }
  return a;
}

var checkNum = function(x)
{
  if (x%getKeyNum() == 0)
  {
    return true;
  }
  return false;
}

var includeNum = function(x)
{
  var result =x;
  while (result !=0) {
    if (result%10 == getKeyNum()) {
      return true;
    }
    result = Math.floor(result/10);
  }
  return false;
}

out(range(1,input()).reduce(check));