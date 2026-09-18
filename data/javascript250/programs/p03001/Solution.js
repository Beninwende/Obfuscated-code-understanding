function main(input) {
  // 入力値（文字列）をスペースで区切る
  const inputList = input.split(/\s/);
  const numOfW = formatNum(inputList[0]);
  const numOfH = formatNum(inputList[1]);
  const numOfX = formatNum(inputList[2]);
  const numOfY = formatNum(inputList[3]);
  
  // 面積
  const area = numOfW * numOfH;

  // 最適な分割方法が複数あるかを判定
  const result = numOfW / 2 === numOfX && numOfH / 2 === numOfY ? 1 : 0;
  console.log(`${(area / 2).toFixed(6)} ${result}`);
};

// 文字列を数値に変換
function formatNum(str) {
  return Number(str);
};

main(require("fs").readFileSync("/dev/stdin", "utf8"));
