function checkGreater(arr, number) {
    arr.sort((a, b) => a - b);
    if (number > arr[arr.length - 1]) {
        return 'Yes, the entered number is greater than those in the array';
    } else {
        return 'No, entered number is less than those in the array';
    }
}
