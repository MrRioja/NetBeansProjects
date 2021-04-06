package TodosExercícios;

import java.util.Scanner;

public class Exercício9 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int pot, numero;

        System.out.println("Digite seu número: ");
        numero = entrada.nextInt();

        System.out.println("");
        System.out.println("O quadrado do número digitado é: "
                + (int) Math.pow(numero, 2) + ".");
        System.out.println("");

        System.out.println("O número digitado ao cubo é: "
                + (int) Math.pow(numero, 3) + ".");
        System.out.println("");

        System.out.println("A raiz quadrada do número digitado é: "
                + (int) Math.sqrt(numero) + ".");
        System.out.println("");

        System.out.println("O número digitado elevado à potência 10 é: "
                + (int) Math.pow(numero, 10));
        System.out.println("");
    }
}

//Faça um algoritmo que receba um número, calcule e mostre:
//O número elevado ao quadrado;
//O número elevado ao cubo;
//A raiz quadrada do número digitado;
//O número elevado a potência 10;
