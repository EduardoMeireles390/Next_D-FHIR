package api.database.Cliente;

import api.database.Record.DadosCadastroCliente;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "CadastroClientes")
@Entity(name = "CadastroCliente")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class jpaCadastroCliente {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String nome_usuario;
    private String senha;
    private String confirmar_senha;
    private String sexo;


    public jpaCadastroCliente(DadosCadastroCliente dados) {
        this.nome = dados.nome();
        this.email = dados.email();
        this.nome_usuario = dados.nome_usuario();
        this.senha = dados.senha();
        this.confirmar_senha = dados.confirmar_senha();
        this.sexo = dados.sexo();
    }
}
