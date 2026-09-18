function binarySearch(itemList, item) {
    let first = 0;
    let last = itemList.length - 1;
    let found = false;
    while (first <= last && !found) {
        const mid = Math.floor((first + last) / 2);
        if (itemList[mid] === item) {
            found = true;
        } else {
            if (item < itemList[mid]) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
    }
    return found;
}
