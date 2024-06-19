package Control.DAO.Conta;

public class TransferenciaBancaria {
    private void transferirDinheiro(String idContaRemetente, double valorTransferido, String idContaDestinatario) {
        //remove conta destinatario
        new EfetuarSaque().getSacar(idContaRemetente, valorTransferido);

        //adiciona a conta destino
        new EfetuarDeposito().getEfetuarDeposito(idContaDestinatario, valorTransferido);
    }

    public void getTransferirDinheiro(String idConta, double valorTransferido, String idContaDestinatario) {
        transferirDinheiro(idConta, valorTransferido, idContaDestinatario);
    }
}
