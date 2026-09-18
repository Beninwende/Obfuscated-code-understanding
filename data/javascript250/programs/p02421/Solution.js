'use strict'

const main = arg => {
    var input = arg.trim().split("\n");
    const lexico = ["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"];
    const turns = input[0];
    const compete = input.slice(1).slice(0, turns);
    var taro = 0;
    var hanako = 0;

    compete.forEach(str => {
        const cards = str.split(" ");
        const taroPower = lexico.indexOf(cards[0][0]);
        const hanakoPower = lexico.indexOf(cards[1][0]);

        if(cards[0] === cards[1]){
            taro++;
            hanako++;
        } else if(taroPower > hanakoPower){
            taro += 3;
        } else if(taroPower < hanakoPower){
            hanako += 3;
        } else {
            const longer = cards[0].length > cards[1].length ? cards[0] : cards[1];
            [...Array(longer.length)].some((theStr,i) => {
                if(cards[0].length < i){ hanako += 3;return true; }
                if(cards[1].length < i){ taro += 3;return true; }
                if(cards[0][i] !== cards[1][i]){
                    const theTaroPower = lexico.indexOf(cards[0][i]);
                    const theHanakoPower = lexico.indexOf(cards[1][i]);
                    if(theTaroPower > theHanakoPower){
                        taro += 3;
                        return true;
                    } else if(theTaroPower < theHanakoPower){
                        hanako += 3;
                        return true;
                    }        
                }
            });
        }
    });

    console.log(`${taro} ${hanako}`);
}

main(require('fs').readFileSync('/dev/stdin', 'utf8'));
