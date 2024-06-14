package Control.DAO;

import Control.TipoPessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class LoginDAO {

    private Connection conexao;

    private String solicitarLoginBD() {

    }

    public boolean LoginCheck(String login, String senha) {
        conexao = (Connection) new dbConnect().getConnection();
        boolean Check = false;
        PreparedStatement comandoSQL;
        ResultSet result;

        try {
            comandoSQL = conexao.prepareStatement("SELECT*FROM tbl_Gerente WHERE login= '?' and senha= '?' ");
            comandoSQL.setString(1, login);
            comandoSQL.setString(2, senha);
            result = comandoSQL.executeQuery();

            // Navegação do resultado
            if (result.next()) {
                String loginBD = result.getString("login");
                String senhaBD = result.getString("senha");

                if (login.equals(loginBD) && senha.equals(senhaBD)) {
                    Check = true;
                }
            }

        } catch (SQLException execao) {
            throw new RuntimeException(execao);
        }
        return Check;

    }
}
