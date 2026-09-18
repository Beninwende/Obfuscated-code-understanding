function reverseVowels(str) {
    const vowels = [];
    const isVowel = c => 'aeiouAEIOU'.includes(c);
    for (const char of str) {
        if (isVowel(char)) vowels.push(char);
    }
    let result = '';
    for (const char of str) {
        if (isVowel(char)) result += vowels.pop();
        else result += char;
    }
    return result;
}
