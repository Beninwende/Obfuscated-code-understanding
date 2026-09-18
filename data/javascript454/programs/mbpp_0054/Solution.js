function countingSort(myList) {
    let maxValue = 0;
    for (let i = 0; i < myList.length; i++) {
        if (myList[i] > maxValue) {
            maxValue = myList[i];
        }
    }
    const buckets = new Array(maxValue + 1).fill(0);
    for (let num of myList) {
        buckets[num]++;
    }
    let index = 0;
    for (let j = 0; j <= maxValue; j++) {
        for (let count = 0; count < buckets[j]; count++) {
            myList[index++] = j;
        }
    }
    return myList;
}
