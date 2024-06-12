package Control;

import java.text.ParseException;
import java.util.Scanner;

import Model.Cliente;
import java.util.Date;
import java.util.Random;

public class CRUD {

    private Scanner scanner;
    private final ClienteDAO dao = new ClienteDAO();

    ;

    private void processosCRUD() throws ParseException, InterruptedException {
        exibirMenuCRUD();
        casosDoMenu(lerOpçãoMenuCRUD());
    }

    private void exibirMenuCRUD() {
        System.out.println("\n=== MENU ===");

        System.out.println("1. Mostrar todos os clientes");
        System.out.println("2. Cadastro de Cliente");
        System.out.println("3. Pesquisa de Cliente");
        System.out.println("4. Alterar dados de Cliente");
        System.out.println("5. Exclusão de Cliente");
        System.out.println("6. Sair");
    }

    private int lerOpçãoMenuCRUD() {
        int opçãoMenu;
        this.scanner = new Scanner(System.in);

        System.out.print("\nEscolha uma opção: ");
        opçãoMenu = scanner.nextInt();

        return opçãoMenu;
    }

    private void casosDoMenu(int opção) throws ParseException, InterruptedException {
        switch (opção) {
            case 1 ->
                mostrarTodosClientes();

            case 2 ->
                cadastrarCliente();

            case 3 ->
                pesquisarCliente();

            case 4 ->
                alterarDadosCliente();

            case 5 ->
                excluirCliente();

            case 6 -> {
                encerrarMenu();
                return;
            }

            default ->
                System.out.println("Opção inválida.");
        }
    }

    private void mostrarTodosClientes() throws InterruptedException, ParseException {
        int opção;

        this.scanner = new Scanner(System.in);
        this.dao.getImprimirTodosClientes();

        if (this.dao.listaClientes == null || this.dao.listaClientes.isEmpty()) {
            System.out.println("Não há clientes cadastrados.");
            voltarMenuAutomatico(2);
        } else {
            System.out.println("0 - Voltar ao menu inicial");
            opção = scanner.nextInt();

            do {
                if (opção == 0) {
                    processosCRUD();
                }
            } while (opção != 0);
        }
    }

    private void cadastrarCliente() throws ParseException {
        this.scanner = new Scanner(System.in);
        Cliente clienteAuxiliar = new Cliente(null, false, null, null, null, null);
        Cliente cliente;

        // Cabeçalho do cadastro
        System.out.println("\n=== Cadastro de Cliente ===");
        clienteAuxiliar.setIdCliente(gerarIDCliente());
        verificarIDExiste(clienteAuxiliar);

        clienteAuxiliar.setNome(lerNome(null));

        clienteAuxiliar.setCPF(lerCPF(null));
        verificarCPFExiste(clienteAuxiliar);

        clienteAuxiliar.setDataNascimento(lerDataNascimento(null));

        clienteAuxiliar.setEmail(lerEmail(null));

        // Tenta instanciar um novo cliente
        try {
            int opção;

            cliente = new Cliente(clienteAuxiliar.getIdCliente(), true, clienteAuxiliar.getNome(), clienteAuxiliar.getCPF(), clienteAuxiliar.getDataNascimento(), clienteAuxiliar.getEmail());

            // Passa os valores desse cliente para o DAO
            this.dao.getAdicionarCliente(cliente);

            System.out.println("\nCliente adicionado com sucesso!\n");

            // Testa se o cadastro foi feito corretamente
            // mostrarCliente()
            System.out.println("1 - Cadastrar novo cliente\n0 - Voltar ao menu inical");
            opção = scanner.nextInt();

            do {
                if (opção == 1) {
                    cadastrarCliente();
                }
                if (opção == 0) {
                    processosCRUD();
                }
            } while (opção != 1 || opção != 0);
        } catch (InterruptedException | ParseException e) {
            System.out.println("Falha ao adicionar cliente. Verifique os dados.");
        }
    }

    private void pesquisarCliente() throws ParseException, InterruptedException {
        int opção;
        System.out.println("1 - Pesquisa por ID\n2 - Pesquisa por CPF\n0 - Voltar ao menu");
        opção = scanner.nextInt();

        switch (opção) {
            case 1 ->
                pesquisarClienteID();

            case 2 ->
                pesquisarClienteCPF();

            case 0 ->
                processosCRUD();

            default -> {
                System.out.println("\nOpção inválida!");
                pesquisarCliente();
            }
        }
    }

    private void pesquisarClienteID() throws ParseException, InterruptedException {
        String idCliente;
        this.scanner = new Scanner(System.in);

        System.out.print("Digite o ID do cliente: ");
        idCliente = scanner.nextLine();

        this.dao.getPesquisarClienteID(idCliente);
        System.out.println("0 - Voltar ao menu");
        processosCRUD();
    }

