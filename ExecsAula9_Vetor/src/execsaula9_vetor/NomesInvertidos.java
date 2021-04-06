package execsaula9_vetor;

import java.util.Scanner;

public class NomesInvertidos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nomes[] = new String[5];
        int i;

        System.out.println("Digite 15 nomes: ");
        for (i = 0; i < nomes.length; i++) {
            nomes[i] = entrada.nextLine();
        }

        System.out.println("Nomes invertidos: ");
        //imprime da ultima para a 1a posição
        for (i = nomes.length - 1; i >= 0; i--) {
            System.out.println(nomes[i]);
        }
    }
}
