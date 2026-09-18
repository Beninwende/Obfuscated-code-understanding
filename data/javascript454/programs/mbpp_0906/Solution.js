function extractDate(url) {
  const regex = /\/(\d{4})\/(\d{1,2})\/(\d{1,2})\//g;
  const matches = [];
  let match;
  while ((match = regex.exec(url)) !== null) {
    matches.push([match[1], match[2], match[3]]);
  }
  return matches;
}
