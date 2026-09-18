function count_Rectangles(radius) {
    let rectangles = 0;
    const diameter = 2 * radius;
    const diameterSquare = diameter * diameter;
    for (let a = 1; a < 2 * radius; a++) {
        for (let b = 1; b < 2 * radius; b++) {
            const diagnalLengthSquare = a * a + b * b;
            if (diagnalLengthSquare <= diameterSquare) {
                rectangles++;
            }
        }
    }
    return rectangles;
}
