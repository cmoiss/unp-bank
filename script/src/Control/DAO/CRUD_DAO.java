package Control.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CRUD_DAO {
    private Connection conexao;
        public void conexao(){
         conexao=(Connection)new dbConnect().getConnection();
        }
    public void verificarTblContas(){
     PreparedStatement comandoSQL;
       try{
            conexao = (Connection) new dbConnect().getConnection();
            comandoSQL=conexao.prepareStatement("SELECT*FROM tbl_ContaBancaria");
            System.out.println("feito");
            comandoSQL.execute();
            comandoSQL.close();
        }catch(SQLException u){
            throw new RuntimeException(u);
        }
    }
    public void checkDadosTblContas(String idConta){
         PreparedStatement comandoSQL;
       try{
            conexao = (Connection) new dbConnect().getConnection();
            comandoSQL=conexao.prepareStatement("SELECT*FROM tbl_ContaBancaria WHERE idConta=?");
            comandoSQL.setString(1, idConta);
            System.out.println("feito");
            comandoSQL.execute();
            comandoSQL.close();
        }catch(SQLException u){
            throw new RuntimeException(u);
        }
     }
    public void verifcarTblCliente() throws SQLException{
         PreparedStatement comandoSQL;
       try{
            conexao=(Connection)new dbConnect().getConnection();
            comandoSQL=conexao.prepareStatement("SELECT*FROM tbl_Cliente");
            System.out.println("feito");
            comandoSQL.execute();
            comandoSQL.close();
        }catch(SQLException u){
            throw new RuntimeException(u);
        }
    }
    public void excluiirTblCliente(String idCliente){
             PreparedStatement comandoSQL;
       try{
            conexao = (Connection) new dbConnect().getConnection();
            comandoSQL=conexao.prepareStatement("DELETE FROM tbl_Cliente WHERE idCliente=?");
            comandoSQL.setString(1, idCliente);
            System.out.println("feito");
            comandoSQL.execute();
            comandoSQL.close();
        }catch(SQLException u){
            throw new RuntimeException(u);
        }
    }
    public void pesquisarTblCliente(String CPF){
         PreparedStatement comandoSQL;
       try{
            conexao = (Connection) new dbConnect().getConnection();
            comandoSQL=conexao.prepareStatement("select*from tbl_Cliente where cpf=?;");
            comandoSQL.setString(1, CPF);
            System.out.println("feito");
            comandoSQL.execute();
            comandoSQL.close();
        }catch(SQLException u){
            throw new RuntimeException(u);
        }
    }
    }
