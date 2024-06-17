package Model;

import Control.DAO.CRUD_DAO;
import Control.DAO.CadastroDAO;
import Control.TipoPessoa;
import java.util.Date;
import java.sql.SQLException;
import java.sql.ResultSet;

public class Gerente extends Pessoa {

    private String idGerente;
    CRUD_DAO funcao = new CRUD_DAO();

    public Gerente(String idGerente, String nome, String CPF, Date dataNascimento, String email, String login, String senha, String genero) {
        super(TipoPessoa.GERENTE, nome, CPF, dataNascimento, email, login, senha, genero);
        this.idGerente = idGerente;
    }

    private void cadastrarCliente(String nome, String cpf, Date data, int idade, String email, String login, String senha, double saldoAtual, String genero) throws SQLException {
        CadastroDAO cadastrar = new CadastroDAO();
        cadastrar.getCadastrarCliente(nome, cpf, data, idade, email, login, senha, saldoAtual, genero);
        cadastrar.getCloseConnction();
    }

    private void cadastrarGerente(String nome, String cpf, Date dataNascimento, int idade, String email, String login, String senha, String genero) throws SQLException {
        CadastroDAO cadastrar = new CadastroDAO();
        cadastrar.getCadastrarGerente(nome, cpf, dataNascimento, idade, email, login, senha, genero);
        cadastrar.getCloseConnction();
    }

    private void editarDados(String cpf, String email, String login, String senha) throws SQLException {
        CRUD_DAO editar = new CRUD_DAO();
        editar.getEditarDados(cpf, email, login, senha);
    }
    
    private boolean verificarCPFExistenteBD(String cpf) throws SQLException {
        boolean existe;
        CadastroDAO verificar = new CadastroDAO();
        existe = verificar.getVerificarCPFExistente(cpf);
        return existe;
    }

    private void checarListaDeContas() {
        funcao.verificarTblContas();
    }

    private void checarDadosConta() {
        funcao.checkDadosTblContas(null);
    }

    private void verListaDeCliente() throws SQLException {
        funcao.verifcarTblCliente();
    }

    private int ExcluirCliente() {
       return funcao.getexcluirTblCliente(null);
    }
    
    public int getExcluirCliente(String cpf){
        return ExcluirCliente();
    }

    private ResultSet pesquisarCliente(String cpf) {
        return funcao.getPesquisarTblCliente(cpf);
    }

    private ResultSet pesquisarGerente(String cpf) {
        return funcao.getPesquisarTblGerente(cpf);
    }
    
    public String getIdGerente() {
        return idGerente;
    }

    public void setIdGerente(String idGerente) {
        this.idGerente = idGerente;
    }

    public void getCadastrarCliente(String nome, String cpf, Date data, int idade, String email, String login, String senha, double saldoAtual, String genero) throws SQLException {
        cadastrarCliente(nome, cpf, data, idade, email, login, senha, saldoAtual, genero);
    }

    public void getCadastrarGerente(String nome, String cpf, Date dataNascimento, int idade, String email, String login, String senha, String genero) throws SQLException {
        cadastrarGerente(nome, cpf, dataNascimento, idade, email, login, senha, genero);
    }

    public boolean getVerificarCPFEXistente(String cpf) throws SQLException {
        return verificarCPFExistenteBD(cpf);
    }

    public void getChecarListaDeContas() {
        checarListaDeContas();
    }

    public void getChecarDadosConta() {
        checarDadosConta();
    }

    public void getVerListaDeCliente() throws SQLException {
        verListaDeCliente();
    }

    public void getEditarDados(String cpf, String email, String login, String senha) throws SQLException {
        editarDados(cpf, email, login, senha);
    }
    
    public ResultSet getPesquisarCliente(String cpf) {
        return pesquisarCliente(cpf);
    }
    
    public ResultSet getPesquisarGerente(String cpf) {
        return pesquisarGerente(cpf);
    }

}
