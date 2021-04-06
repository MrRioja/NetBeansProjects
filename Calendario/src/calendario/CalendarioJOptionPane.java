package calendario;

import javax.swing.JOptionPane; //IMPORTAÇÃO DO PACOTE (OBRIGATÓRIA)

public class CalendarioJOptionPane {

    public static void main(String[] args) {

        //DECLARAÇÃO DAS VARIAVÉIS
        boolean validacao = true; //USADA PARA VALIDAR O DIA DO MÊS
        int d = 0 /*DIA*/, m = 0 /*MÊS*/, a = 0 /*ANO*/, k /*DEFINE DIA DA SEMANA*/;
        int repetir; //USADA PARA CONTROLAR O LAÇO DA CONSULTA DE DATA

        do {
            //VALIDAÇÃO DO ANO DA BUSCA
            do {
                try {
                    a = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano que deseja buscar:", "Defina o ano",
                            JOptionPane.QUESTION_MESSAGE));
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Apenas valores númericos são permitidos.", "Valor incorreto.",
                            JOptionPane.ERROR_MESSAGE);
                }
            } while (a <= 0);

            //VALIDAÇÃO DO MÊS DA BUSCA
            do {
                try {
                    m = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o mês que deseja buscar:", "Defina o mês",
                            JOptionPane.QUESTION_MESSAGE));
                    if (m < 1 || m > 12) {
                        JOptionPane.showMessageDialog(null, "Valor inválido.");
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Apenas valores númericos são permitidos.", "Valor incorreto.",
                            JOptionPane.ERROR_MESSAGE);
                }
            } while (m < 1 || m > 12);

            //VALIDAÇÃO DO DIA DA BUSCA
            do {
                try {
                    d = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o dia que deseja buscar:", "Defina o dia",
                            JOptionPane.QUESTION_MESSAGE));

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Apenas valores númericos são permitidos.", "Valor incorreto.",
                            JOptionPane.ERROR_MESSAGE);
                }
                //VALIDAÇÃO DO DIA: FEVEREIRO DE ANO BISSEXTO
                if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
                    if ((d < 1 || d > 29) && m == 2) {
                        JOptionPane.showMessageDialog(null, "Valor do dia é inválido, por favor, digite novamente.");
                    }
                } else if ((d < 1 || d > 28) && (m == 2))/*VALIDAÇÃO DO DIA: FEVEREIRO */ {
                    JOptionPane.showMessageDialog(null, "Valor do dia é inválido, por favor, digite novamente.");
                } else if ((d <= 0 || d >= 31) && (m == 4 || m == 6 || m == 9 || m == 11)) {
                    /*VALIDAÇÃO DOS MESES COM 30 DIAS*/
                    JOptionPane.showMessageDialog(null, "Valor do dia é inválido, por favor, digite novamente.");
                } else if ((d <= 0 || d >= 32) && (m == 1 || m == 3 || m == 5 || m == 7 || m == 8
                        || m == 10 || m == 12)) {
                    /*VALIDAÇÃO DOS MESES COM 31 DIAS*/
                    JOptionPane.showMessageDialog(null, "Valor do dia é inválido, por favor, digite novamente.");
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
                    JOptionPane.showMessageDialog(null, "O dia da semana da data " + d + "/" + m + "/" + a + " é Sábado.");
                    break;
                case 1:
                    JOptionPane.showMessageDialog(null, "O dia da semana da data " + d + "/" + m + "/" + a + " é Domingo.");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "O dia da semana da data " + d + "/" + m + "/" + a + " é Segunda-feira.");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "O dia da semana da data " + d + "/" + m + "/" + a + " é Terça-feira.");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "O dia da semana da data " + d + "/" + m + "/" + a + " é Quarta-feira.");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "O dia da semana da data " + d + "/" + m + "/" + a + " é Quinta-feira.");
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "O dia da semana da data " + d + "/" + m + "/" + a + " é Sexta-feira.");
                    break;
                default:
                    break;
            }

            //LAÇO PARA ENCERRAR OU FAZER NOVA BUSCA
            repetir = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Deseja continuar?",
                    JOptionPane.YES_NO_OPTION);
        } while (repetir == 0);
    }
}
