package Control;

import Model.Cliente;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    List<Cliente> listaClientes = new ArrayList();

    //Cliente teste
    Idade idade = new Idade();

    private void imprimirCliente(Cliente cliente) {
        System.out.println("Id: " + cliente.getIdCliente()
                + ", Nome: " + cliente.getNome()
                + ", CPF: " + cliente.getCPF()
                + ", Nascimento: " + cliente.getDataNascimento()
                + ", Email: " + cliente.getEmail()
                + "\n");
    }

    private void imprimirTodosClientes() {
        for (Cliente cliente : listaClientes) {
            imprimirCliente(cliente);
        }
    }

    private void adicionarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    private void pesquisarClienteID(String ID) throws InterruptedException, ParseException {
        boolean clienteExiste = false;
        CRUD crud = new CRUD();

        for (Cliente cliente : listaClientes) {
            if (ID.equals(cliente.getIdCliente())) {
                imprimirCliente(cliente);
                clienteExiste = true;
                break;
            }
        }

        if (clienteExiste == false) {
            System.out.println("Cliente não encontrado!");
            crud.getVoltarMenuAutomatico(2);
        }
    }

    private void pesquisarClienteCPF(String CPF) throws InterruptedException, ParseException {
        boolean clienteExiste = false;
        CRUD crud = new CRUD();

        for (Cliente cliente : listaClientes) {
            if (CPF.equals(cliente.getCPF())) {
                imprimirCliente(cliente);
                clienteExiste = true;
                break;
            }
        }

        if (clienteExiste == false) {
            System.out.println("Cliente não encontrado!");
            crud.getVoltarMenuAutomatico(2);
        }
    }

    private void atualizarCliente() {

    }

    private void removerCliente() {

    }

    private boolean verificarIDExiste(String ID) {
        boolean existe = false;

        for (Cliente cliente : listaClientes) {
            if (ID.equals(cliente.getIdCliente())) {
                existe = true;
            }
        }

        return existe;
    }

    private boolean verificarCPFExiste(String CPF) {
        boolean existe = false;

        for (Cliente cliente : listaClientes) {
            if (CPF.equals(cliente.getCPF())) {
                existe = true;
            }
        }

        return existe;
    }

    public void getImprimirTodosClientes() {
        imprimirTodosClientes();
    }

    public void getAdicionarCliente(Cliente cliente) {
        adicionarCliente(cliente);
    }

    public void getPesquisarClienteID(String ID) throws InterruptedException, ParseException {
        pesquisarClienteID(ID);
    }

    public void getPesquisarClienteCPF(String CPF) throws InterruptedException, ParseException {
        pesquisarClienteCPF(CPF);
    }

    public void getLerCliente() {
        imprimirTodosClientes();
    }

    public void getAtualizarCliente() {
        atualizarCliente();
    }

    public void getRemoverCliente() {
        removerCliente();
    }

    public boolean getVerificarIDExiste(String ID) {
        boolean existe;
        existe = verificarIDExiste(ID);
        return existe;
    }

    public boolean getVerificarCPFExiste(String CPF) {
        boolean existe;
        existe = verificarCPFExiste(CPF);
        return existe;
    }
}
