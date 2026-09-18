function text_match(text) {
  const pattern = /^[a-z]+_[a-z]+$/;
  if (pattern.test(text)) {
    return 'Found a match!';
  } else {
    return 'Not matched!';
  }
}
