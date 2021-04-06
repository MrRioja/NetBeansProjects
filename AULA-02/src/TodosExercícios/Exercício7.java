package TodosExercícios;

import java.util.Scanner;

public class Exercício7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idade, anoNas, anoAtual;

        System.out.println("Digite o ano de seu nascimento: ");
        anoNas = entrada.nextInt();
        System.out.println("");
        System.out.println("Digite o ano atual: ");
        anoAtual = entrada.nextInt();

        idade = (anoAtual - anoNas);

        System.out.println("");
        System.out.println("Sua idade é: " + idade + " anos.");
        System.out.println("Em 2020 você terá " + (2020 - anoNas) + " anos.");
        System.out.println("");
    }
}

//Construir um algoritmo que leia o ano de nascimento de uma pessoa e o ano atual, calcule e mostre:
//A idade dessa pessoa;
//Quantos anos essa pessoa terá em 2020.
