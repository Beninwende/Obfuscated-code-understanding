function textMatch(text) {
  const pattern = /a.*?b$/;
  if (pattern.test(text)) {
    return 'Found a match!';
  } else {
    return 'Not matched!';
  }
}
