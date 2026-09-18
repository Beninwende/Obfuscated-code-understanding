function smallestMissing(A, leftElement, rightElement) {
    if (leftElement > rightElement) {
        return leftElement;
    }
    const mid = leftElement + Math.floor((rightElement - leftElement) / 2);
    if (A[mid] === mid) {
        return smallestMissing(A, mid + 1, rightElement);
    } else {
        return smallestMissing(A, leftElement, mid - 1);
    }
}
