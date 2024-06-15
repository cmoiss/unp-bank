
package Model;

import Control.DAO.CRUD_DAO;


public class ContaBancaria {
private String idConta;
private int saldoAtual;
CRUD_DAO funcao = new CRUD_DAO();

    public ContaBancaria(String idConta, int saldoAtual) {
        this.idConta = idConta;
        this.saldoAtual = saldoAtual;
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
    
     public double verificarSaldo() {
         double aux;
         aux=funcao.verificarSaldo(idConta);
         return aux;
    }
    
    public double getverificarSaldo() {
        return verificarSaldo();
    }
    
    public void  verificarSaque() {
   
    }
    
    public void verificarDeposito() {
    /* Checa se valor depositado pode ser depositado e soma ao saldo atual */
    }
    
   /* O metodo de transferir dinheiro deve ser discutido
    public void tranferirDinheiro() {} */

}
