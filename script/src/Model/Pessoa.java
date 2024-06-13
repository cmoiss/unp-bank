package Model;

import java.util.Date;
import Control.Idade;
import Control.ValidarCPF;

import java.util.Date;

import Control.Idade;
import Control.ValidarCPF;
import java.util.Date;
import java.util.Random;

/* Classe Pai de Cliente e Gerente*/
public class Pessoa {

    protected String id = null;
    private String nome = null;
    private String CPF = null;
    private String email = null;
    private String login = null;
    private String senha = null;
    Idade idade = new Idade();

    public Pessoa(String tipoPessoa, String nome, String CPF, Date dataNascimento, String email, String login, String senha) {
        this.id = gerarID(tipoPessoa);

    private String nome;
    private String CPF = null;
    private String email;
    private String login;
    private String senha;

    Idade idade = new Idade();

    public Pessoa(String nome, String CPF, Date dataNascimento, String email, String login, String senha) {

        this.nome = nome;
        this.CPF = CPF;
        this.idade.setDataNascimento(dataNascimento);
        this.email = email;
        this.login = login;
        this.senha = senha;
    }

    private String gerarID(String tipoPessoa) {
        //Gera ID de Cliente
        String sigla = null;
        String idCliente;
        String numeroAleatorioString;
        int auxiliar;
        Random geradorID = new Random(); //Importa classe Random

        auxiliar = geradorID.nextInt(999999) + 1;
        numeroAleatorioString = "" + auxiliar;

        if (auxiliar < 100000) { //Se o número gerado tiver menos de 6 dígitos
            //Armazena a quantidade de dígitos gerados
            int digitosZeroRestantes = 6 - numeroAleatorioString.length();

            for (int i = 0; i < digitosZeroRestantes; i++) {
                numeroAleatorioString = "0" + numeroAleatorioString;
            }
        }

        if (tipoPessoa.equals("Cliente")) {
            sigla = "CLI";
        } else if (tipoPessoa.equals("Gerente")) {
            sigla = "GER";
        }

        idCliente = sigla + numeroAleatorioString;

        return idCliente;
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

    protected void verificarDados(String CPF) {
        ValidarCPF validador = new ValidarCPF();
        validador.getValidarCPF(CPF);
    }
}
