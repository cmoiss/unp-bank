package Control;

import java.time.LocalDate;

public class Clientexxx {
    private String idCliente;
    private String nome;
    private String cpf;
    private LocalDate dataNascimento;
    private String email;

    public Clientexxx(String idCliente, String nome, String cpf, LocalDate dataNascimento, String email) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.email = email;
    }

    public String getIdCliente() {
        return idCliente;
    }
}
