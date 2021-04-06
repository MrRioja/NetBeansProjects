import java.util.Arrays;
import java.util.Random;
import javax.xml.transform.Source;

public class Metodos {
    // METODOS AUXILIARES COMEÇO

    private static boolean isLogging = false;

    public static int contBubble = 0;
    public static int contSelection = 0;
    public static int contInsertion = 0;
    public static int contMerge = 0;
    public static int contHeap = 0;
    public static int contQuick = 0;
    public static int contCounting = 0;
    public static int contBucket = 0;
    public static int contRadix = 0;

    public static int[] gerarVetor(int tamanho) {

        Random random = new Random();
        int valores[] = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            valores[i] = random.nextInt(1000);
        }

        if (isLogging) {
            System.out.println("gerarVetor() -> vetor randomizado gerado! " + Arrays.toString(valores));
        }

        return valores;
    }

    public static float calcularMedia(int[] contador) {

        float totalMedias = 0;

        // System.out.println("calcularMedia() -> vetor de contadores passado! " +
        // Arrays.toString(contador));
        for (int i = 0; i < contador.length; i++) {
            totalMedias += contador[i];
        }

        float mediaFinal = totalMedias / (float) contador.length;

        if (isLogging) {
            System.out.println("calcularMedia() -> media do vetor calculada! " + mediaFinal);
        }

        return mediaFinal;
    }
    // METODOS AUXILIARES FIM

    // BUBBLESORT COMEÇO
    public static int bubbleSort(int vetor[]) {
        contBubble = 0;
        _bubbleSort(vetor);
        if (isLogging) {
            System.out.println("bubbleSort: cont = " + contBubble + " vetor depois = " + Arrays.toString(vetor));
        }
        return contBubble;

    }

    private static void _bubbleSort(int vetor[]) {
        do {
            for (int j = 0; j < vetor.length; j++) {
                for (int i = 0; i < vetor.length - 1; i++) {
                    contBubble++;
                    if (vetor[i] > vetor[i + 1]) {
                        int temp = vetor[i];
                        vetor[i] = vetor[i + 1];
                        vetor[i + 1] = temp;

                    }
                }
            }
        } while (vetor.length == 0);

    }
    // BUBBLESORT FIM

    public static int selectionSort(int vetor[]) {
        contSelection = 0;
        _selectionSort(vetor);
        if (isLogging) {
            System.out.println("selectionSort: cont = " + contSelection + " vetor depois = " + Arrays.toString(vetor));
        }
        return contSelection;
    }

    // SELECTION SORT COMECO
    private static void _selectionSort(int vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            int menor = i;

            for (int j = i + 1; j < vetor.length; j++) {
                contSelection++;
                if (vetor[j] < vetor[menor]) {
                    menor = j;

                }
            }
            int temp = vetor[i];
            vetor[i] = vetor[menor];
            vetor[menor] = temp;
        }
    }
    // SELECTION SORT FIM

    // INSERTIONSORT COMECO
    public static int insertionSort(int vetor[]) {
        contInsertion = 0;
        _insertionSort(vetor);
        if (isLogging) {
            System.out.println("insertionSort: cont = " + contInsertion + " vetor depois = " + Arrays.toString(vetor));
        }

        return contInsertion;
    }

    private static void _insertionSort(int vetor[]) {
        for (int i = 1; i < vetor.length; i++) {
            int aux = i;
            contInsertion++;
            while (aux > 0 && vetor[aux - 1] > vetor[aux]) {
                int temp = vetor[aux - 1];
                vetor[aux - 1] = vetor[aux];
                vetor[aux] = temp;
                aux = aux - 1;

            }
        }

    }
    // INSERTIONSORT FIM

    // MERGESORT COMECO
    public static int mergesort(int[] vetor) {
        contMerge = 0;
        _mergesort(vetor, 0, vetor.length - 1);
        if (isLogging) {
            System.out.println("mergeSort: cont = " + contMerge + " vetor depois = " + Arrays.toString(vetor));
        }
        return contMerge;

    }

    private static int _mergesort(int[] vetor, int i, int f) {
        int q = 0;

        if (i < f) {
            q = (i + f) / 2;
            _mergesort(vetor, i, q);
            _mergesort(vetor, q + 1, f);
            intercala(vetor, i, q, f);
        }

        return contMerge;
    }

    private static void intercala(int[] vetor, int in, int q, int f) {

        int i, j, k;
        int[] b = new int[vetor.length];

        for (i = in; i <= f; i++) {
            b[i] = vetor[i];
        }

        i = in;
        j = q + 1;

        for (k = in; k <= f; k++) {
            contMerge++;
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
    // MERGESORT FIM

    public static int heapSort(int vetor[]) {
        contHeap = 0;
        _heapSort(vetor);
        if (isLogging) {
            System.out.println("heapSort: cont = " + contHeap + " vetor depois = " + Arrays.toString(vetor));
        }
        return contHeap;
    }

    // HEAPSORT COMEÇO
    private static int _heapSort(int vetor[]) {
        buildheap(vetor);

        for (int i = vetor.length - 1; i >= 0; i--) {
            exchange(vetor, i, 0);
            heap(vetor, i, 0);
        }

        return contHeap;
    }

    private static void buildheap(int[] nums) {
        for (int i = (nums.length / 2) - 1; i >= 0; i--) {
            heap(nums, (nums.length - 1), i);
        }
    }

    private static void exchange(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void heap(int[] nums, int size, int i) {
        int left = ((2 * i) + 1);
        int right = ((2 * i) + 2);
        int max = i;
        contHeap++;
        if ((left < size) && (nums[left] > nums[i])) {
            max = left;
        }

        if ((right < size) && (nums[right] > nums[max])) {
            max = right;
        }

        if (max != i) {
            exchange(nums, i, max);
            heap(nums, size, max);
        }
    }
    /// HEAPSORT FIM

    public static int quickSort(int[] vetor) {
        contQuick = 0;
        _quickSort(vetor, 0, vetor.length - 1);
        if (isLogging) {
            System.out.println("quickSort: cont = " + contQuick + " vetor depois = " + Arrays.toString(vetor));
        }
        return contQuick;
    }

    // QUICKSORT COMEÇO
    private static int _quickSort(int[] vetor, int start, int end) {

        int partition = partition(vetor, start, end);

        if (partition - 1 > start) {
            _quickSort(vetor, start, partition - 1);
        }

        if (partition + 1 < end) {
            _quickSort(vetor, partition + 1, end);
        }

        return contQuick;
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];

        for (int i = start; i < end; i++) {
            contQuick++;
            if (arr[i] < pivot) {

                int temp = arr[start];
                arr[start] = arr[i];
                arr[i] = temp;
                start++;
            }
        }

        int temp = arr[start];
        arr[start] = pivot;
        arr[end] = temp;
        return start;
    }
    // QUICKSORT FIM

    // COUNTINGSORT COMECO
    public static int countingSort(int[] vetor) {
        contCounting = 0;
        _countingSort(vetor, 1001);
        if (isLogging) {
            System.out.println("countingSort: cont = " + contCounting + " vetor depois = " + Arrays.toString(vetor));
        }
        return contCounting;
    }

    private static void _countingSort(int[] vetor, int k) {
        int counter[] = new int[k + 1];

        for (int i : vetor) {
            counter[i]++;
        }

        int ndx = 0;
        for (int i = 0; i < counter.length; i++) {

            while (0 < counter[i]) {
                contCounting++;
                vetor[ndx++] = i;
                counter[i]--;
            }
        }

    }
    // COUNTINGSORT FIM

    // BUCKERTSORT COMECO
    public static int bucketSort(int[] vetor) {
        contBucket = 0;
        int maxValue = maxValue(vetor);
        _bucketSort(vetor, maxValue);
        if (isLogging) {
            System.out.println("bucketSort: cont = " + contBucket + " vetor depois = " + Arrays.toString(vetor));
        }
        return contBucket;
    }

    private static void _bucketSort(int[] a, int maxVal) {

        int[] bucket = new int[maxVal + 1];

        for (int i = 0; i < bucket.length; i++) {

            bucket[i] = 0;
        }

        for (int i = 0; i < a.length; i++) {

            bucket[a[i]]++;
        }

        int outPos = 0;
        for (int i = 0; i < bucket.length; i++) {

            for (int j = 0; j < bucket[i]; j++) {
                contBucket++;
                a[outPos++] = i;
            }
        }
    }

    private static int maxValue(int[] sequence) {

        int maxValue = 0;

        for (int i = 0; i < sequence.length; i++) {
            if (sequence[i] > maxValue) {
                maxValue = sequence[i];
            }
        }

        return maxValue;

    }
    // BUCKETSORT FIM

    // RADIXSORT COMECO
    public static int radixSort(int vetor[]) {
        contRadix = 0;
        _radixSort2(vetor);
        if (isLogging) {
            System.out.println("radixSort: cont = " + contRadix + " vetor depois = " + Arrays.toString(vetor));
        }
        return contRadix;
    }

    private static void _radixSort2(int[] vetor) {
        int i;
        int[] b = new int[vetor.length];
        int maior = vetor[0];
        int exp = 1;

        for (i = 0; i < vetor.length; i++) {

            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        while (maior / exp > 0) {

            int[] bucket = new int[10];

            for (i = 0; i < vetor.length; i++) {
                bucket[(vetor[i] / exp) % 10]++;

            }

            for (i = 1; i < 10; i++) {
                bucket[i] += bucket[i - 1];

            }

            for (i = vetor.length - 1; i >= 0; i--) {
                b[--bucket[(vetor[i] / exp) % 10]] = vetor[i];

            }

            for (i = 0; i < vetor.length; i++) {
                contRadix++;
                vetor[i] = b[i];

            }
            exp *= 10;
        }

    }

    // RADIXSORT FIM
}
