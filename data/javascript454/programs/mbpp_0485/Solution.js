function isPalindrome(n) {
    let divisor = 1;
    while (Math.floor(n / divisor) >= 10) {
        divisor *= 10;
    }
    while (n !== 0) {
        const leading = Math.floor(n / divisor);
        const trailing = n % 10;
        if (leading !== trailing) {
            return false;
        }
        n = Math.floor((n % divisor) / 10);
        divisor = Math.floor(divisor / 100);
    }
    return true;
}

function largestPalindrome(A) {
    A.sort((a, b) => a - b);
    for (let i = A.length - 1; i >= 0; i--) {
        if (isPalindrome(A[i])) {
            return A[i];
        }
    }
    return -1;
}
