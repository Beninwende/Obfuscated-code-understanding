function isWordPresent(sentence, word) {
    const words = sentence.split(" ");
    for (const w of words) {
        if (w === word) {
            return true;
        }
    }
    return false;
}
