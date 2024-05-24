import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

public class Idade {
    private Date dataNascimento;

    public static void main(String[] args) {
        Idade idade;
        idade.formatarDataNascimento(lerNascimentoString());

        // Analisa a string de data de entrada em um objeto LocalDate
        String[] partesData = dataNascimento.split(",");
        int dia = Integer.parseInt(partesData[0]);
        int mes = Integer.parseInt(partesData[1]);
        int ano = Integer.parseInt(partesData[2]);
        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);

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

    private void formatarDataNascimento(String dataNascimento) {
        //Converte para Date alguma data (em String) informada pelo usuário
        SimpleDateFormat formatarData = new SimpleDateFormat("dd/MM/yyyy");
        this.dataNascimento = formatarData.parse(dataNascimento);
    }
}