package TodosExercícios;

import java.util.Scanner;

public class Exercício3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int dia;

        System.out.println("Digite um número de 1 a 7: ");
        dia = entrada.nextInt();
        System.out.println("");

        switch (dia) {
            case 1:
                System.out.println("O dia correspondente é: DOMINGO.");
                break;
            case 2:
                System.out.println("O dia correspondente é: SEGUNDA-FEIRA.");
                break;
            case 3:
                System.out.println("O dia correspondente é: TERÇA-FEIRA.");
                break;
            case 4:
                System.out.println("O dia correspondente é: QUARTA-FEIRA.");
                break;
            case 5:
                System.out.println("O dia correspondente é: QUINTA-FEIRA.");
                break;
            case 6:
                System.out.println("O dia correspondente é: SEXTA-FEIRA.");
                break;
            case 7:
                System.out.println("O dia correspondente é: SÁBADO.");
                break;
            default:
                System.out.println("Você não digitou um número válido. ");
        }
        System.out.println("");
    }
}

//Crie um algoritmo que leia um número de 1 a 7 e imprima o dia da semana correspondente. Sabendo que 1 corresponde ao Domingo.
