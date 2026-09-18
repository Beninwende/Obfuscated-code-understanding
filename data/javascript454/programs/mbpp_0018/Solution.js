const NO_OF_CHARS = 256;

function strToList(string) {
    return string.split('');
}

function listToString(list) {
    return list.join('');
}

function getCharCountArray(string) {
    const count = Array(NO_OF_CHARS).fill(0);
    for (let i = 0; i < string.length; i++) {
        count[string.charCodeAt(i)]++;
    }
    return count;
}

function removeDirtyChars(string, secondString) {
    const count = getCharCountArray(secondString);
    let ipInd = 0;
    let resInd = 0;
    const strList = strToList(string);
    while (ipInd !== strList.length) {
        const temp = strList[ipInd];
        if (count[temp.charCodeAt(0)] === 0) {
            strList[resInd] = temp;
            resInd++;
        }
        ipInd++;
    }
    return listToString(strList.slice(0, resInd));
}
