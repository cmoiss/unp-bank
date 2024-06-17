
package Model;

import Control.DAO.CRUD_DAO;
import Control.TipoPessoa;
import java.util.Date;

public class Cliente extends Pessoa{
    private String idCliente = null;
    private boolean statusConta;
    CRUD_DAO funcao = new CRUD_DAO();
    public Cliente(boolean statusConta, TipoPessoa tipoPessoa, String nome, String CPF, Date dataNascimento, String email, String login, String senha, String genero) {
        super(tipoPessoa, nome, CPF, dataNascimento, email, login, senha, genero);
        this.statusConta = statusConta;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public boolean isStatusConta() {
        return statusConta;
    }

    public void setStatusConta(boolean statusConta) {
        this.statusConta = statusConta;
    }
    
    public void efetuarDeposito(){
    /* Cliente faz deposito*/
    }

    public void solicitarSaque(){
       //*cliente solicita saque*/
    }
    
    public void checarDadosConta(){
    /* cliente verifica os dados da sua conta bancaria*/
    }
}
