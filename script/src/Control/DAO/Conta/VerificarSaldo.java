package Control.DAO.Conta;

import Control.DAO.dbConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class VerificarSaldo {

    private Connection conexao = (Connection) new dbConnect().getConnection();

    public double verificarSaldo(String idConta) {
        double valor = 0;

        PreparedStatement comandoSQL;
        ResultSet resultado;

        try {
            conexao = (Connection) new dbConnect().getConnection();
            comandoSQL = conexao.prepareStatement("select saldoAtual from tbl_ContaBancaria where idConta=?");
            comandoSQL.setString(1, idConta);
            resultado = comandoSQL.executeQuery();

            /*
            resultado.next();
            valor = resultado.getDouble(1);
            */
            
            // Verificar se há linhas no resultado
            if (resultado.next()) {
                valor = resultado.getDouble(1);
            } else {
                // Nenhuma linha encontrada, você pode retornar um valor padrão ou lançar uma exceção
                valor = 0;
            }
            
            comandoSQL.close();
            conexao.close();

            return valor;
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public double getVerificarSaldo(String idConta) {
        return verificarSaldo(idConta);
    }
}
