package TodosExercícios;

import java.util.Scanner;

public class Exercício3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double n1, n2, n3, media;

        System.out.println("Insira sua primeira nota: ");
        n1 = entrada.nextDouble();
        System.out.println("");
        System.out.println("Insira sua segunda nota: ");
        n2 = entrada.nextDouble();
        System.out.println("");
        System.out.println("Insira sua terceira nota: ");
        n3 = entrada.nextDouble();

        media = ((n1 + n2 + n3) / 3);

        System.out.println("");
        System.out.println("Sua média é: " + media + ".");
        System.out.println("");
    }

}

//Faça um algoritmo que leia três notas de um aluno, calcule e mostre a média aritmética do aluno.
