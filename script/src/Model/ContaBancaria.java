
package Model;

import Control.DAO.CRUD_DAO;
import Control.DAO.Conta.VerificarSaldo;


public class ContaBancaria {
private String idConta;
private int saldoAtual;
VerificarSaldo saldo = new VerificarSaldo();
CRUD_DAO funcao = new CRUD_DAO();

    public ContaBancaria(String idConta, double saldoAtual) {
        this.idConta = idConta;
        this.saldoAtual = (int) saldoAtual;
    }

    public String getIdConta() {
        return idConta;
    }

    public void setIdConta(String idConta) {
        this.idConta = idConta;
    }

    public int getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(int saldoAtual) {
        this.saldoAtual = saldoAtual;
    }
    
     public double verificarSaldo(String idConta) {
         return saldo.getVerificarSaldo(idConta);
    }
     
    
    public double getVerificarSaldo(String idConta) {
        return verificarSaldo(idConta);
    }
    

    
    public double verificarDeposito() {
    funcao.efetuarDeposito(idConta, saldoAtual);
    return 0;
    }
    public double getDeposito(){
    return verificarDeposito();
    }
    
   /* O metodo de transferir dinheiro deve ser discutido
    public void tranferirDinheiro() {} */

}
