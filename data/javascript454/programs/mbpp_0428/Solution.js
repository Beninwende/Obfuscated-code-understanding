function shellSort(arr) {
    let gap = Math.floor(arr.length / 2);
    while (gap > 0) {
        for (let i = gap; i < arr.length; i++) {
            let currentItem = arr[i];
            let j = i;
            while (j >= gap && arr[j - gap] > currentItem) {
                arr[j] = arr[j - gap];
                j -= gap;
            }
            arr[j] = currentItem;
        }
        gap = Math.floor(gap / 2);
    }
    return arr;
}
