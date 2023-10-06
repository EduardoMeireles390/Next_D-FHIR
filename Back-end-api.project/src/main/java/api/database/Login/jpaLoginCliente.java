package api.database.Login;

import api.database.Record.DadosLoginCliente;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "LoginClientes")
@Entity(name = "LoginCliente")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class jpaLoginCliente {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;

    public jpaLoginCliente(DadosLoginCliente dados) {
       this.nome = dados.nome();
       this.email = dados.email();
    }
}
