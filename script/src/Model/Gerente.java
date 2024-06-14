package Model;

import Control.DAO.CRUD_DAO;
import Control.DAO.CadastroDAO;
import Control.TipoPessoa;
import java.sql.SQLException;
import java.util.Date;

public class Gerente extends Pessoa {
    private String idGerente;
    CRUD_DAO funcao=new CRUD_DAO();

    public Gerente(String idGerente, TipoPessoa tipoPessoa, String nome, String CPF, Date dataNascimento, String email, String login, String senha) {
        super(tipoPessoa, nome, CPF, dataNascimento, email, login, senha);
        this.idGerente = idGerente;
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
    public void checarDadosConta(){
    funcao.checkDadosTblContas(null);
    }
    public void verListaDeCliente() throws SQLException{
    funcao.verifcarTblCliente();
    }
    public void excluirCliente(){
    funcao.excluiirTblCliente(null);
    }
    public void pesquisarCliente(){
    funcao.pesquisarTblCliente(null);
    }
    public static void main (String args[]) throws SQLException{
        Gerente grt=new Gerente("1000",TipoPessoa.GERENTE,"Gerente","12345678912",null,"sefnsghrbsdh","adm","");
        grt.checarListaDeContas();
        
        
    }
}
