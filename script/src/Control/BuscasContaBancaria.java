package Control;

import Control.DAO.CRUD.PegarCliente;
import Control.DAO.Conta.BuscarContaDAO;
import Model.ContaBancaria;

public class BuscasContaBancaria {

    ContaBancaria contaBancaria = new ContaBancaria(null, 0);

    public BuscasContaBancaria() {
    }

    public BuscasContaBancaria(ContaBancaria contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    public double buscarSaldoBD(String cpf) {
        double saldoAtual;
        String id = buscarIDContaCliente(cpf);

        PegarCliente cliente = new PegarCliente();

        saldoAtual = contaBancaria.getVerificarSaldo(id);
        contaBancaria.setSaldoAtual(saldoAtual);

        return saldoAtual;
    }

    public String buscarIDContaCliente(String cpf) {
        BuscarContaDAO buscaID = new BuscarContaDAO();

        contaBancaria.setIdConta(buscaID.getBuscarIdConta(cpf));

        return contaBancaria.getIdConta();
    }

    public String buscarNomeCliente(String cpf) {
        return new PegarCliente().getPegarNomeClienteUnico(cpf);
    }

    public boolean checkContaExiste(String idConta) {
        return new BuscarContaDAO().getCheckExistenciaContaPorID(idConta);
    }

    public boolean checkContaAtiva(String idConta) {
        return new BuscarContaDAO().checkIfAccountIsActive(idConta);
    }
}
