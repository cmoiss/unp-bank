package Control.DAO.Conta;

import Control.DAO.dbConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EfetuarDeposito {

    Connection conexao;

    private void efetuarDeposito(String idConta, double valorDepositado) {
        double saldo = 0;

        PreparedStatement comandoSQL;
        ResultSet resultado;

        try {
            conexao = (Connection) new dbConnect().getConnection();
            
            comandoSQL = conexao.prepareStatement("SELECT saldoAtual FROM tbl_ContaBancaria WHERE idconta=?");
            comandoSQL.setString(1, idConta);
            resultado = comandoSQL.executeQuery();
            resultado.next();
            saldo = resultado.getDouble(1);
            
            saldo += valorDepositado;
            comandoSQL = conexao.prepareStatement("UPDATE tbl_ContaBancaria SET saldoAtual = ? WHERE idconta = ?;");
            comandoSQL.setDouble(1, saldo);
            comandoSQL.setString(2, idConta);
            comandoSQL.execute();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public void getEfetuarDeposito(String idConta, double valorDepositado) {
        efetuarDeposito(idConta, valorDepositado);
    }
}
