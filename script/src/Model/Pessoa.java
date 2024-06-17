package Model;

import Control.GerarID;
import Control.Idade;
import Control.CPF;
import Control.TipoPessoa;
import java.util.Date;

/* Classe Pai de Cliente e Gerente*/
public class Pessoa {

    protected String id = null;
    private String nome = null;
    private String CPF = null;
    private String email = null;
    private String login = null;
    private String senha = null;
    private String genero = null;
    Idade idade = new Idade();

    public Pessoa(TipoPessoa tipoPessoa, String nome, String CPF, Date dataNascimento, String email, String login, String senha, String genero) {
        GerarID gerarID = new GerarID();
        this.id = gerarID.getGerarID();
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    protected void verificarDados(String CPF) {
        CPF validador = new CPF();
        validador.getValidarCPF(CPF);
    }
}
