function main(input) {
    new Main(input).walk();    
}
  
var input = '';

process.stdin.resume();
process.stdin.setEncoding('utf8');
process.stdin.on('data', function(chunk) {
    input += chunk;
});
process.stdin.on('end', function() {
    main(input);
});
var tmp = `5
5 3 2 4 1`
class Main{
    constructor(input){
        var splits = input.split("\n");
        this.N = Number(splits[0]);
        this.A = splits[1].split(" ").map(v=>Number(v));
        this.count = 0;
    }
    walk(){
        var flag = 1;
        while(flag){
            flag = 0;
            for(var j=this.N-1; j>=1; j--){
                if(this.A[j] < this.A[j-1]){
                    this.swap(j, j-1);
                    this.count++;
                    flag = 1
                }
            }
        }
        console.log(this.A.join(" "));
        console.log(this.count);
    }
    swap(i, j){
        var tmp = this.A[i];
        this.A[i] = this.A[j];
        this.A[j] = tmp;
    }
}
// new Main(tmp).walk();
