function isValidParenthese(str1) {
    const stack = [];
    const pchar = { '(': ')', '{': '}', '[': ']' };
    for (const char of str1) {
        if (pchar[char]) {
            stack.push(char);
        } else if (stack.length === 0 || pchar[stack.pop()] !== char) {
            return false;
        }
    }
    return stack.length === 0;
}
