function removeDuplicList(l) {
  const temp = [];
  for (const x of l) {
    if (!temp.includes(x)) {
      temp.push(x);
    }
  }
  return temp;
}
