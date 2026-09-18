let content = '';
process.stdin.resume();
process.stdin.setEncoding('utf8');
process.stdin.on('data', buf => {
  content += buf;
});

process.stdin.on('end', () => {
  const result = content
    .trim()
    .split('')
    .map(char => char.charCodeAt(0))
    .map(code => {
      if (isLowerCase(code)) {
        return code - 32;
      } else if (isUpperCase(code)) {
        return code + 32;
      } else {
        return code;
      }
    })
    .map(code => String.fromCharCode(code))
    .join('');

  console.log(result);
});

const isLowerCase = charCode => charCode >= 97 && charCode <= 122;

const isUpperCase = charCode => charCode >= 65 && charCode <= 90;
