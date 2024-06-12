package Control;

import java.util.Scanner;

public class ValidarCPF {

    private static boolean validarCPF(String CPF) {
        boolean validador = false;

        // Armazena resultado do passo 03
        int validaçaoSomaPrimeiroDigitoVerificador = 0;

        // Armazena resultado do passo 04
        int resultadoPrimeiroDigitoVerificador = 0;

        // Armazena resultado do passo 05
        int validaçaoSomaSegundoDigitoVerificador = 0;

        // Armazena resultado do passo 06
        int resultadoSegundoDigitoVerificador = 0;

        Scanner ler = new Scanner(System.in);
        int[] digitosCPF = new int[11];

        // int[] numerosDecrescentes = new int[9];

        // Passo 01: Ler CPF
        System.out.print("Digite seu CPF: ");
        CPF = ler.nextLine();

        // Passo 02: Preencher os dígitos do CPF no vetor digitosCPF
        for (int i = 0; i < 11; i++) {
            digitosCPF[i] = CPF.charAt(i) - 48;

            // Verifica se o CPF está sendo preenchido corretamente
            // System.out.print(digitosCPF[i] + " ");
        }

        /*
         * Passo 03:
         * Multiplica-se os 9 primeiros dígitos
         * pela sequência decrescente de números de 10 à 2
         * e soma os resultados;
         */

        /*
         * Fazer o looping usando o "j",
         * não requer o vetor numerosDecrescentes
         * comentado anteriormente
         */
        for (int i = 0, j = 10; i < 9 && j >= 2; i++, j--) {
            validaçaoSomaPrimeiroDigitoVerificador += digitosCPF[i] * j;
        }

        /*
         * Verifica se o resultado dessa soma está correto
         * System.out.println(somaValidaçaoPrimeiroDigito);
         * 
         * Usando o cpf fictício "529.982.247-25"
         * [resultado esperado: 295]
         */

        // Passo 04: Multiplicarm resultado por 10 e pegar o resto da divisão por 11
        resultadoPrimeiroDigitoVerificador = validaçaoSomaPrimeiroDigitoVerificador * 10 % 11;
        if (resultadoPrimeiroDigitoVerificador == 10) {
            resultadoPrimeiroDigitoVerificador = 0;
        }

        /*
         * Verificar se o calculo está correto:
         * System.out.println(resultadoPrimeiroDigitoVerificador);
         * 
         * Usando o cpf fictício "529.982.247-25"
         * [resultado esperado: 2]
         */

        // Se esse resultado for diferente do esperado, já encerra a segunda etapa da
        // verificação
        if (resultadoPrimeiroDigitoVerificador != digitosCPF[9]) {
            System.out.println("CPF inválido!");
            validador = false;
        } else {
            /*
             * Passo 05: Repitir passo 03,
             * agregar primeiro dígito verificador
             * sequência decrescente de 11 a 2
             */

            for (int i = 0, j = 11; i < 11 && j >= 2; i++, j--) {
                validaçaoSomaSegundoDigitoVerificador += digitosCPF[i] * j;
            }

            /*
             * Verificar se o calculo está correto:
             * System.out.println(validaçaoSomaSegundoDigitoVerificador);
             * 
             * Usando o cpf fictício "529.982.247-25"
             * [resultado esperado: 347]
             */

            // Passo 06: Repetir passo 4
            resultadoSegundoDigitoVerificador = validaçaoSomaSegundoDigitoVerificador * 10 % 11;
            if (resultadoSegundoDigitoVerificador == 10) {
                resultadoSegundoDigitoVerificador = 0;
            }

            /*
             * Verificar se o calculo está correto:
             * System.out.println(resultadoSegundoDigitoVerificador);
             * 
             * Usando o cpf fictício "529.982.247-25"
             * [resultado esperado: 5]
             */

            if (resultadoSegundoDigitoVerificador == digitosCPF[10]) {
                System.out.println("CPF válido");
                validador = true;
            } else {
                System.out.println("CPF inválido");
            }
        }
        return validador;
    }

    public boolean getValidarCPF(String CPF) {
        return validarCPF(CPF);
    } 

}