let content = '';
process.stdin.resume();
process.stdin.setEncoding('utf8');
process.stdin.on('data', buf => {
  content += buf;
});

process.stdin.on('end', () => {
  const [target, needle] = content.trim().split('\n');
  console.log(ringedIncludes(target, needle) ? 'Yes' : 'No'); 
});

const ringedIncludes = (target, needle) => {
  for (let i = 0; i < target.length; i++) {
    const includes = ringed(target, i, needle.length) === needle;
    if (includes) {
      return true;
    }
  }

  return false;
};

const ringed = (s, offset, size) => {
  if (s.length >= offset + size) {
    return s.substring(offset, offset + size);
  } else {
    return s.substring(offset) + ringed(s, 0, size - s.length + offset);
  }
};

