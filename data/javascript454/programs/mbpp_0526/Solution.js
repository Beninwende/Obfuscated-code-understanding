function capitalizeFirstLastLetters(str) {
  return str
    .toLowerCase()
    .split(/\s+/)
    .map(word => {
      if (!word) return '';
      const first = word[0].toUpperCase();
      const middle = word.slice(1, -1);
      const last = word.length > 1 ? word[word.length - 1].toUpperCase() : '';
      return first + middle + last;
    })
    .join(' ');
}
