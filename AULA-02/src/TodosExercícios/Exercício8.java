package TodosExercícios;

import java.util.Scanner;

public class Exercício8 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quilowatts;
        double salario, valorQuilowatts, valorDivida, dividaDesc;

        System.out.println("Digite o sálario minimo: ");
        salario = entrada.nextDouble();
        System.out.println("");
        System.out.println("Digite a quantidade de quilowatt consumida: ");
        quilowatts = entrada.nextInt();

        valorQuilowatts = (salario / 500);
        valorDivida = quilowatts * valorQuilowatts;
        dividaDesc = valorDivida - ((valorDivida / 100) * 15);

        System.out.println("");
        System.out.println("Cada quilowatts custa: " + valorQuilowatts + " reais.");

        System.out.println("O valor a ser pago é de: " + valorDivida + " reais.");

        System.out.println("O valor a ser pago com desconto de 15% é de: "
                + dividaDesc + " reais.");
        System.out.println("");
    }
}

//Sabe-se que um quilowatt de energia custa 1/500 avos do salário mínimo. 
//Faça um algoritmo que receba o valor do salário mínimo e a quantidade de quilowatts consumida por uma residência. 
//Calcule e mostre:
//O valor, em reais, de cada quilowatt;
//O valor, em reais, a ser pago por essa residência
//O valor, em reais, a ser pago com desconto de 15%.
