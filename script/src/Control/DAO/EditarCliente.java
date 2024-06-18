package Control.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EditarCliente {

    private Connection conexao;
    
    private void editarDadosCliente(String cpf, String email, String login, String senha) throws SQLException {
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
    
    public void getEditarDadosCliente(String cpf, String email, String login, String senha) throws SQLException {
        editarDadosCliente(cpf, email, login, senha);
    }
}
