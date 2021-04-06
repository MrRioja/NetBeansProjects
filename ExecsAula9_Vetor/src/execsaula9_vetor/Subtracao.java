/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execsaula9_vetor;

import java.util.Scanner;

/**
 *
 * @author siabr
 */
public class Subtracao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a[] = new int[8];
        int b[] = new int[8];
        int c[] = new int[8];
        
        int i;
        
        System.out.println("==> Dados do vetor A: ");
        for(i = 0; i < a.length; i++){
            a[i] = entrada.nextInt();
        }
        
        System.out.println("==> Dados do vetor B: ");
        for(i = 0; i < b.length; i++){
            b[i] = entrada.nextInt();
        }
        
        //geração e impressão do vetor C
        System.out.println("==> Dados do vetor C: ");
        for(i = 0; i < b.length; i++){
            c[i] = a[i] - b[i];
            System.out.println(c[i]);
        }        
    }
}
