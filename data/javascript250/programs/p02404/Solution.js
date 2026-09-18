var input = function()
{

  return require('fs').readFileSync('/dev/stdin', 'utf8').split('\n');
};

var out = function(x)
{
  console.log(x);
  return x;
}

var drawRect = function(H,W)
{
  var rect = "";
  for (var i = 0; i < H; i++)
  {
    if (i==0 || i==H-1)
    {
      rect = rect+drawLineFrame(W);
    }
    else
    {
      rect = rect+drawLine(W);
    }

  }
  out(rect);
  return rect;
}

var drawLineFrame = function(W)
{
  var line = "";
  for(i=0;i<W;i++)
  {
    line = line+'#';
  }
  line = line+'\n';
  return line;
}

var drawLine = function(W)
{
  var line = "";
  for(i=0;i<W;i++)
  {
    if(i==0 || i==W-1)
    {
      line = line+'#';
    }
    else
    {
      line = line+'.';
    }
  }
  line = line+'\n';
  return line;
}

var calc = function(x)
{
for (var i = 0; i < x.length; i++) {
  var HW = x[i].split(' ').map(Number);
  if(HW[0]==0 && HW[1] ==0)return;
  drawRect(HW[0],HW[1]);
}
return x;
};

calc(input());