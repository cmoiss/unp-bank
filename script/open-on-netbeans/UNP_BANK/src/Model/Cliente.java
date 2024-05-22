
package Model;

import java.util.Date;

/* idConta comentado pois acredito que não ficara na classe cliente */
public class Cliente extends Pessoa{
    private String idCliente;
    //private String idConta;
    private boolean statusConta;

    public Cliente(String idCliente, /*String idConta,*/ boolean statusConta, String nome, String CPF, Date dataNascimento, String email) {
        super(nome, CPF, dataNascimento, email);
        this.idCliente = idCliente;
        //this.idConta = idConta;
        this.statusConta = statusConta;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

   /* public String getIdConta() {
        return idConta;
    }

    public void setIdConta(String idConta) {
        this.idConta = idConta;
    } */

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
