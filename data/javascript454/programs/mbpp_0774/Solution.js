const regex = /^[a-z0-9]+[._]?[a-z0-9]+@\w+\.\w{2,3}$/;

function checkEmail(email) {
    if (regex.test(email)) {
        return "Valid Email";
    } else {
        return "Invalid Email";
    }
}
