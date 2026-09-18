function checkSubstring(string, sample) {
    if (string.includes(sample)) {
        const regex = new RegExp("^" + sample);
        if (regex.test(string)) {
            return "string starts with the given substring";
        } else {
            return "string doesnt start with the given substring";
        }
    } else {
        return "entered string isnt a substring";
    }
}
