package View;

import javax.swing.JOptionPane;

public class DialogMessages {

    public void mensagemSaldoInsuficiente(String tipoOperação) {
        JOptionPane.showMessageDialog(null, "Não há saldo disponível na conta para efetuar " + tipoOperação + "!", "Saldo insuficiente", JOptionPane.ERROR_MESSAGE);
    }

    public void mensagemValorVazio() {
        JOptionPane.showMessageDialog(null, "O valor digitado não é válido! Por favor, digite novamente", "Valor nulo ou vazio", JOptionPane.ERROR_MESSAGE);
    }

    public void mensagemExitoOperaçao(String mensagem, String titulo) {
        JOptionPane.showMessageDialog(null, mensagem, titulo, JOptionPane.INFORMATION_MESSAGE);
    }

    public void mensagemContaInexistente() {
        JOptionPane.showMessageDialog(null, "Essa conta não existe.", "Conta inexistente", JOptionPane.WARNING_MESSAGE);
    }

    public void mensagemClienteNaoSelecionado() {
        JOptionPane.showMessageDialog(null, "Por favor, selecione algum cliente", "Nenhum cliente selecionado!", JOptionPane.WARNING_MESSAGE);
    }
}
