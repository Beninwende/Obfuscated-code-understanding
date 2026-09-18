function removeWords(list1, charlist) {
  const newList = [];
  for (const line of list1) {
    const words = line.split(' ');
    const filtered = words.filter(word => !charlist.some(phrase => word.includes(phrase)));
    newList.push(filtered.join(' '));
  }
  return newList;
}
