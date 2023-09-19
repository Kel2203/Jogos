import jogo.Adivinhacao;
import jogo.Forca;
import jogo.Memoria;
import jogo.util.Cores;
import menu.MenuJogo;
import menu.MenuMain;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Adivinhacao adivinha = new Adivinhacao();
        Memoria memoria = new Memoria();
        Forca forca = new Forca();
        MenuMain menuPrincipal = new MenuMain();
        MenuJogo menuJogo = new MenuJogo();
        Scanner sc = new Scanner(System.in);


        menuPrincipal.menu();
        int opcao = 0;

        do {

            try {
                System.out.print(Cores.TEXT_CYAN_BOLD + "\n\nESCOLHA UMA OPÇÃO DE JOGO 0, 1, 2 ou 3: ");
                opcao = sc.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("\nERRO: " + e);
                System.out.println("\nDigite apenas números, por favor!" + Cores.TEXT_RESET);
                sc.nextLine();
            }


            switch (opcao) {
                case 1:
                    adivinha.nome();
                    adivinha.cabecalho();
                    menuJogo.menu();
                    adivinha.jogar();
                    break;
                case 2:
                    forca.nome();
                    forca.cabecalho();
                    forca.jogar();
                    break;
                case 3:
                    memoria.nome();
                    memoria.cabecalho();
                    menuJogo.menu();
                    memoria.jogar();
                    break;
                case 0:
                    System.out.println(Cores.TEXT_CYAN_BOLD + "\n\nPrograma encerrado!");
                    break;
                default:
                    System.out.println("\n\nAlgo de errado não esta certo!" + Cores.TEXT_RESET);
            }


        } while (opcao != 0);

    }
}