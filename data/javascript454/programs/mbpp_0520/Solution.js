function findLcm(num1, num2) {
    let num, den;
    if (num1 > num2) {
        num = num1;
        den = num2;
    } else {
        num = num2;
        den = num1;
    }
    let rem = num % den;
    while (rem !== 0) {
        num = den;
        den = rem;
        rem = num % den;
    }
    const gcd = den;
    return (num1 * num2) / gcd;
}

function getLcm(arr) {
    let lcm = findLcm(arr[0], arr[1]);
    for (let i = 2; i < arr.length; i++) {
        lcm = findLcm(lcm, arr[i]);
    }
    return lcm;
}
