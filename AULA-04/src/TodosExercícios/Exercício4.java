package TodosExercícios;

import java.util.Scanner;

public class Exercício4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salario;
        char plano;

        System.out.println("Digite seu sálario atual: ");
        salario = entrada.nextDouble();
        System.out.println("");

        System.out.println("Digite o seu plano de trabalho: ");
        plano = entrada.next().charAt(0);
        plano = Character.toUpperCase(plano);
        System.out.println("");

        switch (plano) {
            case 'A':
                System.out.println("Seu novo sálario é: " + (salario + ((salario / 100) * 10)));
                break;
            case 'B':
                System.out.println("Seu novo sálario é: " + (salario + ((salario / 100) * 15)));
                break;
            case 'C':
                System.out.println("Seu novo sálario é: " + (salario + ((salario / 100) * 20)));
                break;
            default:
                System.out.println("Você digitou um plano inválido.");
        }
        System.out.println("");
    }
}
//Um funcionário receberá aumento de acordo com o seu plano de trabalho. 
//Faça um algoritmo que leia o plano de trabalho e o salário atual de um funcionário e calcule e imprima o seu novo salário.
