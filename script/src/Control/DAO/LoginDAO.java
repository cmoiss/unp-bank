package Control.DAO;

import Control.TipoPessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class LoginDAO {

    String usuario = "admin";
    String senha = "adm123";
    private Connection conexao;

    public boolean LoginCheck() {
        conexao = (Connection) new dbConnect().getConnection();
        boolean Check = false;
        PreparedStatement comandoSQL;
        ResultSet resultadoQuerry;

        try {
            //Configura o comando de seleção
            comandoSQL = conexao.prepareStatement("SELECT*FROM tbl_gerente WHERE login = ? and senha = ?");
            comandoSQL.setString(1, usuario);
            comandoSQL.setString(2, senha);

            //Armazena o resultado da querry (solicitação)
            resultadoQuerry = comandoSQL.executeQuery();

            // Navegação do resultado
            if (resultadoQuerry.next()) {
                Check = true;
            }

            verificarResultadoQuerry(comandoSQL, resultadoQuerry, usuario, senha);

        } catch (SQLException execao) {
            throw new RuntimeException(execao);
        }
        return Check;

    }

    public void verificarResultadoQuerry(PreparedStatement comandoSQL, ResultSet resultadoQuerry, String usuario, String senha) throws SQLException {
        comandoSQL = conexao.prepareStatement("SELECT * FROM tbl_gerente WHERE login = ? and senha = ?");
        comandoSQL.setString(1, usuario);
        comandoSQL.setString(2, senha);
        System.out.println("Consulta SQL: " + comandoSQL.toString());

        resultadoQuerry = comandoSQL.executeQuery();
        System.out.println("Resultado da consulta: " + resultadoQuerry.next());
    }
}
