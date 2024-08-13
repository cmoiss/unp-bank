package Control;

import Model.ContaBancaria;
import View.DialogMessages;
import javax.swing.JOptionPane;

public class MovimentacoesBancarias {

    String cpf;
    javax.swing.JLabel labelSaldoAtual;
    ContaBancaria contaBancaria = new ContaBancaria(null, 0);
    DialogMessages mensagem = new DialogMessages();
    
    public MovimentacoesBancarias(String cpf, ContaBancaria contaBancaria, javax.swing.JLabel labelSaldoAtual) {
        this.cpf = cpf;
        this.contaBancaria = contaBancaria;
        this.labelSaldoAtual = labelSaldoAtual;
    }
    
    public void depositar() {
        String valorDepositoStr = JOptionPane.showInputDialog(null, "Digite o valor a ser depositado.", "Depósito", JOptionPane.INFORMATION_MESSAGE);
        double valorDepositoDouble;

        // Verifica se o input é um valor válido
        if (validarInputMovimentaçoes(valorDepositoStr)) {
            valorDepositoDouble = Double.parseDouble(valorDepositoStr);
            contaBancaria.getEfetuarDeposito(contaBancaria.getIdConta(), valorDepositoDouble);
            mensagem.mensagemExitoOperaçao("Depósito realizado com sucesso!", "Êxito no depósito");
            atualizarSaldo();
        }
    }

    public void sacar() {
        String valorSaqueStr = JOptionPane.showInputDialog(null, "Digite o valor a ser sacado.", "Saque", JOptionPane.INFORMATION_MESSAGE);
        double valorSolicitadoSaqueDouble;

        // Verifica se o input é um valor válido
        if (validarInputMovimentaçoes(valorSaqueStr)) {
            valorSolicitadoSaqueDouble = Double.parseDouble(valorSaqueStr);

            // Saldo insuficiente
            if (contaBancaria.getSaldoAtual() < valorSolicitadoSaqueDouble) {
                mensagem.mensagemSaldoInsuficiente("saque");
            } else {
                contaBancaria.getEfetuarSaque(contaBancaria.getIdConta(), valorSolicitadoSaqueDouble);
                mensagem.mensagemExitoOperaçao("Saque realizado com sucesso!", "Êxito no saque");
                atualizarSaldo();
            }
        }
    }

    public void transferir() {
        //solicitar valor
        String valorTransferirStr = JOptionPane.showInputDialog(null, "Digite o valor a ser transferido.", "Valor de Transferência", JOptionPane.INFORMATION_MESSAGE);
        double valorTransferirDouble;

        // Verifica se o input é válido
        if (validarInputMovimentaçoes(valorTransferirStr)) {
            valorTransferirDouble = Double.parseDouble(valorTransferirStr);

            //verificar valor existe na conta 
            if (contaBancaria.getSaldoAtual() < valorTransferirDouble) {
                mensagem.mensagemSaldoInsuficiente("transferência");
            } else {
                //solicitar idConta a receber transferencia
                String idContaDestinatario = JOptionPane.showInputDialog(null, "Digite id da conta a ser transferida", "Transferência", JOptionPane.INFORMATION_MESSAGE);

                //verifica se id digitado é vazio
                if (idContaDestinatario.isEmpty()) {
                    mensagem.mensagemValorVazio();
                } else {
                    //verifica se essa conta existe
                    if (!new BuscasContaBancaria(contaBancaria).checkContaExiste(idContaDestinatario)) {
                        JOptionPane.showMessageDialog(null, "Essa conta não existe.", "Conta inexistente", JOptionPane.WARNING_MESSAGE);
                    } else {
                        contaBancaria.getEfetuarTransferencia(contaBancaria.getIdConta(), valorTransferirDouble, idContaDestinatario);
                        mensagem.mensagemExitoOperaçao("Transferência realizada com sucesso!", "Êxito na transferência");
                        atualizarSaldo();
                    }
                }
            }
        }
    }

    private boolean validarInputMovimentaçoes(String inputString) {
        /* Método responsável por validar valores de entrada nas movimentações (depósito, saque, transferência)
        Essa validação ocorre em duas etapas:
        1ª Etapa - Verificar se input é vazio/nulo/zero
        2ª Etapa - Verificar se input é negativo        
        
        true - input válido
        false - input inválido
         */

        boolean validade = false;
        double inputDouble; //Converte o valor para double

        // 1ª Etapa
        if (inputString == null || inputString.isEmpty()) {
            // Input é nulo ou vazio
            mensagem.mensagemValorVazio();
        } else {
            inputDouble = Double.parseDouble(inputString); //Converte o valor para double
            if (inputDouble == 0) {
                // Input é igual a 0
                mensagem.mensagemValorVazio();
            } else {
                // O input possui valor

                // Verifica se o valor é negativo 
                if (inputDouble < 0) {
                    // Input é negativo
                    JOptionPane.showMessageDialog(null, "O valor digitado é negativo. Por favor, insira um valor válido", "Valor inválido", JOptionPane.ERROR_MESSAGE);
                } else {
                    // Input é positivo
                    validade = true;
                }
            }
        }
        return validade;
    }
    
    public void atualizarSaldo() {
        BuscasContaBancaria buscar = new BuscasContaBancaria(contaBancaria);
        labelSaldoAtual.setText("R$" + buscar.buscarSaldoBD(cpf));
    }
}
