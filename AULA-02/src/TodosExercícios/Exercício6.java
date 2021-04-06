package TodosExercícios;

import java.util.Scanner;

public class Exercício6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n1, n2;

        System.out.println("Insira o primeiro número: ");
        n1 = entrada.nextInt();
        System.out.println("");
        System.out.println("Insira o segundo número: ");
        n2 = entrada.nextInt();

        System.out.println("");
        System.out.println("O produto resultante é: " + (n1 * n2) + ".");
        System.out.println("");
    }
}

//Construir um algoritmo para ler dois números inteiros e imprimir o seu produto.
