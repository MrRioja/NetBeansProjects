package aps;

import java.text.DecimalFormat;
import java.util.Scanner;

public class APS {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Nome e R.A. dos alunos do grupo:
        System.out.println("------------------------------------------");
        System.out.println("Eduardo Alves de Novais   | RA: 21092038");
        System.out.println("Leonardo Henrique de Lima | RA: 20574206");
        System.out.println("Luiz Lélis Rioja Silva    | RA: 21156529");
        System.out.println("Caio Assis Capasso        | RA: 20289906");
        System.out.println("------------------------------------------");

        //Definição da inclinação do canhão:
        System.out.print("Defina a inclinação (em graus) do canhão: ");
        double anguloInicial = in.nextDouble(); //Criação da variavél do ângulo inicial.
        while (anguloInicial <= 0.0 || anguloInicial >= 90.0) {
            System.out.print("Ângulo de inclinação é inválido. Digite novamente: ");
            anguloInicial = in.nextDouble();
        }

        System.out.println("Ângulo inicial em graus: " + anguloInicial);

        //Conversão dos graus do ângulo para medianos:
        anguloInicial = Math.toRadians(anguloInicial);
        System.out.println("Ângulo inicial em radianos: " + anguloInicial);

        //Definição da velocidade inicial: 
        System.out.print("Defina a velocidade inicial em m/s²: ");
        double velocidadeInicial = in.nextDouble(); //Criação da variavél de velocidade inicial.
        while (velocidadeInicial <= 0.0) {
            System.out.print("Valor da velocidade é inválido. Digite novamente: ");
            velocidadeInicial = in.nextDouble();
        }

        //declaração da constante de aceleração:
        double aceleracao = 9.81;

        //Cálculo do alcance horizontal:
        double alcanceHorizontal = (2 * Math.pow(velocidadeInicial, 2))
                * ((Math.cos(anguloInicial) * Math.sin(anguloInicial)) / aceleracao);

        //Cálculo do tempo de trajeto:
        double tempoTrajeto = (2 * velocidadeInicial * Math.sin(anguloInicial)) / aceleracao;

        //Cálculo da altura máxima atingida:
        double alturaMaximaProjetil = (Math.pow(velocidadeInicial, 2)
                * Math.pow(Math.sin(anguloInicial), 2))
                / (2 * aceleracao);

        //Definição da distância que o alvo se encontra:
        System.out.print("Defina a distância em que se encontra o alvo: ");
        double distanciaAlvo = in.nextDouble(); //Criação da variavél da distância do alvo.
        while (distanciaAlvo <= 0.0) {
            System.out.print("A distância é inválida. Digite novamente: ");
            distanciaAlvo = in.nextDouble();
        }

        //Definição do tamanho do alvo:
        System.out.print("Defina o tamanho do alvo: ");
        double tamanhoAlvo = in.nextDouble(); //Criação da variavél de tamanho do alvo.
        while (tamanhoAlvo < 5.0 || tamanhoAlvo > 50.0) {
            System.out.print("O tamanho do alvo é inválido. Digite novamente: ");
            tamanhoAlvo = in.nextDouble();
        }

        double comecoDoAlvo = distanciaAlvo - (tamanhoAlvo / 2); //Criação da variavél que define o começo do alvo.
        double fimDoAlvo = distanciaAlvo + (tamanhoAlvo / 2); //Criação da variavél que define o fim do alvo.

        //O alcance horizontal deve ser igual à distancia do alvo + metade do seu tamanho para atingi-lo bem no meio.
        //Abaixo cálculo para definir se o disparo acertou ou não o alvo:
        if (alcanceHorizontal < comecoDoAlvo) {
            System.out.println("O projétil caiu antes do alvo.");
            System.out.println("O alvo NÃO foi atingido.");
        } else if (alcanceHorizontal > fimDoAlvo) {
            System.out.println("O projétil caiu depois do alvo.");
            System.out.println("O alvo NÃO foi atingido.");
        } else {
            System.out.println("O alvo foi atingido!");
        }

        System.out.println("Alcance horizontal: " + alcanceHorizontal + " | Começo do alvo: " + comecoDoAlvo + " | Fim do alvo: " + fimDoAlvo);

        DecimalFormat df = new DecimalFormat("#.##"); //Inicialização do formato decimal.
        
        //Resultados finais do disparo do projétil:
        System.out.println("A altura máxima atingida pelo projétil foi de " + df.format(alturaMaximaProjetil) + " metros.");
        System.out.println("O tempo de trajeto do projétil foi de " + df.format(tempoTrajeto) + " segundos.");
        System.out.println("O alcance horizontal do projétil foi de " + df.format(alcanceHorizontal) + " metros.");

        in.close();
    }

}
