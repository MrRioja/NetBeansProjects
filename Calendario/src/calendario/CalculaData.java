package calendario;

public class CalculaData {

    public static String Consulta(int dia, int mes, int ano) {

        boolean validacao = true; //USADA PARA VALIDAR O DIA DO MÊS
        String repetir = "" /*USADA PARA CONTROLAR O LAÇO DA CONSULTA DE DATA*/, resposta = "" /*RETORNO DO MÉTODO*/;
        int d = dia /*DIA*/, m = mes /*MÊS*/, a = ano /*ANO*/, k /*DEFINE DIA DA SEMANA*/;

        //VALIDAÇÃO DO ANO DA BUSCA
        //do {
        do {
            if (a <= 0) {
                resposta = "Valor inválido.";
            }
        } while (a <= 0);

        //VALIDAÇÃO DO MÊS DA BUSCA
        do {
            if (m < 1 || m > 12) {
                resposta = "Valor inválido.";
            }
        } while (m < 1 || m > 12);

        //VALIDAÇÃO DO DIA DA BUSCA
        do {
            //VALIDAÇÃO DO DIA: FEVEREIRO DE ANO BISSEXTO
            if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
                if ((d < 1 || d > 29) && m == 2) {
                    resposta = "Valor do dia é inválido, por favor, digite novamente.";
                }
            } else if ((d < 1 || d > 28) && (m == 2))/*VALIDAÇÃO DO DIA: FEVEREIRO */ {
                resposta = "Valor do dia é inválido, por favor, digite novamente.";
            } else if ((d <= 0 || d >= 31) && (m == 4 || m == 6 || m == 9 || m == 11)) {
                /*VALIDAÇÃO DOS MESES COM 30 DIAS*/
                resposta = "Valor do dia está incorreto, digite um dia válido para esse mês.";
            } else if ((d <= 0 || d >= 32) && (m == 1 || m == 3 || m == 5 || m == 7 || m == 8
                    || m == 10 || m == 12)) {
                /*VALIDAÇÃO DOS MESES COM 31 DIAS*/
                resposta = "Valor do dia está incorreto, digite um dia válido para esse mês.";
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
                resposta = "O dia da semana da data " + d + "/" + m + "/" + a + " é Sábado.";
                break;
            case 1:
                resposta = "O dia da semana da data " + d + "/" + m + "/" + a + " é Domingo.";
                break;
            case 2:
                resposta = "O dia da semana da data " + d + "/" + m + "/" + a + " é Segunda-feira.";
                break;
            case 3:
                resposta = "O dia da semana da data " + d + "/" + m + "/" + a + " é Terça-feira.";
                break;
            case 4:
                resposta = "O dia da semana da data " + d + "/" + m + "/" + a + " é Quarta-feira.";
                break;
            case 5:
                resposta = "O dia da semana da data " + d + "/" + m + "/" + a + " é Quinta-feira.";
                break;
            case 6:
                resposta = "O dia da semana da data " + d + "/" + m + "/" + a + " é Sexta-feira.";
                break;
            default:
                break;
        }
        return resposta;
    }
}
