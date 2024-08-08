package Control.DAO.CRUD;

import Control.DAO.dbConnect;
import Control.Idade;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

public class PegarCliente {

    private Connection conexao;

    private ArrayList<Object> pegarClientes() {
        conexao = (Connection) new dbConnect().getConnection();
        Idade idade;

        PreparedStatement comandoSQL;
        ResultSet resultado;

        ArrayList<Object> tbl_Cliente = new ArrayList<>();

        try {
            comandoSQL = conexao.prepareStatement("""
                                                  SELECT 
                                                  p.nome, p.cpf, p.dataNascimento, c.idCliente, c.idConta, c.statusCliente, cb.saldoAtual
                                                  FROM tbl_Pessoa AS p
                                                  INNER JOIN tbl_Cliente AS c ON p.cpf = c.cpf
                                                  INNER JOIN tbl_ContaBancaria AS cb ON c.idConta = cb.idConta;
                                                  """);

            resultado = comandoSQL.executeQuery();

            while (resultado.next()) {
                Object[] cliente = new Object[7];
                idade = new Idade();

                cliente[0] = resultado.getString(1);
                cliente[1] = resultado.getString(2);

                try {
                    // Formata idade do DB (aaaa-mm-dd) para Java
                    idade.getFormatarDataNascimento(idade.getConvertFromDataDatabaseToJavaString("" + resultado.getDate(3)));

                    //Calcula idade
                    cliente[2] = idade.getCalcularIdade();
                } catch (ParseException u) {
                    System.out.println("Erro ao buscar idade do cliente.");
                }

                cliente[3] = resultado.getInt(4);
                cliente[4] = resultado.getInt(5);
                cliente[5] = resultado.getBoolean(6);
                cliente[6] = resultado.getDouble(7);
                tbl_Cliente.add(cliente);
            }

            comandoSQL.close();
            conexao.close();

            return tbl_Cliente;
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    private ArrayList<Object> pegarClienteUnico(String cpf) {
        PreparedStatement comandoSQL;
        ResultSet resultado;

        ArrayList<Object> tbl_Cliente = new ArrayList<>();

        try {
            conexao = (Connection) new dbConnect().getConnection();
            comandoSQL = conexao.prepareStatement("""
                                      SELECT 
                                      tbl_pessoa.nome, tbl_pessoa.cpf, tbl_pessoa.idade, tbl_cliente.idCliente, tbl_cliente.idConta, tbl_cliente.statusCliente, tbl_ContaBancaria.saldoAtual
                                      FROM tbl_Pessoa
                                      INNER JOIN tbl_Cliente ON tbl_Pessoa.cpf = tbl_Cliente.cpf
                                      INNER JOIN tbl_ContaBancaria ON tbl_Cliente.idConta = tbl_ContaBancaria.idConta
                                      WHERE tbl_Pessoa.cpf = ?;
                                      """);
            comandoSQL.setString(1, cpf);
            resultado = comandoSQL.executeQuery();

            while (resultado.next()) {
                Object[] cliente = new Object[7];
                cliente[0] = resultado.getString(1);
                cliente[1] = resultado.getString(2);
                cliente[2] = resultado.getInt(3);
                cliente[3] = resultado.getString(4);
                cliente[4] = resultado.getString(5);
                cliente[5] = resultado.getBoolean(6);
                cliente[6] = resultado.getDouble(7);
                tbl_Cliente.add(cliente);
            }

            return tbl_Cliente;
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    private String pegarCPFCliente(String login, String senha) {
        String cpf = null;

        PreparedStatement comandoSQL;
        ResultSet resultado;

        try {
            conexao = (Connection) new dbConnect().getConnection();
            comandoSQL = conexao.prepareStatement("SELECT cpf FROM tbl_Cliente WHERE Login = ? and Senha = ?");
            comandoSQL.setString(1, login);
            comandoSQL.setString(2, senha);
            resultado = comandoSQL.executeQuery();
            resultado.next();
            cpf = resultado.getString(1);

            return cpf;
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    private String pegarIdCliente(String cpf) {
        String idCliente = null;

        PreparedStatement comandoSQL;
        ResultSet resultado;

        try {
            conexao = (Connection) new dbConnect().getConnection();
            comandoSQL = conexao.prepareStatement("SELECT idCliente FROM tbl_Cliente WHERE cpf = ?");
            comandoSQL.setString(1, cpf);
            resultado = comandoSQL.executeQuery();
            resultado.next();
            idCliente = resultado.getString(1);

            return idCliente;
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public ArrayList<Object> getPegarClientes() {
        return pegarClientes();
    }

    public ArrayList<Object> getPegarClienteUnico(String cpf) {
        return pegarClienteUnico(cpf);
    }

    private String pegarNomeClineteUnico(String cpf) {
        String nome;

        PreparedStatement comandoSQL;
        ResultSet resultado;

        try {
            conexao = (Connection) new dbConnect().getConnection();
            comandoSQL = conexao.prepareStatement("SELECT nome FROM tbl_Pessoa WHERE cpf = ?");
            comandoSQL.setString(1, cpf);
            resultado = comandoSQL.executeQuery();
            resultado.next();
            nome = resultado.getString(1);

            return nome;
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public String getPegarCPFCliente(String login, String senha) {
        return pegarCPFCliente(login, senha);
    }

    public String getPegarIdCliente(String cpf) {
        return pegarIdCliente(cpf);
    }

    public String getPegarNomeClienteUnico(String cpf) {
        return pegarNomeClineteUnico(cpf);
    }
}
