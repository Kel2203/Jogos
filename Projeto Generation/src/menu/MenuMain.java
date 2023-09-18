package menu;

import jogo.util.Cores;

public class MenuMain implements Menu{

    @Override
    public void menu() {

        System.out.println(Cores.TEXT_RED +
                "\n▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄");

        System.out.println(Cores.TEXT_CYAN_BOLD+"\n1 - Adivinhação");
        System.out.println("2 - Forca");
        System.out.println("3 - Jogo da Memória ");
        System.out.println("0 - Sair\n");

        System.out.println(Cores.TEXT_RED +
                "▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄▀▄"+ Cores.TEXT_RESET);
    }
}
