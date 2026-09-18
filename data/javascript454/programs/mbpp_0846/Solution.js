function findPlatform(arr, dep, n) {
    arr.sort((a, b) => a - b);
    dep.sort((a, b) => a - b);
    let platNeeded = 1;
    let result = 1;
    let i = 1;
    let j = 0;
    while (i < n && j < n) {
        if (arr[i] <= dep[j]) {
            platNeeded++;
            i++;
        } else {
            platNeeded--;
            j++;
        }
        if (platNeeded > result) {
            result = platNeeded;
        }
    }
    return result;
}
