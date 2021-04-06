package TodosExercícios;

import java.util.Scanner;

public class Exercício1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome, sexo;
        int idade;

        System.out.println("Insira o seu nome: ");
        nome = entrada.nextLine();
        System.out.println("");
        System.out.println("Insira seu sexo: ");
        sexo = entrada.nextLine();
        System.out.println("");
        System.out.println("Insira sua idade: ");
        idade = entrada.nextInt();

        System.out.println("");
        System.out.println("Nome: " + nome + ".");
        System.out.println("Sexo: " + sexo + ".");
        System.out.println("Idade: " + idade + " anos.");
        System.out.println("");
    }
}

//Faça um algoritmo que leia o nome, a idade e o sexo de uma pessoa. Imprimir todas as informações no final.
