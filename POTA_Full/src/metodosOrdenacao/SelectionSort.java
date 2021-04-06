package metodosOrdenacao;

public class SelectionSort {

    public static void selectionsort(int[] vetor) {
        int minimo = 0, temp = 0;
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
