let superUsu = listaUsuario[0]
let butonLogear = document.getElementById('login');

//boton volver
let volver = document.getElementById('volver')

//funcion boton login
butonLogear.addEventListener('click', function () {

    let logUsu = document.getElementById('name-login').value;
    let logPass = document.getElementById('pass-login').value;

    if (logUsu == superUsu.name && logPass == superUsu.password) {
        window.location.href = "./paginas/pag1.html"
        alert("Redirecionando...")
    } else {
        alert("Nombre de usuario o contrasenia incorrectos.")
    }

})