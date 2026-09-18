function minimumLength(s) {
    const arr = new Array(26).fill(0);
    for (let i = 0; i < s.length; i++) {
        arr[s.charCodeAt(i) - 'a'.charCodeAt(0)]++;
    }
    let maxOcc = 0;
    for (const count of arr) {
        if (count > maxOcc) maxOcc = count;
    }
    return s.length - maxOcc;
}
