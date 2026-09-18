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
var tmp = `6
5 6 4 2 1 3`

class Main{
    constructor(input){
        var splits = input.split("\n");
        this.N = Number(splits[0]);
        this.A = splits[1].split(" ").map(v=>Number(v));
        this.count = 0;
    }
    walk(){
        for(var i=0; i<this.N; i++){
            var minj = i;
            for(var j=i; j<this.N; j++){
                if(this.A[j] < this.A[minj]){
                    minj = j;
                }
            }
            if(i != minj){
                this.swap(i, minj);
                this.count++;
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
