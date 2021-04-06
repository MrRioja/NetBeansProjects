package TodosExercícios;

import java.util.Scanner;

public class Exercício5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int quantidade, codigo;

        System.out.println(" ==== CARDÁPIO DA LANCHONTE: ==== ");
        System.out.println("");
        System.out.println("Código 100 - Cachorro quente R$ 1,20 .");
        System.out.println("Código 101 - Bauru Simples   R$ 1,30 .");
        System.out.println("Código 102 - Bauru com ovo   R$ 1,50 .");
        System.out.println("Código 103 - Hambúrguer      R$ 1,20 .");
        System.out.println("Código 104 - Cheeseburguer   R$ 1,30 .");
        System.out.println("Código 105 - Refrigerante    R$ 1,00 .");
        System.out.println("");

        System.out.println("Digite o código do produto: ");
        codigo = entrada.nextInt();
        System.out.println("");

        System.out.println("Digite a quantidade desejada: ");
        quantidade = entrada.nextInt();
        System.out.println("");

        switch (codigo) {
            case 100:
                System.out.println("Você optou pelo Cachorro quente.");
                System.out.println("");
                System.out.println("O valor à ser pago é de: R$ " + (quantidade * 1.20));
                break;
            case 101:
                System.out.println("Você optou pelo Bauru Simples.");
                System.out.println("");
                System.out.println("O valor à ser pago é de: R$ " + (quantidade * 1.30));
                break;
            case 102:
                System.out.println("Você optou pelo Bauru com ovo.");
                System.out.println("");
                System.out.println("O valor à ser pago é de: R$ " + (quantidade * 1.50));
                break;
            case 103:
                System.out.println("Você optou pelo Hambúrguer.");
                System.out.println("");
                System.out.println("O valor à ser pago é de: R$ " + (quantidade * 1.20));
                break;
            case 104:
                System.out.println("Você optou pelo Cheeseburguer.");
                System.out.println("");
                System.out.println("O valor à ser pago é de: R$ " + (quantidade * 1.30));
                break;
            case 105:
                System.out.println("Você optou pelo Refrigerante.");
                System.out.println("");
                System.out.println("O valor à ser pago é de: R$ " + (quantidade * 1.00));
                break;
            default:
                System.out.println("Você digitou um código de produto inválido.");
        }
        System.out.println("");
    }
}
//Dado o cardápio de uma lanchonete:
//Faça um algoritmo que leia o código do produto e a quantidade. 
//Calcular o valor a ser pago pelo cliente. Imprimir o valor a ser pago e o nome do produto.
