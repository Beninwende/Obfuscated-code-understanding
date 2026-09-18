function maxOfThree(num1, num2, num3) {
    let lnum;
    if (num1 >= num2 && num1 >= num3) {
        lnum = num1;
    } else if (num2 >= num1 && num2 >= num3) {
        lnum = num2;
    } else {
        lnum = num3;
    }
    return lnum;
}
