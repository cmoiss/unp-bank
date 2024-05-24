
package Model;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/* Classe Pai de Cliente e Gerente*/
public class Pessoa {
    private String nome;
    private String CPF;
    private Date dataNascimento;
    private int idade;
    private String email;

    public Pessoa(String nome, String CPF, Date dataNascimento, String email) {
        this.nome = nome;
        this.CPF = CPF;
        this.dataNascimento = dataNascimento;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void verificarDados(){
    /*Método para verificar idade e cpf*/
    }
}
