function getLudic(n) {
    const ludics = [];
    for (let i = 1; i <= n; i++) {
        ludics.push(i);
    }
    let index = 1;
    while (index !== ludics.length) {
        const firstLudic = ludics[index];
        let removeIndex = index + firstLudic;
        while (removeIndex < ludics.length) {
            ludics.splice(removeIndex, 1);
            removeIndex += firstLudic - 1;
        }
        index++;
    }
    return ludics;
}
