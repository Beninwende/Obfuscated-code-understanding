class stack{
    constructor(){
        this.S = [null];
        this.top = 0;
    }
    push(x){
        this.top++;
        this.S[this.top]=x;
    }
    pop(){
        if(this.isEmpty()){
            return false;
        }
        let ret = this.S[this.top];
        this.top--;
        return ret;
    }
    isEmpty(){
        return this.top===0;
    }
}


let main = function(input){
    input = input.trim();
    let args = input.split(" ");
    let calc = new stack();
    
    while(args.length>0){
        let arg = args.shift();
        if(arg==="-" || arg ==="+" || arg==="*"){
            if(arg==="-"){
                let b = calc.pop();
                let a = calc.pop();
                calc.push(a-b);
            }else if(arg==="+"){
                let a = calc.pop();
                let b = calc.pop();
                calc.push(a+b);
            }else if(arg==="*"){
                let a = calc.pop();
                let b = calc.pop();
                calc.push(a*b);
            }
        }else{
            calc.push(parseInt(arg));
        }
    }
    console.log(calc.S[1]);
    
}

main(require("fs").readFileSync("/dev/stdin","utf-8"));