    private void pesquisarClienteCPF() throws ParseException, InterruptedException {
        String CPF;
        this.scanner = new Scanner(System.in);

        System.out.print("Digite o CPF do cliente: ");
        CPF = scanner.nextLine();

        this.dao.getPesquisarClienteCPF(CPF);
        System.out.println("0 - Voltar ao menu");
        processosCRUD();
    }

    private void alterarDadosCliente() {

    }

    private void excluirCliente() {
        System.out.print("Excluir Cliente por ID: ");
        String idClienteExclusao = scanner.nextLine();
        if (clienteManager.excluirCliente(idClienteExclusao)) {
            System.out.println("Cliente excluído com sucesso!");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    private String lerId(String idCliente) {
        // Lê id do usuário
        do {
            System.out.print("IdCliente: ");
            idCliente = this.scanner.nextLine();
        } while (idCliente == null || idCliente.isEmpty()); // Condições para prosseguir cadastro

        return idCliente;
    }

    private String lerNome(String nome) {
        // Lê nome do usuário
        do {
            System.out.print("Nome: ");
            nome = scanner.nextLine();
        } while (nome == null || nome.isEmpty()); // Condições para prosseguir cadastro

        return nome;
    }

    private String lerCPF(String CPF) {
        // Lê CPF do usuário
        do {
            System.out.print("CPF: ");
            CPF = scanner.nextLine();
        } while (CPF == null || CPF.isEmpty()); // Condições para prosseguir cadastro

        return CPF;
    }

    private Date lerDataNascimento(String dataNascimentoString) throws ParseException {
        // Lê e formata data de nascimento do usuário
        Idade idade = new Idade();

        do {
            System.out.print("Data de nascimento (dd/mm/aaaa): ");
            dataNascimentoString = scanner.nextLine();
            idade.getFormatarDataNascimento(dataNascimentoString);
        } while (idade.getDataNascimento() == null || dataNascimentoString.isEmpty()); // Condições para prosseguir
        // cadastro

        return idade.getDataNascimento();
    }

    private String lerEmail(String email) {
        // Lê email do usuário
        do {
            System.out.print("Email: ");
            email = scanner.nextLine();
        } while (email == null || email.isEmpty() || !email.contains("@")); // Condições para prosseguir cadastro

        return email;
    }

    private String gerarIDCliente() {
        //Gera ID de Cliente

        String idCliente;
        String numeroAleatorioString;
        int auxiliar;
        Random geradorID = new Random(); //Importa classe Random

        auxiliar = geradorID.nextInt(999999) + 1;
        numeroAleatorioString = "" + auxiliar;

        if (auxiliar < 100000) { //Se o número gerado tiver menos de 6 dígitos
            //Armazena a quantidade de dígitos gerados
            int digitosZeroRestantes = 6 - numeroAleatorioString.length();

            for (int i = 0; i < digitosZeroRestantes; i++) {
                numeroAleatorioString = "0" + numeroAleatorioString;
            }
        }

        idCliente = "CLI-" + numeroAleatorioString;

        return idCliente;
    }

    private void verificarIDExiste(Cliente clienteAuxiliar) {
        //Verifica se IDCLiente já existe na lista
        do {
            if (this.dao.getVerificarIDExiste(clienteAuxiliar.getIdCliente()) == true) {
                clienteAuxiliar.setIdCliente(gerarIDCliente());
            }
        } while (this.dao.getVerificarIDExiste(clienteAuxiliar.getIdCliente()));
    }

    private void verificarCPFExiste(Cliente clienteAuxiliar) {
        //Verifica se CPF já existe na lista
        do {
            if (this.dao.getVerificarCPFExiste(clienteAuxiliar.getCPF()) == true) {
                System.out.print("Esse CPF já existe na lista de clientes, por favor digite novamente: ");
                clienteAuxiliar.setCPF(scanner.nextLine());
            }
        } while (this.dao.getVerificarCPFExiste(clienteAuxiliar.getCPF()));
    }

    private void mostrarCliente(Cliente cliente) {
        System.out.println("\n" + cliente.getIdCliente() + "\n" + cliente.getNome() + "\n" + cliente.getCPF() + "\n"
                + cliente.getDataNascimento() + "\n" + cliente.getEmail());
    }

    private void voltarMenuAutomatico(int segundos) throws InterruptedException, ParseException {
        Thread.sleep(segundos * 1000);
        processosCRUD();
    }

    private void encerrarMenu() {
        System.out.println("Saindo...");
        scanner.close();
    }

    public void getProcessosCRUD() throws ParseException, InterruptedException {
        processosCRUD();
    }

    public void getExibirMenuCRUD() {
        exibirMenuCRUD();
    }

    public void getCadastrarCliente() throws ParseException {
        cadastrarCliente();
    }

    public String getGerarIDCliente() {
        String novoID;
        novoID = gerarIDCliente();

        return novoID;
    }

    public void getVoltarMenuAutomatico(int segundos) throws InterruptedException, ParseException {
        voltarMenuAutomatico(segundos);
    }
}
