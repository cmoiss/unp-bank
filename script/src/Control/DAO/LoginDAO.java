package Control.DAO;

import Control.TipoPessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class LoginDAO {
    private TipoPessoa tipoPessoa;
    private Connection conexao;

    public LoginDAO (TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }
    
    private boolean loginCheck(String usuario, String senha) {
        conexao = (Connection) new dbConnect().getConnection();
        boolean Check = false;
        PreparedStatement comandoSQL;
        ResultSet resultadoQuerry;

        try {
            //Configura o comando de seleção
            comandoSQL = conexao.prepareStatement(selectTipoPessoa(tipoPessoa));
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
    }
}
