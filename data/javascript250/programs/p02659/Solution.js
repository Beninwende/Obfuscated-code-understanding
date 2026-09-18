function main(input) {
  const inputs = input.trim().split('\n');
  var input1 = inputs[0].split(' ');
  var A = input1[0].split('').reverse();
  var B = input1[1];

  var B1 = B.split('.')[0] - 0;
  var B2 = B.split('.')[1].split('').reverse();

  var temp = Array(A.length + 2 + 1);
  var tempLength = temp.length;

  for (var i = 0; i < tempLength; i++) {
    temp[i] = 0;
  }

  var multi = '';
  for (var i = 0; i < B2.length; i++) {
    for (var j = 0; j < A.length; j++) {
      multi = ('' + ((B2[i] - 0) * (A[j] - 0))).split('').reverse();
      for (var k = 0; k < multi.length; k++) {
        temp[tempLength - i - j - k - 1] += (multi[k] - 0);
        for (var l = tempLength - 1; l >= 0; l--) {
          if (temp[l] >= 10) {
            temp[l] -= 10;
            temp[l - 1] += 1;
          }
        }
      }
    }
  }

  var multi = '';
  for (var i = 0; i < A.length; i++) {
    multi = ('' + (B1 * (A[i] - 0))).split('').reverse();
    for (var k = 0; k < multi.length; k++) {
      temp[tempLength - 2 - i - k - 1] += (multi[k] - 0);
      for (var l = tempLength - 1; l > 0; l--) {
        if (temp[l] >= 10) {
          temp[l] -= 10;
          temp[l - 1] += 1;
        }
      }
    }
  }

  temp = temp.slice(0, -2);

  var cont = true;
  while (cont) {
    if (temp[0] == 0) {
      temp = temp.slice(1);
    } else {
      cont = false;
    }
  }

  if (temp.length == 0) {
    temp.push(0);
  }

  console.log(temp.join(''));
}

main(require('fs').readFileSync('/dev/stdin', 'utf8'));