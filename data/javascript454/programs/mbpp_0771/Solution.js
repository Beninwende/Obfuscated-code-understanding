function checkExpression(exp) {
  if (exp.length % 2 !== 0) {
    return false;
  }
  const stack = [];
  for (const ch of exp) {
    if (ch === '(' || ch === '{' || ch === '[') {
      stack.push(ch);
    } else if (ch === ')' || ch === '}' || ch === ']') {
      if (stack.length === 0) {
        return false;
      }
      const top = stack.pop();
      if ((top === '(' && ch !== ')') || (top === '{' && ch !== '}') || (top === '[' && ch !== ']')) {
        return false;
      }
    }
  }
  return stack.length === 0;
}
