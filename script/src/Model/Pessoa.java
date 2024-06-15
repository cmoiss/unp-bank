package Model;
<<<<<<< HEAD

import Control.GerarID;
import Control.Idade;
import Control.ValidarCPF;
import Control.TipoPessoa;
=======
<<<<<<< HEAD
import java.util.Date;
=======
import Control.Idade;
import Control.ValidarCPF;
>>>>>>> CRUD

>>>>>>> origin/working-on-code
import java.util.Date;

/* Classe Pai de Cliente e Gerente*/
public class Pessoa {
<<<<<<< HEAD

    protected String id = null;
    private String nome = null;
    private String CPF = null;
    private String email = null;
    private String login = null;
    private String senha = null;
    Idade idade = new Idade();

    public Pessoa(TipoPessoa tipoPessoa, String nome, String CPF, Date dataNascimento, String email, String login, String senha) {
        GerarID gerarID = new GerarID();
        this.id = gerarID.getGerarID(); 
=======
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
>>>>>>> origin/working-on-code
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

<<<<<<< HEAD
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    protected void verificarDados(String CPF) {
        ValidarCPF validador = new ValidarCPF();
        validador.getValidarCPF(CPF);
=======
    public void verificarDados(String CPF){
    ValidarCPF validador = new ValidarCPF();
    validador.getValidarCPF(CPF);
>>>>>>> origin/working-on-code
    }
}
