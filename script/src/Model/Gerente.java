
package Model;

import java.util.Date;

public class Gerente extends Pessoa {
    private String idGerente;

    public Gerente(String idGerente, String nome, String CPF, Date dataNascimento, String email) {
        super(nome, CPF, dataNascimento, email);
        this.idGerente = idGerente;
    }

    public String getIdGerente() {
        return idGerente;
    }

    public void setIdGerente(String idGerente) {
        this.idGerente = idGerente;
    }
    
    public void cadastrarCliente(){
     /* Gerente cadastra cliente */
    }
    public void cadastrarGerente(){
    /* Gerente ADM cadastra novo Gerente*/
    }
    public void checarListaDeContas(){
    /* Gerente acessa lista de contas no database*/
    }
    public void checarDadosDaConta(){
    /* Gerente checa dados de uma conta especifica */
    }
    public void verListaDeClientes(){
    /* Gerente Acessa Lista de Clientes do Banco*/
    }
    public void excluirClientes(){
    /* Gerente pode excluir clientes do database*/
    }
    public void pesquisarCliente(){
    /* Gerente pesquisa cliente no databse */
    }
}
