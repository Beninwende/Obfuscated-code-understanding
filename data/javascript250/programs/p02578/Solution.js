process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });
    
    atC();
});

function readline() {
    return inputString[currentLine++];
}

function pi(a) {
    return parseInt(a);
}

function probA(){
    let t = parseInt(readline());
    while(t > 0){
        t--;
        let [n,k] = readline().split(' ');
        n = pi(n);
        k = pi(k);

        if(n < k)
            console.log(k-n);
        else{
            if((n+k) % 2 === 0){
                console.log(0);
            }else{
                console.log(1);
            }
        }
    }
}

function probB(){
    let t = pi(readline());

    while(t > 0){
        t--;
        let a = readline().split(' ');
        let b = readline().split(' ');

        a[0] = pi(a[0]);
        a[1] = pi(a[1]);
        a[2] = pi(a[2]);

        b[0] = pi(b[0]);
        b[1] = pi(b[1]);
        b[2] = pi(b[2]);

        let maxSum = 0;
        if(b[2] - (a[0] + a[2]) > 0){
            b[2] = b[2] - (a[0]+a[2]);
            a[0] = 0;
            a[2] = 0;
        }else if(b[2] - a[0] > 0){
            a[2] = a[2] - (b[2] - a[0]);
            b[2] = 0;
            a[0] = 0;
        }else{
            a[0] -= b[2];
            b[2] = 0;
        }

        if(a[2] > b[1])
            console.log((b[1] - b[2]) * 2)
        else
            console.log((a[2]-b[2]) * 2);

    }
}

function probC(){
    let t = pi(readline());
    while(t > 0){
        t--;
        let n = pi(readline());
        let a = readline().split(' ');
        let x = JSON.parse(JSON.stringify(a));

        x.sort((a,b) => pi(a) - pi(b));
        let res = true;
        for(let i = 0; i < n; i++){
            if(x[i] !== a[i]){
                if(pi(a[i]) % pi(x[0]) !== 0){
                    res = false;
                    break;
                }
            }
        }

        if(res)
            console.log('yes');
        else
            console.log('no');
    }
}

function atA(){
    let [n,x,t] = readline().split(' ');
    n = pi(n);
    x = pi(x);
    t = pi(t);

    if(n < x)
        console.log(t);
    else{
        if(n % x === 0){
            console.log((n/x) * t);
        }else{
            console.log(Math.ceil(n/x) * t);
        }
    }
}

function atB(){
    let n = readline().split('');

    let sum = 0;
    for(let i of n){
        sum += pi(i);
    }

    console.log(sum % 9 === 0 ? 'yes' : 'no');
}

function atC(){
    readline();
    let a = readline().split(' ');
    let max = pi(a[0]);
    let res = 0;
    for(let i = 1; i < a.length; i++){
        let x = pi(a[i]);
        if(x < max){
            res += (max-x);
        }

        max = Math.max(max, x);
    }

    console.log(res);
}