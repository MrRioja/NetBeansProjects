package execsaula9_vetor;

import java.util.Scanner;
public class Juncao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a[] = new double[4];
        double b[] = new double[7];
        double juncao[] = new double[11];
        
        int i;
        
        System.out.println("==> Dados do vetor A: ");
        for(i = 0; i < a.length; i++){
            a[i] = entrada.nextDouble();
            //copia elementos das posicoes de 0 a 3 do vetor a nas 
            //mesmas posições do vetor juncao
            juncao[i] = a[i];
        }
        
        System.out.println("==> Dados do vetor B: ");
        for(i = 0; i < b.length; i++){
            b[i] = entrada.nextDouble();
            //copia elementos das posicoes de 0 a 6 do vetor b nas 
            //posições de 4 a 10 do vetor juncao
            //enquanto o indice do vetor b vai de 0 a 6, o indice do vetor 
            //juncao vai de i + 4 - 0 + 4, 1 + 4 até 6 + 4
            juncao[i + 4] = b[i];
        }
        //outra forma de resolver seria usar o indice i iniciando em 0 e um indice j iniciando em 4
        
        System.out.println("==> Dados do vetor juncao: ");
        for(i = 0; i < juncao.length; i++){
            System.out.println(juncao[i]);
        }                
    }
}
