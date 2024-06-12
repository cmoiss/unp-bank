package Control;

import java.util.HashMap;
import java.util.Map;

public class ClienteManager {
    private Map<String, Clientexxx> clientes = new HashMap<>();

    public boolean adicionarCliente(Clientexxx cliente) {
        if (clientes.isValido() && !clientes.containsKey(cliente.getIdCliente())) {
            clientes.put(cliente.getIdCliente(), cliente);
            return true;
        }
        return false;
    }

    public Clientexxx buscarClientePorId(String idCliente) {
        return clientes.get(idCliente);
    }

    public boolean excluirCliente(String idCliente) {
        return clientes.remove(idCliente) != null;
    }
}
