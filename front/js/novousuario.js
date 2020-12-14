function cadastrarusuario() {
    var userjson = {
        "nome": document.getElementById("nome").value,
        "email": document.getElementById("email").value,
        "senha": document.getElementById("senha").value,
        "foto": document.getElementById("foto").value
            
    };


}
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
    });



