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

    private void editarDados() {
        
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

    public void excluiirTblCliente(String idCliente) {
        PreparedStatement comandoSQL;
        try {
            conexao = (Connection) new dbConnect().getConnection();
            comandoSQL = conexao.prepareStatement("DELETE FROM tbl_Cliente WHERE idCliente=?");
            comandoSQL.setString(1, idCliente);
            System.out.println("feito");
            comandoSQL.execute();
            comandoSQL.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public ResultSet getPesquisarTblCliente(String cpf) {
        return pesquisarTblCliente(cpf);
    }

    public ResultSet getPesquisarTblGerente(String cpf) {
        return pesquisarTblGerente(cpf);
    }

    public double verificarSaldo(String idConta) {
        PreparedStatement comandoSQL;
        try {
            conexao = (Connection) new dbConnect().getConnection();
            comandoSQL = conexao.prepareStatement("select saldoAtual from tbl_ContaBancaria where idConta=?;");
            comandoSQL.setString(1, idConta);
            System.out.println("feito");
            comandoSQL.execute();
            comandoSQL.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return 0;
    }

    public double efetuarSaque(String idConta, double saldoAtual) {
        PreparedStatement comandoSQL;
        try {
            conexao = (Connection) new dbConnect().getConnection();
            comandoSQL = conexao.prepareStatement("UPDATE tbl_ContaBancaria SET saldoAtual= saldoAtual-? WHERE idConta=?;");
            comandoSQL.setDouble(1, saldoAtual);
            comandoSQL.setString(2, idConta);
            System.out.println("feito");
            comandoSQL.execute();
            comandoSQL.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return 0;
    }

    public double efetuarDeposito(String idConta, double saldoAtual) {
        PreparedStatement comandoSQL;
        try {
            conexao = (Connection) new dbConnect().getConnection();
            comandoSQL = conexao.prepareStatement("UPDATE tbl_ContaBancaria SET saldoAtual= saldoAtual+? WHERE idConta=?;");
            comandoSQL.setDouble(1, saldoAtual);
            comandoSQL.setString(2, idConta);
            System.out.println("feito");
            comandoSQL.execute();
            comandoSQL.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return 0;
    }
    
    public void getEditarDados() {
        editarDados();
    }
}
