package api.database.FatorRisco;

import api.database.Record.DadosCadastroFatorRisco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "CadastroFatorRisco")
@Entity(name = "CadastroFatorRisco")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class jpaCadastroFatorRisco {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String historico_familiar_diabetes;
    private String sedentarismo;

    public jpaCadastroFatorRisco(DadosCadastroFatorRisco dados) {
        this.historico_familiar_diabetes = dados.historico_familiar_diabetes();
        this.sedentarismo = dados.sedentarismo();
    }
}
