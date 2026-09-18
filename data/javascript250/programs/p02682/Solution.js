
let input = require("fs").readFileSync("/dev/stdin", "utf8")

function main() {
    let [A,B,C,K] = load(4)

    let sum = 0
    for(const [value, len] of [[1,A],[0,B],[-1,C]]) {
        if(len <= K) {
            K -= len
            sum += value * len
        } else {
            sum += value * K
            break
        }
    }

    return sum
}

/*

入力値を読み込む
load(rows = 1, cols = 1, type = Number)

TruthyならYes, FalsyならNo
yesno(boolean) => String

数列の和
array_sum(numbers) => Number

対無限ループ安全装置
inifinite_loop_preventer(max = 1e5)

配列の中から最大値を返す
array_max(numbers, initial_value = null) => Number

配列の中から最小値を返す
array_min(numbers, initial_value = null) => Number

オブジェクトのスナップショットをconsole.logする
log_obj(value)

nを素因数分解 
math_prime_factors(n) => { 素数: n乗 }

2次元配列を作る
new_array_2d(x_len, y_len = 0, init_value = 0) => [[]]

最大公約数
gcd(a, b) => Number

最小公倍数
lcm(a,b) => Number

*/


// console.time()
let inputs = input.split(/[\s\n]/)
let inifinite_loop_prevent_counter = 0
let result = main()
if(result === undefined) {
    console.warn("result is undefined")
} else {
    console.log(result)
}
// console.timeEnd()


// 入力値を読み込む
function load(rows = 1, cols = 1, type = Number) {
    const length = rows * cols
    let result = inputs.splice(0, length)

    if(type !== String) result = result.map(type)
    if(cols > 1) {
        const arrays = new Array(cols)
        for(let col = 0; col < cols; col++) {
            arrays[col] = new Array()
            for(let row = 0; row < rows; row++) {
                arrays[col].push(result[row * cols + col])
            }
        }
        result = arrays
    }

    return result
}

// TruthyならYes, FalsyならNo
function yesno(value) {
    return value ? 'Yes' : 'No'
}

// 数列の和
function array_sum(numbers) {
    return numbers.reduce((acc, cur) => acc + cur, 0)
}

// 対無限ループ安全装置
function inifinite_loop_preventer(max = 1e5) {
    inifinite_loop_prevent_counter++
    if(inifinite_loop_prevent_counter >= max) {
        throw new Error("Infinite loop")
    }
}

// 配列の中から最大値を返す
function array_max(numbers, initial_value = null) {
    let result = (initial_value === null) ? numbers[0] : initial_value
    for(const n of numbers) if(n > result) result = n
    return result
}

// 配列の中から最小値を返す
function array_min(numbers, initial_value = null) {
    let result = (initial_value === null) ? numbers[0] : initial_value
    for(const n of numbers) if(n < result) result = n
    return result
}

// オブジェクトのスナップショットをconsole.logする
function log_obj(value) {
    console.log(JSON.parse(JSON.stringify(value)))
}

// 素因数分解 { 素数: n乗 }
function math_prime_factors(n) {
    const result = {}

    for(let i = 2; i * i <= n; i++) {
        if(n % i === 0) {
            n /= i
            result[i] = 1
            
            while(n % i === 0) {
                n /= i
                result[i]++
            }
        }
    }

    if(n > 1) result[n] = 1

    return result
}

// 2次元配列を作る
function new_array_2d(x_len, y_len = 0, init_value = 0) {

    const array = new Array()
    for(let i = 0; i < x_len; i++) {
        const y = y_len ? new Array(y_len).fill(init_value) : new Array()
        array.push(y)
    }

    return array
}

// 最大公約数
function gcd(a, b) {
    if(b === 0) return a
    return gcd(b, a % b)
}

// 最小公倍数
function lcm(a,b) {
    const g = (n, m) => m ? g(m, n % m) : n
    return a * b / g(a, b)
}
