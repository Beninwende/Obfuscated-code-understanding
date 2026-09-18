function extractValues(text) {
  const regex = /"(.*?)"/g;
  const values = [];
  let match;
  while ((match = regex.exec(text)) !== null) {
    values.push(match[1]);
  }
  return values;
}
