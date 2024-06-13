package Control.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnect {

    public Connection getConnection() {
        try {          //"jdbc:mysql://localhost:3306/db_ubank: COLOQUE O DB CORRETO","SEU USER","SUA SENHA"
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/db_ubank?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "admin");
        } catch (SQLException excecao) {
            throw new RuntimeException(excecao);
        }
    }
}
