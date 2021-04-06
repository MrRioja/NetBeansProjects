/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execsaula9_vetor;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author siabr
 */
public class VezesSorteado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[10000];
        
        //vetor para contar o total de 1s, de 2s até 10s
        //na posição 0 conta o total de 1s
        //na posição 1 conta o total de 2s
        //....
        //na posição 9 conta o total de 10s
        int cont[] = new int[10];
        int i, indiceCont = 0;
        Random random = new Random();
        
        for(i = 0; i < numeros.length; i++){
            //gera números entre 1 e 10
            numeros[i] = random.nextInt(10) + 1;
            System.out.println(numeros[i]);
        }
        System.out.println("");
        for(i = 0; i < numeros.length; i++){
            //se o dado for 4, então indiceCont será 3
            indiceCont = numeros[i] - 1;
            //conta mais 1 na posição 3 - que gera o total de 4s
            cont[ indiceCont ] ++; 
        }
        //mostra o total de vezes que cada numero entre 1 e 10 foi sorteado!
        for(i = 0; i < cont.length; i++){
            System.out.println("O numero " + (i+1) +" apareceu " + cont[i] + " vezes.");
        }
        
    }
}
