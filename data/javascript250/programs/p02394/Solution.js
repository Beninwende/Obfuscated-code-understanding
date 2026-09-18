(function() {
  var isInRange, isNum, reader;

  isNum = function(n) {
    return n.match(/(-|)\d{1,3}/);
  };

  isInRange = function(start, end) {
    return function(n) {
      return n >= start && n <= end;
    };
  };

  reader = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
  });

  reader.on('line', function(line) {
    var H, W, r, sp, whr, x, xy, y;
    sp = line.split(/\s/);
    W = isNum(sp[0]) ? parseInt(sp[0], 10) : void 0;
    H = isNum(sp[1]) ? parseInt(sp[1], 10) : void 0;
    x = isNum(sp[2]) ? parseInt(sp[2], 10) : void 0;
    y = isNum(sp[2]) ? parseInt(sp[3], 10) : void 0;
    r = isNum(sp[2]) ? parseInt(sp[4], 10) : void 0;
    whr = isInRange(0, 100);
    xy = isInRange(-100, 100);
    if (whr(W) && whr(H) && whr(r) && xy(x) && xy(y)) {
      if (x + r > W || x - r < 0 || y + r > H || y - r < 0) {
        return console.log("No");
      } else {
        return console.log("Yes");
      }
    }
  });

}).call(this);