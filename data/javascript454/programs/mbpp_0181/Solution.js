function commonPrefixUtil(str1, str2) {
    let result = "";
    const n1 = str1.length;
    const n2 = str2.length;
    let i = 0, j = 0;
    while (i <= n1 - 1 && j <= n2 - 1) {
        if (str1[i] !== str2[j]) {
            break;
        }
        result += str1[i];
        i++;
        j++;
    }
    return result;
}

function commonPrefix(arr, n) {
    let prefix = arr[0];
    for (let i = 1; i < n; i++) {
        prefix = commonPrefixUtil(prefix, arr[i]);
    }
    return prefix;
}
