package metodosOrdenacao;

public class Recursao {

    public static void contagemRegressiva(int n) {
        if (n == 0) {
            System.out.println("Feliz Ano Novo!");
        } else {
            System.out.println(n);
            contagemRegressiva(n - 1);
        }
    }

    public static int soma(int n) {
        if (n == 1) {
            return 1;
        } else {
            return (n + soma(n - 1));
        }
    }

    public static int buscaBinariaRecursiva(int[] numeros, int numero, int primeiro, int ultimo) {

        if (primeiro > ultimo) {
            return -1;
        }

        int meio = (primeiro + ultimo) / 2;

        if (numero == numeros[meio]) {
            return meio;
        } else {
            if (numero < numeros[meio]) {
                return buscaBinariaRecursiva(numeros, numero, primeiro, meio - 1);
            } else {
                return buscaBinariaRecursiva(numeros, numero, meio + 1, ultimo);
            }
        }
    }

    public static int pow(int n, int m) {
        if (m == 0) {
            return 1;
        } else {
            return (n * pow(n, m - 1));
        }
    }
}
