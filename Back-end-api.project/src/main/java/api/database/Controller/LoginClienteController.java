package api.database.Controller;

import api.database.Login.LoginClienteRepository;
import api.database.Login.jpaLoginCliente;
import api.database.Record.DadosLoginCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("logincliente")
public class LoginClienteController {

    @Autowired
    private LoginClienteRepository repository;
    @PostMapping
    @Transactional
    public void acessar(@RequestBody DadosLoginCliente dados) {

        repository.save(new jpaLoginCliente(dados));


    }

}
