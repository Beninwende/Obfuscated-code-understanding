function makeFlip(ch) {
    return ch === '0' ? '1' : '0';
}

function getFlipWithStartingCharacter(str, expected) {
    let flipCount = 0;
    for (let i = 0; i < str.length; i++) {
        if (str[i] !== expected) {
            flipCount++;
        }
        expected = makeFlip(expected);
    }
    return flipCount;
}

function minFlipToMakeStringAlternate(str) {
    return Math.min(
        getFlipWithStartingCharacter(str, '0'),
        getFlipWithStartingCharacter(str, '1')
    );
}
