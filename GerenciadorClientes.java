import java.util.HashMap;
import java.util.Map;

public class GerenciadorClientes {
    
 private Map<String, Cliente> clientes;

    public GerenciadorClientes() {
        clientes = new HashMap<>();
    }

    public void cadastrarCliente(String nome, String sobrenome, String cpf) {
        Cliente cliente = new Cliente(nome, sobrenome, cpf);
        clientes.put(cpf, cliente);
    }

    public Cliente buscarClientePeloCpf(String cpf) {
        return clientes.get(cpf);
    }
}

