package Model;
<<<<<<< HEAD
import java.util.Date;
=======
import Control.Idade;
import Control.ValidarCPF;
>>>>>>> CRUD

import java.util.Date;



/* Classe Pai de Cliente e Gerente*/
public class Pessoa {
    private String nome;
    private String CPF=null;
    private String email;
<<<<<<< HEAD
    private String login;
    private String senha;
=======
    
    Idade idade = new Idade();
>>>>>>> CRUD


    public Pessoa(String nome, String CPF, Date dataNascimento, String email, String login, String senha) {
        this.nome = nome;
        this.CPF = CPF;
        this.idade.setDataNascimento(dataNascimento);
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
        return idade.getDataNascimento();
    }

    public void setDataNascimento(Date dataNascimento) {
        this.idade.setDataNascimento(dataNascimento);
    }

    public int getIdade() {
        return idade.getIdade();
    }

    public void setIdade(int idade) {
        this.idade.setIdade(idade);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void verificarDados(String CPF){
    ValidarCPF validador = new ValidarCPF();
    validador.getValidarCPF(CPF);
    }
}
