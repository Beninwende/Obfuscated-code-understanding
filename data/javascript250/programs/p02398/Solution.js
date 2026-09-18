function Main(input) {
    input = input.split("\n");
    for (i=0; i < input.length-1; i++) {
        tmp = input[i].split(" ")
        var a = parseInt(tmp[0])
        var b = parseInt(tmp[1])
        var c = parseInt(tmp[2])
        var yakusuu = []
        var num = []
        for (j=0; j<= c; j++) {
            if (c % j === 0) {
                yakusuu.push(j)
            }
        }
        for (k=a; k <= b; k++) {
            num.push(k)
        }
        var yakunum = [...yakusuu, ...num]
        const duplicatedArr = yakunum.filter(
            item => yakusuu.includes(item) && num.includes(item)
        )
        var result = new Set(duplicatedArr)
        var arr = Array.from(result)
        console.log(arr.length)
    }
}

Main(require("fs").readFileSync("/dev/stdin", "utf8"));
