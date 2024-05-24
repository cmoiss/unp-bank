package Control;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Idade {
    private Date dataNascimento;
    private int idade;

    public static void main(String[] args) {
        //Instância de um objeto da classe Idade
        Idade idade;
        idade.formatarDataNascimento(lerNascimentoString());

        // Calcula a idade atual
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(dataNascimento, dataAtual);
        int idadeEmAnos = periodo.getYears();

        // Exibe a idade
        System.out.println("\nSua idade em anos é: " + idadeEmAnos);

        // Verifica se a pessoa é maior de idade
        boolean maiorDeIdade = idadeEmAnos >= 18;
        if (maiorDeIdade) {
            System.out.println("Você é maior de idade!");
        } else {
            System.out.println("Você é menor de idade.");
        }

        // Verifica se a pessoa tem 120 anos ou mais
        boolean idadeExtrema = idadeEmAnos >= 120;
        if (idadeExtrema) {
            System.out.println("Sua idade é considerada extrema (120 anos ou mais).");
        }
    }

    private static String lerNascimentoString() {
        //Lê e armazena data de nascimento
        String dataNascimentoString;
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite sua data de nascimento (dd/mm/aaaa): ");
        dataNascimentoString = ler.nextLine();
        ler.close();

        return dataNascimentoString;
    }

    private void formatarDataNascimento(String dataNascimento) throws ParseException {
        //Converte para Date alguma data (em String) informada pelo usuário
        SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy");
        this.dataNascimento = formatarData.parse(dataNascimento);
    }

    private void calcularIdade() {
        //Armazena as partes da data de nascimento para viabilizar o cálculo da idade
        int diaAtual, mesAtual, anoAtual;
        int diaNascimento, mesNascimento, anoNascimento;

        //Pega data atual do sistema
        Date hoje = new Date();

        Calendar calendario = Calendar.getInstance();

        //Passa data de hoje no calendário
        calendario.setTime(hoje);
        diaAtual = calendario.get(Calendar.DAY_OF_MONTH);
        mesAtual = calendario.get(Calendar.MONTH) + 1;
        anoAtual = calendario.get(Calendar.YEAR);        

        calendario.setTime(this.dataNascimento);
        diaNascimento = calendario.get(Calendar.DAY_OF_MONTH);
        mesNascimento = calendario.get(Calendar.MONTH) + 1;
        anoNascimento = calendario.get(Calendar.YEAR);

        //Calcula idade
        this.idade = anoNascimento - anoAtual;
        if (mesAtual < mesNascimento) {
            this.idade--;
        } else if (mesAtual < mesNascimento && diaAtual < diaNascimento) {
            this.idade--;
        }

        //Tratamento para evitar resultados negativos, pois não existe idade negativa
        if (this.idade < 0) {
            this.idade = 0;
        }
    }
}