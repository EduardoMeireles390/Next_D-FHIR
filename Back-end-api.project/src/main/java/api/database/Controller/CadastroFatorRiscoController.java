package api.database.Controller;

import api.database.FatorRisco.CadastroFatorRiscoRepository;
import api.database.FatorRisco.jpaCadastroFatorRisco;
import api.database.Record.DadosCadastroFatorRisco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cadastroFatorRisco")
public class CadastroFatorRiscoController {

    @Autowired
    private CadastroFatorRiscoRepository repository;
    @PostMapping
    @Transactional
    public void cadastroFatorRisco(@RequestBody DadosCadastroFatorRisco dados)  {
        repository.save(new jpaCadastroFatorRisco(dados));

    }
}



