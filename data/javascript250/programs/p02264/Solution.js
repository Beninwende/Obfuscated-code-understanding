class Queue {
    constructor(data, length) {
        // 最大値はレングスの倍くらいが望ましい
        this.max = parseInt(length, 10) * 2;
        this.head = 0;
        this.tail = 0;
        this.q = [];
        for(const d of data){
            this.enqueue(d);
        }
    }

    isEmpty() {
        return this.head === this.tail;
    }

    isFull() {
        return this.head === (this.tail + 1) % this.max;
    }

    dequeue() {
        if (this.isEmpty()) {
            return;
        }
        const q = this.q[this.head];
        this.head = this.head + 1 === this.max ? 0 : this.head + 1;
        return q;
    }

    enqueue(process) {
        if (this.isFull()) {
            return;
        }
        this.q[this.tail] = process;
        this.tail = this.tail + 1 === this.max ? 0 : this.tail + 1;
    }
}


function main(stdin) {
    const _inputs = stdin.split("\n");
    let inputs = _inputs.map(ele => ele.split(' '));
    let [length, quantum] = inputs.shift();
    quantum = parseInt(quantum, 10);
    inputs = inputs.map(ele => [ele[0], parseInt(ele[1], 10)]);
    inputs = inputs.filter((e, i) => i < length);
    const q = new Queue(inputs, length);
    let process;
    let total = 0;
    while (process = q.dequeue()) {
        const cost = process[1];
        process[1] -= quantum;
        if (process[1] <= 0) {
            total += cost;
            console.log(`${process[0]} ${total}`);
        } else {
            total += quantum;
            q.enqueue(process);
        }
    }
}



main(require("fs").readFileSync("/dev/stdin", "utf8"));

