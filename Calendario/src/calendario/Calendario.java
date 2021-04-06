package calendario;

import java.util.Scanner;

public class Calendario {

    public static void main(String[] args) {
        //INICIALIZAÇÃO DO BUFFER
        Scanner entrada = new Scanner(System.in);

        //DECLARAÇÃO DAS VARIAVÉIS
        boolean validacao = true; //USADA PARA VALIDAR O DIA DO MÊS
        String repetir = ""; //USADA PARA CONTROLAR O LAÇO DA CONSULTA DE DATA
        int d /*DIA*/, m /*MÊS*/, a /*ANO*/, k /*DEFINE DIA DA SEMANA*/;

        //VALIDAÇÃO DO ANO DA BUSCA
        do {
            do {
                System.out.println("\nDigite o ano que deseja buscar: ");
                a = Integer.parseInt(entrada.nextLine());
                if (a <= 0) {
                    System.out.println("Valor inválido. \n");
                }
            } while (a <= 0);

            //VALIDAÇÃO DO MÊS DA BUSCA
            do {
                System.out.println("\nDigite o mês que deseja buscar: ");
                m = Integer.parseInt(entrada.nextLine());
                if (m < 1 || m > 12) {
                    System.out.println("Valor inválido. \n");
                }
            } while (m < 1 || m > 12);

            //VALIDAÇÃO DO DIA DA BUSCA
            do {
                System.out.println("\nDigite o dia que deseja buscar: ");
                d = Integer.parseInt(entrada.nextLine());

                //VALIDAÇÃO DO DIA: FEVEREIRO DE ANO BISSEXTO
                if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
                    if ((d < 1 || d > 29) && m == 2) {
                        System.out.println("Valor do dia é inválido, por favor, digite novamente.");
                    }
                } else if ((d < 1 || d > 28) && (m == 2))/*VALIDAÇÃO DO DIA: FEVEREIRO */ {
                    System.out.println("Valor do dia é inválido, por favor, digite novamente.");
                } else if ((d <= 0 || d >= 31) && (m == 4 || m == 6 || m == 9 || m == 11)) {
                    /*VALIDAÇÃO DOS MESES COM 30 DIAS*/
                    System.out.println("Valor do dia está incorreto, digite um dia válido para esse mês.");
                } else if ((d <= 0 || d >= 32) && (m == 1 || m == 3 || m == 5 || m == 7 || m == 8
                        || m == 10 || m == 12)) {
                    /*VALIDAÇÃO DOS MESES COM 31 DIAS*/
                    System.out.println("Valor do dia está incorreto, digite um dia válido para esse mês.");
                } else {
                    validacao = false;
                }
            } while (validacao);

            /*CÁLCULO DE DIAS*/
            switch (m) {
                case 1:
                    k = ((d + 2 * 13) + ((3 * (13 + 1)) / 5) + a - 1 + ((a - 1) / 4) - ((a - 1) / 100) + (((a - 1) / 400) + 2));
                    break;
                case 2:
                    k = (d + (2 * 14) + (3 * (14 + 1) / 5) + a - 1 + ((a - 1) / 4) - ((a - 1) / 100) + (((a - 1) / 400) + 2));
                    break;
                default:
                    k = ((d + (2 * m)) + ((3 * (m + 1)) / 5) + a + (a / 4) - (a / 100) + (a / 400) + 2);
                    break;
            }

            /*CÁLCULO PARA DEFINIÇÃO DO DIA DA SEMANA*/
            switch (k % 7) {
                case 0:
                    System.out.println("\n===========================================================");
                    System.out.println("  O dia da semana da data " + d + "/" + m + "/" + a + " é Sábado.");
                    System.out.println("===========================================================\n");
                    break;
                case 1:
                    System.out.println("\n===========================================================");
                    System.out.println("  O dia da semana da data " + d + "/" + m + "/" + a + " é Domingo.");
                    System.out.println("===========================================================\n");
                    break;
                case 2:
                    System.out.println("\n===========================================================");
                    System.out.println("  O dia da semana da data " + d + "/" + m + "/" + a + " é Segunda-feira.");
                    System.out.println("===========================================================\n");
                    break;
                case 3:
                    System.out.println("\n===========================================================");
                    System.out.println("  O dia da semana da data " + d + "/" + m + "/" + a + " é Terça-feira.");
                    System.out.println("===========================================================\n");
                    break;
                case 4:
                    System.out.println("\n===========================================================");
                    System.out.println("  O dia da semana da data " + d + "/" + m + "/" + a + " é Quarta-feira.");
                    System.out.println("===========================================================\n");
                    break;
                case 5:
                    System.out.println("\n===========================================================");
                    System.out.println("  O dia da semana da data " + d + "/" + m + "/" + a + " é Quinta-feira.");
                    System.out.println("===========================================================\n");
                    break;
                case 6:
                    System.out.println("\n===========================================================");
                    System.out.println("  O dia da semana da data " + d + "/" + m + "/" + a + " é Sexta-feira.");
                    System.out.println("===========================================================\n");
                    break;
                default:
                    break;
            }
            //LAÇO PARA ENCERRAR OU FAZER NOVA BUSCA
            do {
                System.out.println("Deseja consultar outra data? \n (s/n)");
                repetir = entrada.nextLine();

                if (!repetir.equalsIgnoreCase("s") || !repetir.equalsIgnoreCase("s")) {
                    System.out.println("\nDigite 's' se deseja fazer outra consulta e 'n' se deseja encerrar.\n");
                }
            } while (!repetir.equalsIgnoreCase("s") || !repetir.equalsIgnoreCase("s"));
        } while (repetir.equalsIgnoreCase("s"));
    }
}
