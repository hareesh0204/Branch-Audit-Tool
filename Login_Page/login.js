
const loginForm = document.getElementById("login-form");
const loginButton = document.getElementById("login-form-submit");
const loginErrorMsg = document.getElementById("login-error-msg");

loginButton.addEventListener("click", (e) => {
    e.preventDefault();
    const username = loginForm.username.value;
    const password = loginForm.password.value;

    if (username === "auditexe123" && password === "iamaudit") {
        alert("Welcome Audit Executive.You have successfully logged in!!!");
        location.reload();
    } else if (username === "coo123" && password === "iamcoo") {
        alert("Welcome COO.You have successfully logged in!!!");
        location.reload();
    }else {
        alert("Invalid Credentials");
        loginErrorMsg.style.opacity = 1;
    }
})