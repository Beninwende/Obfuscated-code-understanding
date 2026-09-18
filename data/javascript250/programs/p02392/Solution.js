(function() {
  var isInRange, isNum, reader;

  isNum = function(n) {
    return n.match(/(-|)\d{1,3}/);
  };

  isInRange = function(n) {
    return n >= 0 && n <= 100;
  };

  reader = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
  });

  reader.on('line', function(line) {
    var a, b, c, sp;
    sp = line.split(/\s/);
    a = isNum(sp[0]) ? parseInt(sp[0], 10) : void 0;
    b = isNum(sp[1]) ? parseInt(sp[1], 10) : void 0;
    c = isNum(sp[2]) ? parseInt(sp[2], 10) : void 0;
    if (isInRange(a) && isInRange(b) && isInRange(c)) {
      if ((a < b && b < c)) {
        return console.log("Yes");
      } else {
        return console.log("No");
      }
    }
  });

}).call(this);