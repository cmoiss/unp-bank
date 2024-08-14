package Control.DAO.Conta;

import Control.DAO.dbConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BuscarContaDAO {

    private Connection conexao;

    private String buscarIdConta(String cpf) {
        String idConta = null;

        PreparedStatement comandoSQL;
        ResultSet resultado;

        try {
            conexao = (Connection) new dbConnect().getConnection();
            comandoSQL = conexao.prepareStatement("select idConta from tbl_Cliente where cpf = ?");
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
            comandoSQL = conexao.prepareStatement("select idConta from tbl_ContaBancaria where idconta = ?");
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

    public boolean checkIfAccountIsActive(String idConta) {
        boolean active = false;

        PreparedStatement comandoSQL;
        ResultSet resultado;

        try {
            conexao = (Connection) new dbConnect().getConnection();

            comandoSQL = conexao.prepareStatement("select statusCliente from tbl_Cliente where idConta = ?");
            comandoSQL.setString(1, idConta);
            resultado = comandoSQL.executeQuery();

            // Verifica se há algum resultado
            if (resultado.next()) {
                int status = resultado.getInt("statusCliente");

                // Verifica se a conta está ativa
                if (status == 1) {
                    active = true;
                }
            }
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }

        return active;
    }

    public String getBuscarIdConta(String cpf) {
        return buscarIdConta(cpf);
    }

    public boolean getCheckExistenciaContaPorID(String idConta) {
        return checkExistenciaContaPorID(idConta);
    }
}
