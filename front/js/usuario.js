

function exibirusuario() {
    var usuariostr = localStorage.getItem("userlogado");
    if (usuariostr == null) {
        window.location = "login.html";
    } else {
        var usuariojson = JSON.parse(usuariostr);
        document.getElementById("dados").innerHTML =
            "<h4>" + usuariojson.nome + "<br>" +
            "Email: " + usuariojson.email +
            " (" + usuariojson.id + ")</h4>";

        document.getElementById("foto").innerHTML =
            "<img src=images/" + usuariojson.foto + ">";
    }
}



function logar() {

    var userjson = {
        "email": document.getElementById("txtemail").value,
        "senha": document.getElementById("txtsenha").value
    };

    var pacote = {
        method: "POST",
        body: JSON.stringify(userjson),
        headers: {
            "Content-type": "application/json"
        }

    };
    fetch("http://localhost:8080/login", pacote)
        .then(res => res.json())
        .then(res => {
            localStorage.setItem("userlogado", JSON.stringify(res));
            window.location = "usuario.html"
        })
        .catch(err => {
            window.alert("Login inválido");
        });


}

function cadastrarusuario() {
    var userjson = {
        "nome": document.getElementById("nome").value,
        "email": document.getElementById("email").value,
        "senha": document.getElementById("senha").value,
        "foto": document.getElementById("foto").value

    };
    var pacote = {
        method: "POST",
        body: JSON.stringify(userjson),
        headers: {
            "Content-type": "application/json"


        }
    };
        fetch("http://localhost:8080/cadastrar", pacote)
            .then(res => res.json())
            .then(res => {
                window.alert("Usuário  cadastrado");
                window.location = "usuario.html"
            })
            .catch(err => {
                window.alert("Não foi possivel cadastrar");
            })
    
}  