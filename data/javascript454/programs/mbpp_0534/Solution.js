function searchLiteral(pattern, text) {
    const regex = new RegExp(pattern);
    const match = regex.exec(text);
    if (!match) return null;
    const s = match.index;
    const e = s + match[0].length;
    return [s, e];
}
