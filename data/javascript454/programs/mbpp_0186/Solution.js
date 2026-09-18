function checkLiterals(text, patterns) {
  for (const pattern of patterns) {
    const regex = new RegExp(pattern);
    if (regex.test(text)) {
      return 'Matched!';
    } else {
      return 'Not Matched!';
    }
  }
}
