package TodosExercícios;

import java.util.Scanner;

public class Exercício2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n1, n2;
        char operacao;

        System.out.println("Digite dois números: ");
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();
        System.out.println("");

        System.out.println(" ==== OPERAÇÃO DESEJADA: ==== ");
        System.out.println("DIGITE 'M' PARA: MÉDIA ENTRE OS NÚMEROS DIGITADOS");
        System.out.println("DIGITE 'S' PARA: DIFERENÇA DO MAIOR PELO MENOR");
        System.out.println("DIGITE 'P' PARA: PRODUTO ENTRE OS NÚMEROS DIGITADOS");
        System.out.println("DIGITE 'D' PARA: DIVISÃO DO PRIMEIRO PELO SEGUNDO");
        operacao = entrada.next().charAt(0);
        operacao = Character.toUpperCase(operacao);
        System.out.println("");

        switch (operacao) {
            case 'M':
                System.out.println("A média entre os números é: " + ((n1 + n2) / 2));
                break;
            case 'S':
                if (n1 > n2) {
                    System.out.println("A diferença entre os números é: " + (n1 - n2));

                } else {
                    System.out.println("A diferença entre os números é: " + (n2 - n1));
                }
                break;
            case 'P':
                System.out.println("O produto entre os números é: " + (n1 * n2));
                break;
            case 'D':
                System.out.println("A divisão entre os números é: " + (n1 / n2));
                break;
        }
        System.out.println("");
    }
}

//Faça um algoritmo que receba dois números e execute  as operações listadas a seguir, de acordo com a escolha do usuário.
