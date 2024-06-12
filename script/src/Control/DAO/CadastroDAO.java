
package Control.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CadastroDAO {
    private Connection conexao;
        public void CadastroCL (String nome,String CPF, String email,String login,String senha, int Idade){
            conexao=(Connection)new dbConnect(). getConnection();    
        PreparedStatement comandoSQL=null;        
        
        try{
            comandoSQL=conexao.prepareStatement(" INSERT INTO tbl_Pessoa (nome,cpf,dataNascimento,idPessoa)VALUES(?,?,?,?,?,?)");
            comandoSQL.setString(1,nome);
            comandoSQL.setString(2,CPF);
            comandoSQL.setString(3,email);
            comandoSQL.setString(4,login);
            comandoSQL.setString(5,senha);
            comandoSQL.setInt(6,Idade);
            comandoSQL.execute();
            comandoSQL.close();
        }catch(SQLException u){
            throw new RuntimeException(u);
        }
  
       
        }  

                public void CadastroG (String nome,String CPF, String email,String login,String senha, int Idade){
            conexao=(Connection)new dbConnect(). getConnection();    
        PreparedStatement comandoSQL=null;        
        
        try{
            comandoSQL=conexao.prepareStatement(" INSERT INTO tbl_Pessoa (nome,cpf,dataNascimento,idPessoa)VALUES(?,?,?,?,?,?)");
            comandoSQL.setString(1,nome);
            comandoSQL.setString(2,CPF);
            comandoSQL.setString(3,email);
            comandoSQL.setString(4,login);
            comandoSQL.setString(5,senha);
            comandoSQL.setInt(6,Idade);
            comandoSQL.execute();
            comandoSQL.close();
        }catch(SQLException u){
            throw new RuntimeException(u);
        }
  
       
        }

 }

