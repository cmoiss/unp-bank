package Control.DAO;

import Control.GerarID;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.sql.ResultSet;

public class CadastroDAO {

    private GerarID gerarId = new GerarID();
    private Connection conexao;

    private void cadastrarCliente(String nome, String cpf, Date data, int idade, String email, String login, String senha, double saldoAtual) throws SQLException {
        conexao = (Connection) new dbConnect().getConnection();
        PreparedStatement comandoSQL = null;

        insertTBLPessoa(comandoSQL, nome, cpf, data, idade, email);
        insertTBLConta(comandoSQL, this.gerarId.getGerarID(), saldoAtual);
        insertTBLCliente(comandoSQL, this.gerarId.getGerarID(), true, cpf, login, senha, this.gerarId.getGerarID());

        
    }

    private void cadastrarGerente(String nome, String cpf, Date data, int idade, String email, String login, String senha) throws SQLException {
        conexao = (Connection) new dbConnect().getConnection();
        PreparedStatement comandoSQL = null;

        insertTBLPessoa(comandoSQL, nome, cpf, data, idade, email);
        insertTBLGerente(comandoSQL, this.gerarId.getGerarID(), cpf, login, senha);
    }

    private boolean verificarCPFExistente(String cpf) throws SQLException {
        boolean existe = false;
        conexao = (Connection) new dbConnect().getConnection();
        
        PreparedStatement pesquisarCPF = conexao.prepareStatement("SELECT * FROM tbl_pessoa WHERE cpf =?");
        pesquisarCPF.setString(1, cpf);

        ResultSet resultadoVerificaçaoCPF = pesquisarCPF.executeQuery();

        if (resultadoVerificaçaoCPF.next()) {
            existe = true;   
        }
        
        return existe;
    }

    private void insertTBLPessoa(PreparedStatement comandoSQL, String nome, String cpf, Date dataNascimentoJava, int idade, String email) {
        try {
            java.sql.Date dataNascimentoSQL = new java.sql.Date(dataNascimentoJava.getTime());

            comandoSQL = conexao.prepareStatement("INSERT INTO tbl_Pessoa (nome, cpf, dataNascimento, idade, email)VALUES(?,?,?,?,?)");
            comandoSQL.setString(1, nome);
            comandoSQL.setString(2, cpf);
            comandoSQL.setDate(3, dataNascimentoSQL);
            comandoSQL.setInt(4, idade);
            comandoSQL.setString(5, email);
            comandoSQL.execute();
            
            comandoSQL.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    private void insertTBLConta(PreparedStatement comandoSQL, String idConta, double saldoAtual) {
        try {
            comandoSQL = conexao.prepareStatement("INSERT INTO tbl_contabancaria (idConta, saldoAtual)VALUES(?,?)");
            comandoSQL.setString(1, idConta);
            comandoSQL.setDouble(2, saldoAtual);
            comandoSQL.execute();
            
            comandoSQL.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    private void insertTBLCliente(PreparedStatement comandoSQL, String idCliente, boolean statusCliente, String cpf, String login, String senha, String idConta) {
        try {
            comandoSQL = conexao.prepareStatement("INSERT INTO tbl_cliente (idCliente, statusCliente, cpf,login,senha, idConta) VALUES(?,?,?,?,?,?)");
            comandoSQL.setString(1, idCliente);
            comandoSQL.setBoolean(2, statusCliente);
            comandoSQL.setString(3, cpf);
            comandoSQL.setString(4, login);
            comandoSQL.setString(5, senha);
            comandoSQL.setString(6, idConta);
            comandoSQL.execute();
            
            comandoSQL.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    private void insertTBLGerente(PreparedStatement comandoSQL, String idGerente, String cpf, String login, String senha) {
        try {
            comandoSQL = conexao.prepareStatement("INSERT INTO tbl_gerente (idGerente,cpf,login,senha) VALUES(?,?,?,?)");
            comandoSQL.setString(1, idGerente);
            comandoSQL.setString(2, cpf);
            comandoSQL.setString(3, login);
            comandoSQL.setString(4, senha);
            comandoSQL.execute();
            
            comandoSQL.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public void getCadastrarCliente(String nome, String cpf, Date data, int idade, String email, String login, String senha, double saldoAtual) throws SQLException {
        cadastrarCliente(nome, cpf, data, idade, email, login, senha, saldoAtual);
    }

    public void getCadastrarGerente(String nome, String cpf, Date dataNascimento, int idade, String email, String login, String senha) throws SQLException {
        cadastrarGerente(nome, cpf, dataNascimento, idade, email, login, senha);
    }

    public boolean getVerificarCPFExistente(String cpf) throws SQLException {
        boolean existente;
        
        existente = verificarCPFExistente(cpf);
        
        return existente;
    }
}
