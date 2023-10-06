package api.database.Diabetes;


import api.database.Record.DadosDiagDiabetes;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "DiagDiabetes")
@Entity(name = "DigDiabetes")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class jpaDiagDiabetes {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String sexo;
    private String historico_medico;


    public jpaDiagDiabetes(DadosDiagDiabetes dados) {
        this.nome = dados.nome();
        this.sexo = dados.sexo();
        this.historico_medico = dados.historico_medico();

    }
}
