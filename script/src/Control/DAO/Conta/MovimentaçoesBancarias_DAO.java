package Control.DAO.Conta;

import Control.DAO.dbConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MovimentaçoesBancarias_DAO {

    private Connection conexao = (Connection) new dbConnect().getConnection();

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
}
