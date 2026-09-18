function removeOcc(s, ch) {
    let firstIndex = s.indexOf(ch);
    if (firstIndex !== -1) {
        s = s.slice(0, firstIndex) + s.slice(firstIndex + 1);
    }
    let lastIndex = s.lastIndexOf(ch);
    if (lastIndex !== -1) {
        s = s.slice(0, lastIndex) + s.slice(lastIndex + 1);
    }
    return s;
}
