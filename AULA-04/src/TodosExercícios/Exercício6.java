package TodosExercícios;

import java.util.Scanner;

public class Exercício6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        char periodo;

        System.out.println(" ==== Períodos de estudo ==== ");
        System.out.println("DIGITE 'M' PARA MATUTINO. ");
        System.out.println("DIGITE 'V' PARA VESPERTINO. ");
        System.out.println("DIGITE 'N' PARA NOTURNO. ");
        System.out.println("");

        System.out.println("Em qual período você estuda? ");
        periodo = entrada.next().charAt(0);
        periodo = Character.toUpperCase(periodo);
        System.out.println("");

        switch (periodo) {
            case 'M':
                System.out.println("BOM DIA !!! ");
                break;
            case 'V':
                System.out.println("BOA TARDE !!! ");
                break;
            case 'N':
                System.out.println("BOA NOITE !!! ");
                break;
            default:
                System.out.println("Você digitou um período inválido. ");
        }
        System.out.println("");
    }
}

//Faça um algoritmo que leia o período em que um aluno estuda: 
//M – Matutino, V – Vespertino ou N – Noturno e escreva uma das saudações a seguir:
