const regex = /^[a-z]$|^([a-z]).*\1$/;
function checkChar(string) {
    if (regex.test(string)) {
        return "Valid";
    } else {
        return "Invalid";
    }
}
