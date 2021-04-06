package TodosExercícios;

import java.util.Scanner;

public class Exercício4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double salario, salarioNew;

        System.out.println("Digite seu salário antigo: ");
        salario = entrada.nextDouble();

        salarioNew = salario + ((salario / 100) * 25);

        System.out.println("");
        System.out.println("O seu novo salário é: " + salarioNew + ".");
        System.out.println("");
    }
}

//Faça um algoritmo que leia o salário de um funcionário. 
//Sabendo que o salário do funcionário teve um aumento de 25%, calcular e mostrar o novo salário.
