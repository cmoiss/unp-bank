package Control;

import Model.Cliente;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class TesteCódigo {

    public static void main(String[] args) throws ParseException, InterruptedException {

        CRUD crud = new CRUD();

        crud.getProcessosCRUD();

        /*
        Idade idade = new Idade();
        Cliente clienteTeste = new Cliente("10", true, "Caio", "093", idade.getDataNascimento(), "caio@gmail.com");

        ClienteDAO dao = new ClienteDAO(clienteTeste);
        dao.getImprimirTodosClientes();

        crud.getCadastrarCliente();
        //Instância de um objeto da classe Idade
        Idade idade = new Idade();

        idade.getEspaçoVazio();       
        idade.getFormatarDataNascimento(idade.getLerNascimentoString());
        idade.getCalcularIdade();
        idade.getImprimirIdade();
        idade.getVerificarIdade();
        idade.getEspaçoVazio();
         */
    }
}
