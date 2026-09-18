function evenOrOdd(N) {
    const last = N[N.length - 1].toUpperCase();
    if ('02468ACE'.includes(last)) {
        return 'Even';
    } else {
        return 'Odd';
    }
}
