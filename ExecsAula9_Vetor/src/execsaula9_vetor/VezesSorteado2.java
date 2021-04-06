package execsaula9_vetor;

import java.util.Random;
import java.util.Scanner;

public class VezesSorteado2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[10000];
        //contador para cada numero entre 1 e 10      
        int i, c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0, c6 = 0, c7 = 0, c8 = 0, c9 = 0, c10 = 0 ;
        Random random = new Random();
        
        for(i = 0; i < numeros.length; i++){
            //gera números entre 1 e 10
            numeros[i] = random.nextInt(10) + 1;
            System.out.println(numeros[i]);
        }
        System.out.println("");
        for(i = 0; i < numeros.length; i++){
            switch(numeros[i]){
                case 1:
                    c1++;
                    break;
                case 2:
                    c2++;
                    break;
                case 3:
                    c3++;
                    break;
                case 4:
                    c4++;
                    break;
                case 5:
                    c5++;
                    break;
                case 6:
                    c6++;
                    break;
                case 7:
                    c7++;
                    break;
                case 8:
                    c8++;
                    break;
                case 9:
                    c9++;
                    break;
                case 10:
                    c10++;
                    break;
            } 
        }
        //mostra o total de vezes que cada numero entre 1 e 10 foi sorteado!
        System.out.println("O numero " + 1 +" apareceu " + c1 + " vezes.");
        System.out.println("O numero " + 2 +" apareceu " + c2 + " vezes.");
        System.out.println("O numero " + 3 +" apareceu " + c3 + " vezes.");
        System.out.println("O numero " + 4 +" apareceu " + c4 + " vezes.");
        System.out.println("O numero " + 5 +" apareceu " + c5 + " vezes.");
        System.out.println("O numero " + 6 +" apareceu " + c6 + " vezes.");
        System.out.println("O numero " + 7 +" apareceu " + c7 + " vezes.");
        System.out.println("O numero " + 8 +" apareceu " + c8 + " vezes.");
        System.out.println("O numero " + 9 +" apareceu " + c9 + " vezes.");
        System.out.println("O numero " + 10 +" apareceu " + c10 + " vezes.");
        
    }
}
