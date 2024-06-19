package Control.DAO.Conta;

import Control.DAO.dbConnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class EfetuarSaque {
    
    private Connection conexao;
    
    private void sacar(String idConta, double valorSolicitado) {
        double saldo = 0;
        
        PreparedStatement comandoSQL;
        ResultSet resultado;
        
        try {
            conexao = (Connection) new dbConnect().getConnection();
            comandoSQL = conexao.prepareStatement("SELECT saldoAtual FROM tbl_contabancaria WHERE idconta=?");
            comandoSQL.setString(1, idConta);
            resultado = comandoSQL.executeQuery();
            resultado.next();
            saldo = resultado.getDouble(1);

            // Não há saldo
            if (saldo < 0) {
                JOptionPane.showMessageDialog(null, "Não há saldo disponível na conta!", "Saldo insuficiente", JOptionPane.WARNING_MESSAGE);
            } else if (saldo < valorSolicitado) { //Saldo insuficiente
                JOptionPane.showMessageDialog(null, "Valor solicitado para saque é maior que o valor disponível na conta!", "Saldo insuficiente", JOptionPane.WARNING_MESSAGE);
            } else {
                saldo = saldo - valorSolicitado;
                comandoSQL = conexao.prepareStatement("UPDATE tbl_contabancaria SET saldoAtual = ? WHERE idconta = ?;");
                comandoSQL.setDouble(1, saldo);
                comandoSQL.setString(2, idConta);
                comandoSQL.execute();
            }
            
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    
    public void getSacar(String idConta, double valorSolicitado) {
        sacar(idConta, valorSolicitado);
    }
}
