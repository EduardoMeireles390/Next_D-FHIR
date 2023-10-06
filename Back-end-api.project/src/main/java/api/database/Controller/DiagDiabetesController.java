package api.database.Controller;

import api.database.Diabetes.DiagDiabetesRepository;
import api.database.Diabetes.jpaDiagDiabetes;
import api.database.Record.DadosDiagDiabetes;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("diagnosticoDiabetes")
public class DiagDiabetesController {

    private DiagDiabetesRepository repository;
    @PostMapping
    @Transactional
    public void consultar(@RequestBody DadosDiagDiabetes dados) {
        repository.save(new jpaDiagDiabetes(dados));


    }
}
