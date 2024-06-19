package Control.DAO.CRUD;

import Control.DAO.dbConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RemoverCliente {

    private Connection conexao;

    private void removerTblCliente(String cpf) {
        conexao = (Connection) new dbConnect().getConnection();
        PreparedStatement comandoSQL;

        try {
            comandoSQL = conexao.prepareStatement("DELETE FROM tbl_cliente WHERE cpf = ?;");
            comandoSQL.setString(1, cpf);
            comandoSQL.execute();
            comandoSQL.close();
            conexao.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    private void removerTblPessoa(String cpf) {
        conexao = (Connection) new dbConnect().getConnection();
        PreparedStatement comandoSQL;

        try {
            comandoSQL = conexao.prepareStatement("DELETE FROM tbl_pessoa WHERE cpf = ?;");
            comandoSQL.setString(1, cpf);
            comandoSQL.execute();
            comandoSQL.close();
            conexao.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    
    public void getRemoverTblClientes(String cpf) {
        removerTblCliente(cpf);
    }
    
    public void getRemoverTblPessoa(String cpf) {
        removerTblPessoa(cpf);
    }    
}
