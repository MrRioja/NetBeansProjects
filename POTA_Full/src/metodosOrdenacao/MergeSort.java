package metodosOrdenacao;

public class MergeSort {

    public static void mergesort(int[] vetor, int i, int f) {

        int q;

        if (i < f) {
            q = (i + f) / 2;
            mergesort(vetor, i, q);
            mergesort(vetor, q + 1, f);
            intercala(vetor, i, q, f);
        }
    }

    public static void intercala(int[] vetor, int in, int q, int f) {

        int i, j, k;
        int[] b = new int[vetor.length];

        for (i = in; i <= f; i++) {
            b[i] = vetor[i];
        }

        i = in;
        j = q + 1;

        for (k = in; k <= f; k++) {
            if (i > q) {
                vetor[k] = b[j++];
            } else if (j > f) {
                vetor[k] = b[i++];
            } else if (b[i] < b[j]) {
                vetor[k] = b[i++];
            } else {
                vetor[k] = b[j++];
            }
        }
    }
}