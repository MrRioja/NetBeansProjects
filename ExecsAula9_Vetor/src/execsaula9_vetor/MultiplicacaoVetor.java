package execsaula9_vetor;

import java.util.Scanner;

/**
 *
 * @author siabr
 */
public class MultiplicacaoVetor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int a[] = new int[8];
        int b[] = new int[8];
        int i;
        
        System.out.println("Digite 8 numeros: ");
        for(i = 0; i < a.length; i++){
            a[i] = entrada.nextInt();
        }
        
        //gera o vetor b com os elementos de a multiplicados por 3
        for(i = 0; i < b.length; i++){
            b[i] = a[i] * 3;
            System.out.print(b[i] + " ");
        }        
    }
    
}
