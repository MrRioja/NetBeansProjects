package metodosOrdenacao;

public class BubbleSort {

    public static void bubblesort(int[] vetor) {
        int n = vetor.length;
        do {
            for (int i = 1; i < vetor.length; i++) {
                if (vetor[i - 1] > vetor[i]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[i - 1];
                    vetor[i - 1] = temp;
                }
            }
            n--;
        } while (n != 0);
    }

    public static void bubblesort2(int[] vetor) {
        int n = vetor.length;
        do {
            int newn = 0;
            for (int i = 1; i < n; i++) {
                if (vetor[i - 1] > vetor[i]) {
                    int temp = vetor[i];
                    vetor[i] = vetor[i - 1];
                    vetor[i - 1] = temp;
                    newn = i;
                }
            }
            n = newn;
        } while (n != 0);
    }

    public static void testebubble(int[] vetor) {
        boolean trocado;
        do {
        trocado = false;
            for (int i = 0; i < vetor.length-1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    int temp = vetor[i + 1];
                    vetor[i + 1] = vetor[i];
                    vetor[i] = temp;
                    trocado = true;
                }
            }
        } while (trocado);
    }
}
