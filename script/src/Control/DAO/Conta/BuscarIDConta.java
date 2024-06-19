package Control.DAO.Conta;

import Control.DAO.dbConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BuscarIDConta {

    private Connection conexao;

    private String buscarIdConta(String cpf) {
        String idConta = null;

        PreparedStatement comandoSQL;
        ResultSet resultado;

        try {
            conexao = (Connection) new dbConnect().getConnection();
            comandoSQL = conexao.prepareStatement("select idConta from tbl_cliente where cpf = ?");
            comandoSQL.setString(1, cpf);
            resultado = comandoSQL.executeQuery();
            resultado.next();
            
            idConta = resultado.getString(1);
            
            return idConta;
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public String getBuscarIdConta(String cpf) {
        return buscarIdConta(cpf);
    }
}
