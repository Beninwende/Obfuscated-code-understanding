function all_Bits_Set_In_The_Given_Range(n, l, r) {
    const num = ((1 << r) - 1) ^ ((1 << (l - 1)) - 1);
    const newNum = n & num;
    if (newNum === 0) {
        return true;
    }
    return false;
}
