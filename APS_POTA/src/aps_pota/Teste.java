

public class Teste {

    public static void main(String[] args) {

        int[] tamanhosVetores = { 5, 10, 50, 100, 1000, 10000 };
        int quantidadeRepeticoes = 50;


        //int[] tamanhosVetores = {5};
        //int quantidadeRepeticoes = 10;

        for (int i = 0; i < tamanhosVetores.length; i++) {

            int[] trocasBubble = new int[quantidadeRepeticoes];
            int[] trocasSelection = new int[quantidadeRepeticoes];
            int[] trocasInsertion = new int[quantidadeRepeticoes];
            int[] trocasMerge = new int[quantidadeRepeticoes];
            int[] trocasHeap = new int[quantidadeRepeticoes];
            int[] trocasQuick = new int[quantidadeRepeticoes];
            int[] trocasCounting = new int[quantidadeRepeticoes];
            int[] trocasBucket = new int[quantidadeRepeticoes];
            int[] trocasRadix = new int[quantidadeRepeticoes];

            for (int j = 0; j < quantidadeRepeticoes; j++) {

                int[] tempVetor = Metodos.gerarVetor(tamanhosVetores[i]);          
                
                trocasBubble[j] = Metodos.bubbleSort(tempVetor.clone());
                
                trocasSelection[j] = Metodos.selectionSort(tempVetor.clone());
                trocasInsertion[j] = Metodos.insertionSort(tempVetor.clone());
                trocasMerge[j] = Metodos.mergesort(tempVetor.clone());
                trocasHeap[j] = Metodos.heapSort(tempVetor.clone());
                trocasQuick[j] = Metodos.quickSort(tempVetor.clone());
                trocasCounting[j] = Metodos.countingSort(tempVetor.clone());
                trocasBucket[j] = Metodos.bucketSort(tempVetor.clone());
                trocasRadix[j] = Metodos.radixSort(tempVetor.clone());
            }

            System.out.println("--------------- COMECO MEDIAS TAMANHO " + tamanhosVetores[i] + "-----------------");

            System.out.println("-------- BubbleSort --------");
            //System.out.println("conts de trocasBubble: " + Arrays.toString(trocasBubble));
            System.out.println("Media Final BubbleSort: " + Metodos.calcularMedia(trocasBubble));

            System.out.println("-------- SelectionSort --------");
            //System.out.println("conts de trocasSelection: " + Arrays.toString(trocasSelection));
            System.out.println("Media Final SelectionSort: " + Metodos.calcularMedia(trocasSelection));
            
            System.out.println("-------- InsertionSort --------");
            //System.out.println("conts de trocasInsertion: " + Arrays.toString(trocasInsertion));
            System.out.println("Media Final InsertionSort: " + Metodos.calcularMedia(trocasInsertion));

            System.out.println("-------- MergeSort --------");
            //System.out.println("conts de trocasMerge: " + Arrays.toString(trocasMerge));
            System.out.println("Media Final Mergesort: " + Metodos.calcularMedia(trocasMerge));

            System.out.println("-------- HeapSort --------");
            //System.out.println("conts de trocasHeap: " + Arrays.toString(trocasHeap));
            System.out.println("Media Final HeapSort: " + Metodos.calcularMedia(trocasHeap));

            System.out.println("-------- QuickSort --------");
            //System.out.println("conts de trocasQuick: " + Arrays.toString(trocasQuick));
            System.out.println("Media Final QuickSort: " + Metodos.calcularMedia(trocasQuick));

            System.out.println("-------- CountingSort --------");
            //System.out.println("conts de trocasCounting: " + Arrays.toString(trocasCounting));
            System.out.println("Media Final CountingSort: " + Metodos.calcularMedia(trocasCounting));

            System.out.println("-------- BucketSort --------");
            //System.out.println("conts de trocasBucket: " + Arrays.toString(trocasBucket));
            System.out.println("Media Final BucketSort: " + Metodos.calcularMedia(trocasBucket));

            System.out.println("-------- RadixSort --------");
            //System.out.println("conts de trocasRadix: " + Arrays.toString(trocasRadix));
            System.out.println("Media FinalRadixSort: " + Metodos.calcularMedia(trocasRadix));

            System.out.println("--------------- FIM MEDIAS TAMANHO " + tamanhosVetores[i] + "-----------------");
            System.out.println();
        }
    }

}
