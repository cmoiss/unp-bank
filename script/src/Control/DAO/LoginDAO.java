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

    public boolean LoginCheck(String login, String senha) {
        conexao = (Connection) new dbConnect().getConnection();
        boolean Check = false;
        PreparedStatement comandoSQL = null;
        ResultSet result = null;

        try {
            comandoSQL = conexao.prepareStatement("SELECT*FROM tbl_Gerente WHERE login= '?' and senha= '?' ");
            comandoSQL.setString(1, login);
            comandoSQL.setString(2, senha);
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
