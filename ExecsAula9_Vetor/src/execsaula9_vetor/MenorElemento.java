package execsaula9_vetor;

import java.util.Random;
import java.util.Scanner;

public class MenorElemento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int [1000];
        int i, menor;
        Random random = new Random();
        
        //gera o vetor numeros com 1000 elementos aleatorios
        for(i = 0; i < numeros.length; i++){
            numeros[i] = random.nextInt(500);//gera números entre 0 e 499
        }
        //inicializa o menor com o 1o elemento do vetor numeros
        menor = numeros[0];
        
        //encontra o menor elemento do vetor
        for(i = 0; i < numeros.length; i++){
            if(numeros[i] < menor){
                menor = numeros[i];
            }
        }
        
        System.out.println("==> números sorteados: ");
        for(i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
        
        //Mostra o menor número encontrado no vetor
        System.out.println("\n\n====> menor elemento: " + menor);        
    }
}
