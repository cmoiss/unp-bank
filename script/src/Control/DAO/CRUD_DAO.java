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

    public ResultSet getPesquisarTblCliente(String cpf) {
        return pesquisarTblCliente(cpf);
    }

    public ResultSet getPesquisarTblGerente(String cpf) {
        return pesquisarTblGerente(cpf);
    }
}
