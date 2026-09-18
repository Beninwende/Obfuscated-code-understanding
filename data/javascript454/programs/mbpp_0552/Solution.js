function Seq_Linear(seqNums) {
  const diffs = [];
  for (let i = 1; i < seqNums.length; i++) {
    diffs.push(seqNums[i] - seqNums[i - 1]);
  }
  if (new Set(diffs).size === 1) {
    return "Linear Sequence";
  } else {
    return "Non Linear Sequence";
  }
}
