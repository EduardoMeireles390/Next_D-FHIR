package api.database.Controller;


import api.database.Cliente.CadastroClienteRepository;
import api.database.Cliente.jpaCadastroCliente;
import api.database.Record.DadosCadastroCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cadastrocliente")
public class CadastroClienteController {

    @Autowired
    private CadastroClienteRepository repository;


    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroCliente dados)  {

        repository.save(new jpaCadastroCliente(dados));

    }


}
