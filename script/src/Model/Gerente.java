package Model;

import Control.DAO.CRUD_DAO;
import Control.DAO.CadastroDAO;
import Control.TipoPessoa;
import java.sql.SQLException;
import java.util.Date;

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
    }

    private void cadastrarGerente(String nome, String cpf, Date dataNascimento, int idade, String email, String login, String senha, String genero) throws SQLException {
        CadastroDAO cadastrar = new CadastroDAO();
        cadastrar.getCadastrarGerente(nome, cpf, dataNascimento, idade, email, login, senha, genero);
    }

    private boolean verificarCPFExistente(String cpf) throws SQLException {
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

    private void excluirCliente() {
        funcao.excluiirTblCliente(null);
    }

    private void pesquisarCliente() {
        funcao.pesquisarTblCliente(null);
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
        boolean existe;
        existe = verificarCPFExistente(cpf);
        return existe;
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

    public void getExcluirCliente() {
        excluirCliente();
    }

    public void getPesquisarCliente() {
        pesquisarCliente();
    }

}
