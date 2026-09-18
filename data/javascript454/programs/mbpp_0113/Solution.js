function checkInteger(text) {
  text = text.trim();
  if (text.length < 1) {
    return null;
  } else {
    if (/^[0-9]+$/.test(text)) {
      return true;
    } else if (/^[+-][0-9]+$/.test(text)) {
      return true;
    } else {
      return false;
    }
  }
}
