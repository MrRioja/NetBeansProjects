package TodosExercícios;

import java.util.Scanner;

public class Exercício2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n1, n2, n3, n4, soma;

        System.out.println("Insira o primeiro número: ");
        n1 = entrada.nextInt();
        System.out.println("");
        System.out.println("Insira o segundo número: ");
        n2 = entrada.nextInt();
        System.out.println("");
        System.out.println("Insira o terceiro número: ");
        n3 = entrada.nextInt();
        System.out.println("");
        System.out.println("Insira o quarto número: ");
        n4 = entrada.nextInt();

        soma = ((n1 + n2 + n3 + n4));

        System.out.println("");
        System.out.println("A soma dos números digitados é: " + soma + ".");
        System.out.println("");
    }
}

//Faça um algoritmo que leia quatro números inteiros, calcule e mostre a soma desses números.
