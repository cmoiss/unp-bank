package Model;

import Control.DAO.CRUD_DAO;
import Control.DAO.CadastroDAO;
import java.util.Date;

public class Gerente extends Pessoa {
    private String idGerente;
    CRUD_DAO funcao=new CRUD_DAO();

    private String idGerente;
    CRUD_DAO funcao = new CRUD_DAO();

    public Gerente(String tipoPessoa, String nome, String CPF, Date dataNascimento, String email, String login, String senha) {
        super(tipoPessoa, nome, CPF, dataNascimento, email, login, senha);
        this.idGerente = super.id;
    }

    public String getIdGerente() {
        return idGerente;
    }

    public void setIdGerente(String idGerente) {
        this.idGerente = idGerente;
    }
    
    public void cadastrarCliente(){
     CadastroDAO cadastrar=new CadastroDAO();
     cadastrar.CadastroCL(null, null, null,null,null, 0);
           
    }
    public void cadastrarGerente(){
     CadastroDAO cadastrar=new CadastroDAO();
     cadastrar.CadastroG(null, null, null,null,null, 0);
           
    }
    public void checarListaDeContas(){
    funcao.verificarTblContas();
    }
    public void checarDadosDaConta(){
    funcao.checkDadosTblContas(null);
    }
    public void verListaDeClientes(){
    funcao.verifcarTblCliente();
    }
    public void excluirClientes(){
    funcao.excluiirTblCliente(null);
    }
    public void pesquisarCliente(){
    funcao.pesquisarTblCliente(null);
    }
}
