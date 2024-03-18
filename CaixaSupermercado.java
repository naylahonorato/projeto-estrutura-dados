import java.util.Scanner;

public class CaixaSupermercado {
    private Scanner scanner;
    private GerenciadorClientes gerenciadorClientes;

    public CaixaSupermercado() {
        scanner = new Scanner(System.in);
        gerenciadorClientes = new GerenciadorClientes();
    }

    public void executar() {
        int opcao;
        do {
            exibirMenu();
            opcao = obterOpcao();
            switch (opcao) {
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    buscarClientePeloCpf();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 3);
    }

    private void exibirMenu() {
        System.out.println("===== MENU =====");
        System.out.println("1. Cadastrar Cliente");
        System.out.println("2. Buscar Cliente pelo CPF");
        System.out.println("3. Sair");
    }

    private int obterOpcao() {
        System.out.print("Escolha uma opção: ");
        return scanner.nextInt();
    }

    private void cadastrarCliente() {
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.next();
        System.out.print("Digite o sobrenome do cliente: ");
        String sobrenome = scanner.next();
        System.out.print("Digite o CPF do cliente: ");
        String cpf = scanner.next();

        gerenciadorClientes.cadastrarCliente(nome,sobrenome, cpf);
        System.out.println("Cliente cadastrado com sucesso!");
    }

    private void buscarClientePeloCpf() {
        System.out.print("Digite o CPF do cliente: ");
        String cpf = scanner.next();

        Cliente cliente = gerenciadorClientes.buscarClientePeloCpf(cpf);
        if (cliente != null) {
            System.out.println("Cliente encontrado:");
            System.out.println(cliente);
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }
}
    

