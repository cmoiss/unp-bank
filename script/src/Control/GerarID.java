/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import java.util.Random;

/**
 *
 * @author Caio
 */
public class GerarID {
    private String gerarID() {
        //Gera ID
        String id = null;
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

        id = numeroAleatorioString;

        return id;
    }
    
    public String getGerarID() {
        String idGerado = gerarID();
        return idGerado;
    }
}
