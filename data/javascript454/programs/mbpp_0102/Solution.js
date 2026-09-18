function snakeToCamel(word) {
    return word
        .split('_')
        .map(part => {
            const result = part.charAt(0).toUpperCase() + part.slice(1);
            return result || '_';
        })
        .join('');
}
