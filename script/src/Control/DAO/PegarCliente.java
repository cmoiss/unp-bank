package Control.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PegarCliente {

    private Connection conexao;

    private ArrayList<Object> PegarCliente() {
        conexao = (Connection) new dbConnect().getConnection();
        PreparedStatement comandoSQL;
        ResultSet resultado;

        ArrayList<Object> tbl_Cliente = new ArrayList<>();

        try {
            comandoSQL = conexao.prepareStatement("""
                                          SELECT 
                                          tbl_pessoa.nome, tbl_pessoa.cpf, tbl_pessoa.idade, tbl_cliente.idCliente, tbl_cliente.idConta, tbl_cliente.statusCliente, tbl_ContaBancaria.saldoAtual
                                          FROM tbl_Pessoa
                                          INNER JOIN tbl_Cliente ON tbl_Pessoa.cpf = tbl_Cliente.cpf
                                          INNER JOIN tbl_ContaBancaria ON tbl_Cliente.idConta = tbl_ContaBancaria.idConta;
                                          """);

            resultado = comandoSQL.executeQuery();

            while (resultado.next()) {
                Object[] cliente = new Object[7];
                cliente[0] = resultado.getString(1);
                cliente[1] = resultado.getString(2);
                cliente[2] = resultado.getInt(3);
                cliente[3] = resultado.getString(4);
                cliente[4] = resultado.getString(5);
                cliente[5] = resultado.getBoolean(6);
                cliente[6] = resultado.getDouble(7);
                tbl_Cliente.add(cliente);
            }

            comandoSQL.close();
            conexao.close();

            return tbl_Cliente;
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public ArrayList<Object> getPegarClientes() {
        return PegarCliente();
    }
}
