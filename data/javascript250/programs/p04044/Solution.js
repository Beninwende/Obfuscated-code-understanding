function main() {
  process.stdin.resume();
  process.stdin.setEncoding("utf8");
  var chunks = "";

  process.stdin.on("data", function (chunk) {
    chunks += chunk;
  });

  process.stdin.on("end", function () {
    var inputs = chunks.trim().split("\n");
    var ans = [inputs[1].trim()];

    for (var i = 2; i < inputs.length; i++) {
      var cur = inputs[i].trim();
      var found = false;
      for (var j = 0; j < ans.length; j++) {
        var tmp = ans[j];
        if (cmp(cur, tmp) < 0) {
          ans.splice(j, 0, cur);
          found = true;
          break;
        }
      }
      if (!found) {
        ans.push(cur);
      }
    }

    console.log(ans.join(""));
  });

  function cmp(a, b) {
    for (var i = 0; i < a.length; i++) {
      if (a[i] < b[i]) {
        return -1;
      } else if (a[i] > b[i]) {
        return 1;
      }
    }

    return 0;
  }
}

main();
