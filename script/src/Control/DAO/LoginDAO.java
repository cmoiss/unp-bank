package Control.DAO;

import Control.TipoPessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class LoginDAO {
    private TipoPessoa tipoPessoa;
    private Connection conexao;

    public LoginDAO () {
        this.tipoPessoa = tipoPessoa;
    }
    
    
    public boolean loginCheck(String login, String senha) throws SQLException {
        conexao = (Connection) new dbConnect().getConnection();
        boolean Check = false;
        PreparedStatement comandoSQL;
        ResultSet resultadoQuerry;

        try{
            //Configura o comando de seleção
            conexao = (Connection) new dbConnect().getConnection();
            comandoSQL = conexao.prepareStatement("SELECT*FROM tbl_Gerente WHERE login=? and senha=?");
            comandoSQL.setString(1, login);
            comandoSQL.setString(2, senha);


            //Armazena o resultado da querry (solicitação)
            resultadoQuerry = comandoSQL.executeQuery();

            // Navegação do resultado
            if (resultadoQuerry.next()) {
                Check = true;
            }

            

            // Navegação do resultado
            /*if (result.next()) {
                String loginBD = result.getString("login");
                String senhaBD = result.getString("senha");

                if (login.equals(loginBD) && senha.equals(senhaBD)) {
                    Check = true;
                }
            }*/


            /*verificarResultadoQuerry(comandoSQL, resultadoQuerry, usuario, senha);

       

    }

    private void verificarResultadoQuerry(PreparedStatement comandoSQL, ResultSet resultadoQuerry, String usuario, String senha) throws SQLException {
        comandoSQL = conexao.prepareStatement(selectTipoPessoa(tipoPessoa));
        comandoSQL.setString(1, usuario);
        comandoSQL.setString(2, senha);
        System.out.println("Consulta SQL: " + comandoSQL.toString());

        resultadoQuerry = comandoSQL.executeQuery();
        System.out.println("Resultado da consulta: " + resultadoQuerry.next());
    }

    private String selectTipoPessoa(TipoPessoa tipoPessoa) {
        String select = null;
        if (tipoPessoa.equals(TipoPessoa.CLIENTE)) {
            select = "SELECT*FROM tbl_cliente WHERE login = ? and senha = ?";
        } else if (tipoPessoa.equals(TipoPessoa.GERENTE)) {
            select = "SELECT*FROM tbl_gerente WHERE login = ? and senha = ?";
        }
        
        return select;
    }
    
    public boolean getLoginCheck(String usuario, String senha) {
        boolean check = loginCheck(usuario, senha);
        
        return check;
    }*/
 } catch (SQLException execao) {
            throw new RuntimeException(execao);
        }
        return Check;

   
    }
}
