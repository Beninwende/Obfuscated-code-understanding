function removeWords(list1, removeWords) {
    for (const word of list1.slice()) {
        if (removeWords.includes(word)) {
            const index = list1.indexOf(word);
            if (index > -1) {
                list1.splice(index, 1);
            }
        }
    }
    return list1;
}
