package menu;

import jogo.util.Cores;

public class MenuJogo implements Menu{

    @Override
    public void menu() {
        System.out.println(Cores.TEXT_PURPLE_BOLD + "\n\n◆ ▬▬▬▬▬▬▬▬▬▬▬▬ ❴✪❵ ▬▬▬▬▬▬▬▬▬▬▬▬ ◆");
        
        System.out.println(Cores.TEXT_CYAN_BOLD
                +"Escolha o nível de dificuldade:");
        System.out.println("1. Fácil");
        System.out.println("2. Médio");
        System.out.println("3. Difícil");
        System.out.println("0. Sair");
        
        System.out.println(Cores.TEXT_PURPLE_BOLD +
                "◆ ▬▬▬▬▬▬▬▬▬▬▬▬ ❴✪❵ ▬▬▬▬▬▬▬▬▬▬▬▬ ◆"+Cores.TEXT_RESET);
    }
}
