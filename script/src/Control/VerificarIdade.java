import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class VerificarIdade {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite sua data de nascimento (DIA,MES,ANO): ");
        String dataNascimentoString = entrada.nextLine();

        // Analisa a string de data de entrada em um objeto LocalDate
        String[] partesData = dataNascimentoString.split(",");
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
        entrada.close();
    }
}