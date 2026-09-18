function combinationsList(list1) {
  if (list1.length === 0) {
    return [[]];
  }
  const result = [];
  for (const el of combinationsList(list1.slice(1))) {
    result.push(el);
    result.push(el.concat(list1[0]));
  }
  return result;
}
