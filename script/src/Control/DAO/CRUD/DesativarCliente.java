package Control.DAO.CRUD;

import Control.DAO.dbConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DesativarCliente {

    private Connection conexao;

    private void desativarCliente(String cpf) {
        conexao = (Connection) new dbConnect().getConnection();
        PreparedStatement comandoSQL;

        try {
            comandoSQL = conexao.prepareStatement("""
                                                  update tbl_Cliente
                                                  set statusCliente = false
                                                  where cpf = ?;
                                                  """);
            comandoSQL.setString(1, cpf);
            comandoSQL.execute();
            comandoSQL.close();
            conexao.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public void getDesativarCliente(String cpf) {
        desativarCliente(cpf);
    }
}
