package Control.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CRUD_DAO {

    private Connection conexao;

    public void conexao() {
        conexao = (Connection) new dbConnect().getConnection();
    }

    public void verificarTblContas() {
        PreparedStatement comandoSQL = null;
        try {
            comandoSQL = conexao.prepareStatement("SELECT*FROM tbl_ContaBancaria");
            comandoSQL.execute();
            comandoSQL.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public void checkDadosTblContas(String idConta) {
        PreparedStatement comandoSQL = null;
        try {
            comandoSQL = conexao.prepareStatement("SELECT*FROM tbl_ContaBancaria WHERE idConta=?");
            comandoSQL.setString(1, idConta);
            comandoSQL.execute();
            comandoSQL.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public void verifcarTblCliente() {
        PreparedStatement comandoSQL = null;
        try {
            comandoSQL = conexao.prepareStatement("SELECT*FROM tbl_Cliente");
            comandoSQL.execute();
            comandoSQL.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public void excluiirTblCliente(String idCliente) {
        PreparedStatement comandoSQL = null;
        try {
            comandoSQL = conexao.prepareStatement("DELETE FROM tbl_Cliente WHERE idCliente=?");
            comandoSQL.setString(1, idCliente);
            comandoSQL.execute();
            comandoSQL.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public void pesquisarTblCliente(String CPF) {
        PreparedStatement comandoSQL = null;
        try {
            comandoSQL = conexao.prepareStatement("SELECT WHERE CPF=? FROM tblCliente");
            comandoSQL.setString(1, CPF);
            comandoSQL.execute();
            comandoSQL.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
}
