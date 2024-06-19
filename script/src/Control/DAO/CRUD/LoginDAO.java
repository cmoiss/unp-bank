package Control.DAO.CRUD;

import Control.DAO.dbConnect;
import Control.TipoPessoa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
public class LoginDAO {
    private Connection conexao;
    private TipoPessoa tipoPessoa = null;

    public LoginDAO(TipoPessoa tipoPessoa) {      
        this.tipoPessoa = tipoPessoa;
    }

    
    
        public boolean LoginCheck (String Login,String Senha){
        conexao=(Connection)new dbConnect(). getConnection();
        
        boolean Check = false;
        PreparedStatement comandoSQL=null;
        ResultSet result=null;
        
         if (tipoPessoa.equals(TipoPessoa.CLIENTE)){
        try{
            comandoSQL=conexao.prepareStatement("SELECT*FROM tbl_cliente WHERE Login=? and Senha=?");
            comandoSQL.setString(1,Login);
            comandoSQL.setString(2,Senha);
            result=comandoSQL.executeQuery();
                if(result.next()){
                    Check=true;
                }
        }catch(SQLException u){
            throw new RuntimeException(u);
        }
        return Check;
         }
         
        else if (tipoPessoa.equals(TipoPessoa.GERENTE)){
        try{
            comandoSQL=conexao.prepareStatement("SELECT*FROM tbl_Gerente WHERE Login=? and Senha=?");
            comandoSQL.setString(1,Login);
            comandoSQL.setString(2,Senha);
            result=comandoSQL.executeQuery();
                if(result.next()){
                    Check=true;
                }
        }catch(SQLException u){
            throw new RuntimeException(u);
        }
        return Check;
         }
        return false;
        
       
                    
 }
}

