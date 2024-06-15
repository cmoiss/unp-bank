<<<<<<< HEAD
=======

>>>>>>> origin/working-on-code
package Control.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

<<<<<<< HEAD
public class dbConnect {

    public Connection getConnection() {
        try {          //"jdbc:mysql://localhost:3306/db_ubank: COLOQUE O DB CORRETO","SEU USER","SUA SENHA"
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/db_ubank", "root", "admin");
        } catch (SQLException excecao) {

            throw new RuntimeException(excecao);
        }
        
=======


public class dbConnect {
    public Connection getConnection() {
		try {          //"jdbc:mysql://localhost:3306/db_ubank: COLOQUE O DB CORRETO","SEU USER","SUA SENHA"
                    return DriverManager.getConnection("jdbc:mysql://localhost:3306/db_ubank","root","admin");
		 } 
		 catch(SQLException excecao) {
			throw new RuntimeException(excecao);
		 }
>>>>>>> origin/working-on-code
    }
}
