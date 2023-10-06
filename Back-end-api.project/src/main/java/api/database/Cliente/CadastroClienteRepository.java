package api.database.Cliente;

import api.database.Controller.CadastroClienteController;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CadastroClienteRepository extends JpaRepository<jpaCadastroCliente, Long> {
}
