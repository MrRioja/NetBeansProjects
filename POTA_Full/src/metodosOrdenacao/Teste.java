package metodosOrdenacao;

import java.util.Arrays;

public class Teste {

    public static void main(String[] args) {

        int[] vetor = {28, 3, 89, 34, 23, 5, 43, 19, 8, 38, 2, 99, 0, 67, 45, 60, 95, 50, 92, 34, 55, 77, 88, 44, 69, 14, 41, 21, 49};
        BubbleSort.bubblesort(vetor);
        //selection(vetor);
        System.out.println(Arrays.toString(vetor));
    }
}
