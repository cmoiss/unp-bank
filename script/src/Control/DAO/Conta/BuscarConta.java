package Control.DAO.Conta;

import Control.DAO.dbConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BuscarConta {

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

    private boolean checkExistenciaContaPorID(String idConta) {
        boolean existe = false;

        PreparedStatement comandoSQL;
        ResultSet resultado;

        try {
            conexao = (Connection) new dbConnect().getConnection();
            comandoSQL = conexao.prepareStatement("select idConta from tbl_contabancaria where idconta = ?");
            comandoSQL.setString(1, idConta);
            resultado = comandoSQL.executeQuery();

            if (resultado.next()) {
                existe = true;
            }

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }

        return existe;
    }

    public String getBuscarIdConta(String cpf) {
        return buscarIdConta(cpf);
    }

    public boolean getCheckExistenciaContaPorID(String idConta) {
        return checkExistenciaContaPorID(idConta);
    }
}
