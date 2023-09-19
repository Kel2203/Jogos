package jogo;

import jogo.Jogo;
import jogo.util.Imprimir;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class Adivinhacao extends Jogo {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    private int escolha, chute, totalDeTentativas, numeroSecreto = random.nextInt(101);
    private boolean acertou;
    private double pontosPerdidos, pontos = 1000.00;

    @Override
    public void nome() {
        System.out.println("Adivinhação");
    }

    @Override
    public void cabecalho() {
        Imprimir.imprimirCabecalhoAdivinhação();
    }

    @Override
    public void jogar() {

        try {
            System.out.print("Escolha: ");
            escolha = scanner.nextInt();
        } catch (InputMismatchException e) {

            System.err.println("\nERRO: " + e);
            System.out.println("\nDigite apenas números, por favor!");
            scanner.nextLine();
        }
        switch (escolha) {
            case 1 -> totalDeTentativas = 20;
            case 2 -> totalDeTentativas = 15;
            case 3 -> totalDeTentativas = 10;
            case 0 -> System.out.println("Você saiu do Jogo. Adeus!");
            default -> System.out.println("Opção inválida. Tente novamente.");
        }
        // loop principal do jogo


        for (int i = 1; i <= totalDeTentativas; i++) {

            System.out.printf("\nTentativa %d de %d\n", i, totalDeTentativas);
            System.out.print("Chute um número: ");

            try {
                chute = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("\nErro: " + e);
                System.out.println("\n\nDigite apenas números, por favor!");
                scanner.nextLine();
            }

            // tratando chute de numero negativo
            if (chute < 0) {
                System.out.println("Você não pode chutar números negativos!");
                i--;
                continue;
            }

            // verifica se acertou, foi maior ou menor
            acertou = chute == numeroSecreto;

            if (acertou) {
                break;
            } else if (chute > numeroSecreto) {
                System.out.println("\nSeu chute foi +MAIOR+ do que o número secreto!");
            } else {
                System.out.println("\nSeu chute foi -MENOR- do que o número secreto!");
            }

            // calcula a quantidade de pontos
            pontosPerdidos = (chute - numeroSecreto) / 2.0;
            pontos -= pontosPerdidos * -1.0;
        }
        // imprimindo mensagem de vitoria ou derrota
        System.out.println();
        if (acertou) {
            System.out.printf("\n\nVocê fez %.0f pontos. Até a próxima!\n\n", pontos);
            Imprimir.imprimirAcerto();
        } else {
            Imprimir.imprimirErro();
        }
    }


}
