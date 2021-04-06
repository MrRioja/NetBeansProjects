package metodosOrdenacao;

import java.util.Arrays;

public class Testes {

    public static void main(String[] args) {

        int[] vetor = {5,4,3,2,1};
        BubbleSort.testebubble(vetor);
        System.out.println(Arrays.toString(vetor));

        /*MERGE SORT
        MergeSort.mergesort(vetor, 0, vetor.length - 1);
        System.out.println(Arrays.toString(vetor));
 
        INSERTION SORT
        InsertionSort.insertionsort(vetor);
        System.out.println(Arrays.toString(vetor));
 
        BUBBLE SORT
        BubbleSort.bubblesort(vetor);
        BubbleSort.bubblesort2(vetor);
        System.out.println(Arrays.toString(vetor));
 
        SELECTION SORT
        int[] vetor = {28, 3, 89, 34, 23, 5, 43, 19, 8, 38, 2, 99, 0, 67, 49};
        SelectionSort.selectionsort(vetor);
        System.out.println(Arrays.toString(vetor));

 
        CONTAGEM REGRESSIVA
        Iteracao.contagemRegressiva(7);
        Recursao.contagemRegressiva(7);
 
        SOMA
        System.out.println("Soma iterativa:" + Iteracao.soma(7));
        System.out.println("Soma recursiva: " + Recursao.soma(4));*/
    }
}
