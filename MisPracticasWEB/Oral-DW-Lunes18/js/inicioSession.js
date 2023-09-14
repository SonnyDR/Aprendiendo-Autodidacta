let obtEmail = localStorage.getItem("email");
let obtPass = localStorage.getItem("pass");

let butonLogear = document.getElementById('logear');

function log() {

    let emailLogin = document.getElementById('email-login').value;
    let passLogin = document.getElementById('pass-login').value;

    if (emailLogin == '' || passLogin == '') {
        alert("ERROR! , Complete los campos para loguearse")
    
    } if (emailLogin.indexOf('@') === -1) {
        return false;
    
    } if (emailLogin != obtEmail || passLogin != obtPass) {
        alert("Error, Ese no es tu usuario")
    
    } if (emailLogin == obtEmail && passLogin == obtPass) {
        window.location.href = "../paginas/gerarditoGPT.html";
        alert("Correcto, Redirecionando...")
    }
}

function reg() {
    alert("redirecionando a Registrarse...")
    window.location.href = "../index.html";
    
}

console.log(obtEmail);
console.log(obtPass)