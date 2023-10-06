    document.getElementById("formulario").addEventListener("submit", function(event) {
    event.preventDefault(); // Impede o envio padrão do formulário

    // Coleta os valores dos campos do formulário
    var nome = document.getElementById("#nome");
    var email = document.getElementById("#email");
    var usuario = document.getElementById("#usuario");
    var senha = document.getElementById("#senha");

    //armazenando as informações colocadas nor fomrs localmente
    localStorage.setItem("nome", + nome);
    localStorage.setItem("email", + email);
    localStorage.setItem("Usuário", + usuario);
    localStorage.setItem("Senha", + senha);

    //redirecionando o usuario para a pagina de login
    window.alert("login bem sucedido!");
    window.alert(nome + ", " + email + "," + usuario + "," + senha);

});

