function stringLiterals(patterns, text) {
  for (const pattern of patterns) {
    if (new RegExp(pattern).test(text)) {
      return 'Matched!';
    } else {
      return 'Not Matched!';
    }
  }
}
