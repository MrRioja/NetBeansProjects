package metodosOrdenacao;

public class InsertionSort {
     
    public static void insertionsort(int[] lista) {
        for (int i = 1; i < lista.length; i++) {
            for (int j = 0; j < i; j++) {
                if (lista[i] < lista[j]) {
                    int aux = lista[i];
                    lista[i] = lista[j];
                    lista[j] = aux;
                }
            }
        }
    }
    
    public static void insertionsort2(int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            int j = i;
            while (j > 0 && vetor[j - 1] > vetor[j]) {
                int temp = vetor[j];
                vetor[j] = vetor[j - 1];
                vetor[j - 1] = temp;
                j = j - 1;
            }
        }
    }
}
