package Model;

import Control.DAO.CRUD_DAO;
import Control.DAO.CRUD.CadastroDAO;
import Control.DAO.CRUD.EditarCliente;
import Control.DAO.CRUD.PegarCliente;
import Control.DAO.CRUD.DesativarCliente;
import Control.TipoPessoa;
import java.util.Date;
import java.sql.SQLException;
import java.util.ArrayList;

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

    private ArrayList<Object> pesquisarClienteUnico(String cpf) {
        PegarCliente pesquisa = new PegarCliente();
        return pesquisa.getPegarClienteUnico(cpf);
    }
    
    private void editarDados(String cpf, String email, String login, String senha) throws SQLException {
        EditarCliente editar = new EditarCliente();
        editar.getEditarDadosCliente(cpf, email, login, senha);
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

    private void excluirCliente(String cpf) {
        DesativarCliente remover = new DesativarCliente();
        remover.getDesativarCliente(cpf);
    }
    
    public void getExcluirCliente(String cpf){
        excluirCliente(cpf);
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

    public boolean getVerificarPessoaEXistente(String cpf) throws SQLException {
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
    
    public ArrayList<Object> getPesquisarCliente(String cpf) {
        return pesquisarClienteUnico(cpf);
    }
    
    public ArrayList<Object> getPesquisarClienteUnico(String cpf) {
        return pesquisarClienteUnico(cpf);
    }
}
