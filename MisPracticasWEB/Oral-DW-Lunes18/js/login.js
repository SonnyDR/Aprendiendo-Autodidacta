let registerBtn = document.getElementById('register');

//EVENTO QUE AL HACER CLICK EN "REGISTRO" VERIFICA LOS CAMPOS DE TEXTO Y SI EL EMAIL CONTIENE ARROBA
registerBtn.addEventListener('click', function () {

    let name = document.getElementById('name-login').value;
    let ape = document.getElementById('ape-login').value;
    let email = document.getElementById('email-login').value;
    let pass = document.getElementById('pass-login').value;

    if (name == '' || ape == '' || email == '' || pass == '') {
        alert("Erorr, Complete todo el formulario");
        return false;
    }
        if (email.indexOf('@') === -1) {
        return false;
    
    } else {
        window.location.href = "paginas/gerarditoGPT.html"
        alert("Formulario Correcto, Redirecionando a GerarditoGPT....")
        return true;
    }
    
});