package Control.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class CRUD_DAO {

    private Connection conexao;

    public void conexao() {
        conexao = (Connection) new dbConnect().getConnection();
    }

    private ResultSet pesquisarTblCliente(String CPF) {
        PreparedStatement comandoSQL;
        ResultSet resultado;
        try {
            conexao = (Connection) new dbConnect().getConnection();
            comandoSQL = conexao.prepareStatement("SELECT p.nome, P.cpf, p.dataNascimento, p.idade, p.email, p.genero, c.idCliente, c.statusCliente, c.idConta, cb.saldoAtual, c.login, c.senha "
                    + "FROM tbl_Pessoa p "
                    + "INNER JOIN tbl_Cliente c ON p.cpf = c.cpf "
                    + "INNER JOIN tbl_ContaBancaria cb ON c.idConta = cb.idConta "
                    + "WHERE p.cpf =?;");
            comandoSQL.setString(1, CPF);
            resultado = comandoSQL.executeQuery();
            return resultado;
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    private ResultSet pesquisarTblGerente(String CPF) {
        PreparedStatement comandoSQL;
        ResultSet resultado;
        try {
            conexao = (Connection) new dbConnect().getConnection();
            comandoSQL = conexao.prepareStatement("SELECT p.nome, p.cpf, p.dataNascimento, p.idade, p.email, p.genero, g.idGerente, g.login, g.senha "
                    + "FROM tbl_Pessoa p "
                    + "INNER JOIN tbl_Gerente g ON p.cpf = g.cpf "
                    + "WHERE p.cpf =?;");
            comandoSQL.setString(1, CPF);
            resultado = comandoSQL.executeQuery();
            return resultado;
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    private void editarDados(String cpf, String email, String login, String senha) throws SQLException {
        editarEmail(cpf, email);
        editarLogin(cpf, login);
        editarSenha(cpf, senha);
    }

    private void editarEmail(String cpf, String email) throws SQLException {
        PreparedStatement comandoSQL;

        try {
            conexao = (Connection) new dbConnect().getConnection();
            comandoSQL = conexao.prepareStatement("UPDATE tbl_Pessoa SET email=? WHERE cpf=?;");
            comandoSQL.setString(1, email);
            comandoSQL.setString(2, cpf);
            comandoSQL.executeUpdate();
            conexao.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    private void editarLogin(String cpf, String login) throws SQLException {
        PreparedStatement comandoSQL;

        try {
            conexao = (Connection) new dbConnect().getConnection();
            comandoSQL = conexao.prepareStatement("UPDATE tbl_Cliente SET login=? WHERE cpf=?;");
            comandoSQL.setString(1, login);
            comandoSQL.setString(2, cpf);
            comandoSQL.executeUpdate();
            conexao.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    private void editarSenha(String cpf, String senha) throws SQLException {
        PreparedStatement comandoSQL;

        try {
            conexao = (Connection) new dbConnect().getConnection();
            comandoSQL = conexao.prepareStatement("UPDATE tbl_Cliente SET senha=? WHERE cpf=?;");
            comandoSQL.setString(1, senha);
            comandoSQL.setString(2, cpf);
            comandoSQL.executeUpdate();
            conexao.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public void verificarTblContas() {
        PreparedStatement comandoSQL;
        try {
            conexao = (Connection) new dbConnect().getConnection();
            comandoSQL = conexao.prepareStatement("SELECT*FROM tbl_ContaBancaria");
            System.out.println("feito");
            comandoSQL.execute();
            comandoSQL.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public void checkDadosTblContas(String idConta) {
        PreparedStatement comandoSQL;
        try {
            conexao = (Connection) new dbConnect().getConnection();
            comandoSQL = conexao.prepareStatement("SELECT*FROM tbl_ContaBancaria WHERE idConta=?");
            comandoSQL.setString(1, idConta);
            System.out.println("feito");
            comandoSQL.execute();
            comandoSQL.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public void verifcarTblCliente() throws SQLException {
        PreparedStatement comandoSQL;
        try {
            conexao = (Connection) new dbConnect().getConnection();
            comandoSQL = conexao.prepareStatement("SELECT*FROM tbl_Cliente");
            System.out.println("feito");
            comandoSQL.execute();
            comandoSQL.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    private int excluirTblCliente(String cpf) {
        PreparedStatement comandoSQL;
        int resultado;
        try {
            conexao = (Connection) new dbConnect().getConnection();
            comandoSQL = conexao.prepareStatement("DELETE FROM tbl_cliente WHERE cpf=?");
            comandoSQL.setString(1, cpf);
            System.out.println("feito");
            resultado=comandoSQL.executeUpdate(); 
            return resultado;
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public int getexcluirTblCliente(String cpf){
        return excluirTblCliente(cpf);
    }

    public ResultSet getPesquisarTblCliente(String cpf) {
        return pesquisarTblCliente(cpf);
    }

    public ResultSet getPesquisarTblGerente(String cpf) {
        return pesquisarTblGerente(cpf);
    }

    public void getEditarDados(String cpf, String email, String login, String senha) throws SQLException {
        editarDados(cpf, email, login, senha);
    }
}
