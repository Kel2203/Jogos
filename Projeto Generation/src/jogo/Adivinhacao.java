package jogo;

import java.util.Random;
import java.util.Scanner;

public class Adivinhacao extends Jogo {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();


   private int escolha, chute, totalDeTentativas,  numeroSecreto = random.nextInt(101);
    private boolean acertou;
   private double pontosPerdidos, pontos = 1000.00;
    @Override
    public void nome(){
        System.out.println("Adivinhação");
    }

    @Override
    public void cabecalho(){
        System.out.println("\n\n");
        System.out.println("          P  /_\\  P                              ");
        System.out.println("         /_\\_|_|_/_\\                            ");
        System.out.println("     n_n | ||. .|| | n_n         Bem vinde ao     ");
        System.out.println("     |_|_|nnnn nnnn|_|_|     Jogo de Adivinhação! ");
        System.out.println("    |\" \"  |  |_|  |\"  \" |                     ");
        System.out.println("    |_____| ' _ ' |_____|                         ");
        System.out.println("          \\__|_|__/                              ");
        System.out.println("\n\n");
    }




    @Override
    public void jogar() {

            System.out.println("Escolha: ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1 -> totalDeTentativas = 20;
                case 2 -> totalDeTentativas = 15;
                case 3 -> totalDeTentativas = 10;
                case 0 -> System.out.println("Você escolheu sair do Jogo. Adeus!");
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
            // loop principal do jogo
            for (int i = 1; i <= totalDeTentativas; i++) {

            System.out.printf("Tentativa %d de %d\n", i, totalDeTentativas);

            System.out.print("Chute um número: ");
            chute = scanner.nextInt();


            // tratando chute de numero negativo
            if (chute < 0) {
                System.out.println("Você não pode chutar números negativos!");
                i--;
                continue;
            }
            // verifica se acertou, foi maior ou menor
            acertou = chute == numeroSecreto;

            if(acertou) {
                break;
            } else if(chute > numeroSecreto) {
                System.out.println("Seu chute foi maior do que o número secreto!");
            } else {
                System.out.println("Seu chute foi menor do que o número secreto!");
            }

            // calcula a quantidade de pontos
           pontosPerdidos  = (chute - numeroSecreto) / 2.0;
           pontos -= pontosPerdidos * -1.0;
        }
        // imprimindo mensagem de vitoria ou derrota
        System.out.println();
        if(acertou) {



            System.out.println("             OOOOOOOOOOO               ");
            System.out.println("         OOOOOOOOOOOOOOOOOOO           ");
            System.out.println("      OOOOOO  OOOOOOOOO  OOOOOO        ");
            System.out.println("    OOOOOO      OOOOO      OOOOOO      ");
            System.out.println("  OOOOOOOO  #   OOOOO  #   OOOOOOOO    ");
            System.out.println(" OOOOOOOOOO    OOOOOOO    OOOOOOOOOO   ");
            System.out.println("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO  ");
            System.out.println("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO  ");
            System.out.println("OOOO  OOOOOOOOOOOOOOOOOOOOOOOOO  OOOO  ");
            System.out.println(" OOOO  OOOOOOOOOOOOOOOOOOOOOOO  OOOO   ");
            System.out.println("  OOOO   OOOOOOOOOOOOOOOOOOOO  OOOO    ");
            System.out.println("    OOOOO   OOOOOOOOOOOOOOO   OOOO     ");
            System.out.println("      OOOOOO   OOOOOOOOO   OOOOOO      ");
            System.out.println("         OOOOOO         OOOOOO         ");
            System.out.println("             OOOOOOOOOOOO              ");
            System.out.println("Parabéns! Você acertou!");
            System.out.printf("Você fez %.2f pontos. Até a próxima!\n\n", pontos);
        } else {


            System.out.println("       \\|/ ____ \\|/    ");
            System.out.println("        @~/ ,. \\~@      ");
            System.out.println("       /_( \\__/ )_\\    ");
            System.out.println("          \\__U_/        ");

            System.out.println("Você perdeu! Tente novamente!");
        }


    }
    }