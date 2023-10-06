document.getElementById("login-dialog").addEventListener("submit", function(event) {
  event.preventDefault(); // Impede o envio padrão do formulário

  var logincadastro = document.getElementById("#cadastro-login");
  var senhacadastro = document.getElementById("#senha-login");


  // Recupera os valores do localStorage 
  var nome = localStorage.getItem("nome");
  var email = localStorage.getItem("email");
  var usuario = localStorage.getItem("usuario");
  var senha = localStorage.getItem("senha");

  // Verificando se os valores existem
    if ( logincadastro === usuario && senhacadastro === senha) {
      // Autenticação bem-sucedida
      alert("Preencha seu formulario de saúde!");
      // Redirecione o usuário para a página apropriada
      window.location.href = "#";
    } else {
      // Trate o erro de autenticação, por exemplo:
      alert("Nome de usuário ou senha incorretos ou você não fez o login. Tente novamente.");
    }

});
