     document.addEventListener("DOMContentLoaded", function () {
        // Obtendo uma referência ao elemento do formulário
        var form = document.getElementById("agendarForm");

        // Adicionando um ouvinte de evento de envio ao formulário
        form.addEventListener("submit", function (event) {
            event.preventDefault(); // Impede que o formulário seja enviado realmente

            // Obtenha os valores dos campos do formulário
            var nome = document.getElementById("nome").value;
            var email = document.getElementById("email").value;
            var unidade_medica = document.getElementById("unidade_medica").value;
            var medico = document.getElementById("medico").value;
            var data = document.getElementById("data").value;
            var horario = document.getElementById("horario").value;

            var message = "Consulta agendada!" + "\n\n" +
            "Nome: " + nome + "\n" +
            "E-mail: " + email + "\n" +
            "Unidade Médica: " + unidade_medica + "\n" +
            "Médico: " + medico + "\n" +
            "Data: " + data + "\n" +
            "Horário: " + horario + "\n\n" +
            "Clique no OK para voltar a página inicial";

            // Alerta com as informações da consulta
            alert(message);

            //redirecionando novamente para a pagina principal 
            window.location.href = "\\\index.html";

        });
    });
