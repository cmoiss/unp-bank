package Control.DAO;

import Control.TipoPessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class LoginDAO {

    String auxiliar = null;
    TipoPessoa tipoPessoa = null;

    public LoginDAO(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;

        if (tipoPessoa.equals(tipoPessoa.CLIENTE)) {
            auxiliar = "tbl_cliente";
        } else if (tipoPessoa.equals(tipoPessoa.GERENTE)) {
            auxiliar = "tbl_gerente";
        }
    }

    private Connection conexao;

    public boolean LoginCheck(String Login, String Senha) {
        conexao = (Connection) new dbConnect().getConnection();
        boolean Check = false;
        PreparedStatement comandoSQL = null;
        ResultSet result = null;

        try {
            comandoSQL = conexao.prepareStatement("SELECT*FROM " + auxiliar + " WHERE Login=? and Senha=?");
            comandoSQL.setString(1, Login);
            comandoSQL.setString(2, Senha);
            result = comandoSQL.executeQuery();
            if (result.next()) {
                Check = true;
            }
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return Check;

    }
}
