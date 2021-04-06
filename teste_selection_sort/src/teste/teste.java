package teste;

import java.util.Arrays;

public class teste {

    public static void main(String[] args) {

        int[] vetor = {48, 39, 23, 2, 7, 18, 46, 45, 4, 8, 39};
        selection(vetor);
        System.out.println(Arrays.toString(vetor));
    }

    public static void selection(int[] vetor) {
        int temp = 0, minimo = 0;

        for (int i = 0; i < vetor.length; i++) {
            minimo = i;

            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[minimo]) {
                    minimo = j;
                }
            }
            temp = vetor[i];
            vetor[i] = vetor[minimo];
            vetor[minimo] = temp;
        }
    }
}
