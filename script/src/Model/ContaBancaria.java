
package Model;


public class ContaBancaria {
private String idConta;
private int saldoAtual;

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
    
    public void  verificarSaldo() {
    /* Verifica se existe saldo disponivel */
    }
    
    public void  verificarSaque() {
    /* Verifica se o saque pode ocorrer*/
    }
    
    public void verificarDeposito() {
    /* Checa se valor depositado pode ser depositado e soma ao saldo atual */
    }
    
   /* O metodo de transferir dinheiro deve ser discutido
    public void tranferirDinheiro() {} */

}
