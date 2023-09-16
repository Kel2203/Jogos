import jogo.Adivinhacao;
import jogo.Forca;
import jogo.Memoria;
import menu.MenuJogo;
import menu.MenuMain;

import java.util.Scanner;
import java.util.Stack;

public class MenuPrincipal {
    public static void main(String[] args) {

        Adivinhacao adivinha = new Adivinhacao();
        Memoria memoria = new Memoria();
        Forca forca = new Forca();
        MenuMain menuPrincipal = new MenuMain();
        MenuJogo menuJogo = new MenuJogo();
        Scanner sc = new Scanner(System.in);


        menuPrincipal.menu();
        int opcao;

        do {
            System.out.print("ESCOLHA UMA OPÇÃO DE JOGO 0, 1, 2 ou 3: ");
            opcao = sc.nextInt();

            switch (opcao){
                case 1 :
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
                    System.out.println("Programa encerrado!");
                    break;
                default :
                    System.out.println("Algo de errado não esta certo!");
            }

        }while (opcao != 0);

    }
}