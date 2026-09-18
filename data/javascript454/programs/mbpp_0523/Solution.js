function checkString(str1) {
    const checks = [
        s => /[A-Z]/.test(s) || 'String must have 1 upper case character.',
        s => /[a-z]/.test(s) || 'String must have 1 lower case character.',
        s => /\d/.test(s)   || 'String must have 1 number.',
        s => s.length >= 7  || 'String length should be atleast 8.',
    ];
    const result = checks.map(fn => fn(str1)).filter(res => res !== true);
    if (result.length === 0) {
        result.push('Valid string.');
    }
    return result;
}
