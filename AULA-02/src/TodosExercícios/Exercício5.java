package TodosExercícios;

import java.util.Scanner;

public class Exercício5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int altura, base, area;

        System.out.println("Digite a base do triângulo: ");
        base = entrada.nextInt();
        System.out.println("");
        System.out.println("Digite a altura do triângulo: ");
        altura = entrada.nextInt();

        area = (altura * base) / 2;

        System.out.println("");
        System.out.println("A área do triângulo é: " + area + ".");
        System.out.println("");
    }
}

//Construir um algoritmo que calcule a área de um triângulo dado a base e a altura. ( at= (altura*base) / 2 ).
