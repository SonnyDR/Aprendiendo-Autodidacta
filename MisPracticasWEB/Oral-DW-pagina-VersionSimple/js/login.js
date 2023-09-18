//CODIGO PARA REGISTRARSE
let registerBtn = document.getElementById('register');


//EVENTO QUE AL HACER CLICK EN "REGISTRO" VERIFICA LOS CAMPOS DE TEXTO Y SI EL EMAIL CONTIENE ARROBA
registerBtn.addEventListener('click', function () {

    let name = document.getElementById('name-register').value;
    let ape = document.getElementById('ape-register').value;
    let email = document.getElementById('email-register').value;
    let pass = document.getElementById('pass-register').value;
   

    if (name == '' || ape == '' || email == '' || pass == '') {
        alert("Erorr, Complete todo el formulario");
        return false;
    }
        if (email.indexOf('@') === -1) {
        return false;
    
    } else {
        window.location.href = "../paginas/gerarditoGPT.html"
        alert("Formulario Correcto, Redirecionando a GerarditoGPT....")
        
        //GUARDAR VALORES
        localStorage.setItem("email", email);
        localStorage.setItem("pass", pass);

        return true;
    }
    
});

function logRegister() {
    window.location.href = "../paginas/login.html";
    alert("Redirecionando a Iniciar Seccion...")
}
