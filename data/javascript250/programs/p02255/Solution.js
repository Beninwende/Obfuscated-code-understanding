"use strict";
var __importStar = (this && this.__importStar) || function (mod) {
    if (mod && mod.__esModule) return mod;
    var result = {};
    if (mod != null) for (var k in mod) if (Object.hasOwnProperty.call(mod, k)) result[k] = mod[k];
    result["default"] = mod;
    return result;
};
exports.__esModule = true;
var fs = __importStar(require("fs"));
var read = fs.readFileSync('/dev/stdin', 'utf-8');
var insertionSort = function (A) {
    for (var i = 1; i < A.length; i++) {
        var v = A[i];
        var j = i - 1;
        while (j >= 0 && A[j] > v) {
            A[j + 1] = A[j];
            j--;
        }
        A[j + 1] = v;
        console.log(A.join(' '));
    }
};
var inputArray = read.split('\n');
var A = inputArray[1].split(' ').map(function (s) { return parseInt(s); });
console.log(A.join(' '));
insertionSort(A);
//# sourceMappingURL=01a.js.map
