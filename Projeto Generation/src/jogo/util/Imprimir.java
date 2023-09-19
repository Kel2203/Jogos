package jogo.util;

import jogo.util.Cores;

public class Imprimir {
    public static final void imprimirAcerto() {
        System.out.println(Cores.TEXT_YELLOW + "\n\n __________________________________________________");
        System.out.println(" _________________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶________________");
        System.out.println("____________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶___________");
        System.out.println("___________¶¶¶¶¶¶¶_______________¶¶¶¶¶¶¶__________");
        System.out.println("________¶¶¶¶¶_________________________¶¶¶¶¶_______");
        System.out.println("_______¶¶¶¶¶___________________________¶¶¶¶¶______");
        System.out.println("_____¶¶¶¶_________________________________¶¶¶¶____");
        System.out.println("_____¶¶¶¶_________________________________¶¶¶¶____");
        System.out.println("_____¶¶¶¶_____¶¶¶¶¶¶¶_________¶¶¶¶¶¶¶_____¶¶¶¶____");
        System.out.println("____¶¶¶_______¶¶¶¶¶¶¶_________¶¶¶¶¶¶¶_______¶¶¶¶¶¶");
        System.out.println("__¶¶¶¶________¶¶¶¶¶¶¶_________¶¶¶¶¶¶¶_________¶¶¶¶");
        System.out.println("__¶¶¶¶________________________________________¶¶¶¶");
        System.out.println("__¶¶¶¶________________________________________¶¶¶¶");
        System.out.println("__¶¶¶¶________________________________________¶¶¶¶");
        System.out.println("__¶¶¶¶________________________________________¶¶¶¶");
        System.out.println("__¶¶¶¶________________________________________¶¶¶¶");
        System.out.println("__¶¶¶¶______¶_________________________¶_______¶¶¶¶");
        System.out.println("__¶¶¶¶_____¶¶¶¶_____________________¶¶¶¶______¶¶¶¶");
        System.out.println("____¶¶¶_____¶¶¶¶¶_________________¶¶¶¶¶_____¶¶¶¶¶¶");
        System.out.println("_____¶¶¶¶_____¶¶¶¶_______________¶¶¶¶_____¶¶¶¶____");
        System.out.println("_____¶¶¶¶_______¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_______¶¶¶¶____");
        System.out.println("_____¶¶¶¶_________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_________¶¶¶¶____");
        System.out.println("_______¶¶¶¶¶___________________________¶¶¶¶¶______");
        System.out.println("________¶¶¶¶¶_________________________¶¶¶¶¶_______");
        System.out.println("___________¶¶¶¶¶¶¶_______________¶¶¶¶¶¶¶__________");
        System.out.println("____________¶¶¶¶¶¶_______________¶¶¶¶¶¶___________");
        System.out.println("__________________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_________________" + Cores.TEXT_RESET);
        System.out.println("\n\n");
    }

    public static final void imprimirErro() {
        System.out.println(Cores.TEXT_RED_BOLD + "\nVOCÊ PERDEU!");

        System.out.println(Cores.TEXT_RED_BOLD + "\n\n──────────────────────────────────");
        System.out.println("─────────▄▄───────────────────▄▄──");
        System.out.println("──────────▀█───────────────────▀█─");
        System.out.println("──────────▄█───────────────────▄█─");
        System.out.println("──█████████▀───────────█████████▀─");
        System.out.println("───▄██████▄─────────────▄██████▄──");
        System.out.println("─▄██▀────▀██▄─────────▄██▀────▀██▄");
        System.out.println("─██────────██─────────██────────██");
        System.out.println("─██───██───██─────────██───██───██");
        System.out.println("─██────────██─────────██────────██");
        System.out.println("──██▄────▄██───────────██▄────▄██─");
        System.out.println("───▀██████▀─────────────▀██████▀──");
        System.out.println("──────────────────────────────────");
        System.out.println("──────────────────────────────────");
        System.out.println("──────────────────────────────────");
        System.out.println("───────────█████████████──────────");
        System.out.println("──────────────────────────────────");
        System.out.println("──────────────────────────────────" + Cores.TEXT_RESET);
    }


    public static final void imprimirCabecalhoForca() {

        System.out.println("\n\n");
        System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + "───────────▒▒▒▒▒▒▒▒                                                    ");
        System.out.println("─────────▒▒▒──────▒▒▒                                                  ");
        System.out.println("────────▒▒───▒▒▒▒──▒░▒                                                 ");
        System.out.println("───────▒▒───▒▒──▒▒──▒░▒                                                ");
        System.out.println("──────▒▒░▒──────▒▒──▒░▒                                                ");
        System.out.println("───────▒▒░▒────▒▒──▒░▒                                                 ");
        System.out.println("─────────▒▒▒▒▒▒▒───▒▒                                                  ");
        System.out.println("─────────────────▒▒▒                                                   ");
        System.out.println("─────▒▒▒▒────────▒▒                                                    ");
        System.out.println("───▒▒▒░░▒▒▒─────▒▒──▓▓▓▓▓▓▓▓                                           ");
        System.out.println("──▒▒─────▒▒▒────▒▒▓▓▓▓▓░░░░░▓▓──▓▓▓▓                                   ");
        System.out.println("─▒───▒▒────▒▒─▓▓▒░░░░░░░░░█▓▒▓▓▓▓░░▓▓▓                                 ");
        System.out.println("▒▒──▒─▒▒───▓▒▒░░▒░░░░░████▓▓▒▒▓░░░░░░▓▓        SEJA BEM VINDE AO       ");
        System.out.println("░▒▒───▒──▓▓▓░▒░░░░░░█████▓▓▒▒▒▒▓▓▓▓▓░░▓▓         JOGO DA FORCA!        ");
        System.out.println("──▒▒▒▒──▓▓░░░░░░███████▓▓▓▒▒▒▒▒▓───▓▓░▓▓                               ");
        System.out.println("──────▓▓░░░░░░███████▓▓▓▒▒▒▒▒▒▒▓───▓░░▓▓                               ");
        System.out.println("─────▓▓░░░░░███████▓▓▓▒▒▒▒▒▒▒▒▒▓▓▓▓░░▓▓                                ");
        System.out.println("────▓▓░░░░██████▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▓░░░░▓▓                                 ");
        System.out.println("────▓▓▓░████▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▓                                   ");
        System.out.println("─────▓▓▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓                                       ");
        System.out.println("─────▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓                                       ");
        System.out.println("──────▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓                                        ");
        System.out.println("───────▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓                                         ");
        System.out.println("─────────▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓                                           ");
        System.out.println("───────────▓▓▓▓▓▓▒▒▒▒▒▓▓▓▓                                             ");
        System.out.println("───────────────▓▓▓▓▓▓▓▓                                                " + Cores.TEXT_RESET);
        System.out.println("\n\n");

        System.out.println(Cores.TEXT_YELLOW_BOLD_BRIGHT + "╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳");
        System.out.println("\nVocê terá que acertar a palavra.");
    }

    public static final void imprimirCabecalhoAdivinhação() {
        System.out.println("\n\n");
        System.out.println(Cores.TEXT_RED_BOLD + "          P  " + Cores.TEXT_YELLOW + "/_\\" + Cores.TEXT_RED_BOLD + "  P");
        System.out.println(Cores.TEXT_YELLOW + "         /_\\_|_|_/_\\                            ");
        System.out.println("     n_n | ||. .|| | n_n         Bem vinde ao     ");
        System.out.println("     |_|_|nnnn nnnn|_|_|     Jogo de Adivinhação! ");
        System.out.println("    |\" \"  |  |_|  |\"  \" |                     ");
        System.out.println("    |_____| ' _ ' |_____|                         ");
        System.out.println("          \\__|_|__/                              " + Cores.TEXT_RESET);
        System.out.println("\n\n");
    }

    public static final void imprimirCabecalhoMemoria() {
        System.out.println("\n\n");
        System.out.println(Cores.TEXT_WHITE +
                "_______________________¶¶¶¶___¶¶¶¶¶               ");
        System.out.println("_____________________¶¶____¶¶¶____¶¶__¶¶¶         ");
        System.out.println("___________________¶¶___¶¶¶____¶¶¶¶¶¶¶___¶¶       ");
        System.out.println("_________________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶");
        System.out.println("______________¶¶¶¶¶__" + Cores.TEXT_PURPLE_BRIGHT + "¶" + Cores.TEXT_WHITE + "__________________________¶¶");
        System.out.println("___________¶¶¶¶__¶¶__" + Cores.TEXT_PURPLE_BRIGHT + "¶" + Cores.TEXT_WHITE + "___________________________¶");
        System.out.println("_________¶¶¶_¶¶__¶__" + Cores.TEXT_PURPLE_BRIGHT + "¶¶¶" + Cores.TEXT_WHITE + "__________________________¶");
        System.out.println("______¶¶¶_¶¶_¶¶¶_¶_" + Cores.TEXT_PURPLE_BRIGHT + "¶¶" + Cores.TEXT_WHITE + "_" + Cores.TEXT_PURPLE_BRIGHT + "¶¶" + Cores.TEXT_WHITE + "_________" + Cores.TEXT_PURPLE_BRIGHT + "¶" + Cores.TEXT_WHITE + "_______________¶");
        System.out.println("_____¶_¶¶__¶_¶_¶¶¶¶_" + Cores.TEXT_PURPLE_BRIGHT + "¶¶¶" + Cores.TEXT_WHITE + "__________" + Cores.TEXT_PURPLE_BRIGHT + "¶¶" + Cores.TEXT_WHITE + "______________¶");
        System.out.println("___¶¶¶_¶¶¶¶¶_¶¶¶¶¶¶_" + Cores.TEXT_PURPLE_BRIGHT + "¶¶¶" + Cores.TEXT_WHITE + "_________" + Cores.TEXT_PURPLE_BRIGHT + "¶¶¶" + Cores.TEXT_WHITE + "______________¶");
        System.out.println("_¶¶__¶¶¶¶¶¶¶¶_¶¶_¶¶____________" + Cores.TEXT_PURPLE_BRIGHT + "¶¶¶¶¶" + Cores.TEXT_WHITE + "_____________¶");
        System.out.println("¶_¶¶__¶__¶¶¶¶____¶¶___________" + Cores.TEXT_PURPLE_BRIGHT + "¶¶¶¶¶¶¶" + Cores.TEXT_WHITE + "____________¶");
        System.out.println("¶__¶¶¶¶¶¶¶¶¶¶____¶¶__________" + Cores.TEXT_PURPLE_BRIGHT + "¶¶¶¶¶¶¶¶¶¶" + Cores.TEXT_WHITE + "__________¶");
        System.out.println("_¶¶¶_¶_¶¶___¶¶___¶¶________" + Cores.TEXT_PURPLE_BRIGHT + "¶¶¶¶¶¶¶¶¶¶¶¶¶" + Cores.TEXT_WHITE + "_________¶");
        System.out.println("__¶¶_¶¶_¶___¶¶___¶¶______" + Cores.TEXT_PURPLE_BRIGHT + "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶" + Cores.TEXT_WHITE + "_______¶");
        System.out.println("___¶¶____¶___¶___¶¶____" + Cores.TEXT_PURPLE_BRIGHT + "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶" + Cores.TEXT_WHITE + "_____¶    SEJA BEM VINDE AO ");
        System.out.println("____¶¶___¶¶__¶¶__¶¶___" + Cores.TEXT_PURPLE_BRIGHT + "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶" + Cores.TEXT_WHITE + "___¶     JOGO DA MEMÓRIA! ");
        System.out.println("_____¶¶___¶__¶¶__¶¶__" + Cores.TEXT_PURPLE_BRIGHT + "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶" + Cores.TEXT_WHITE + "__¶                      ");
        System.out.println("______¶¶___¶__¶__¶¶_" + Cores.TEXT_PURPLE_BRIGHT + "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶" + Cores.TEXT_WHITE + "_¶                      ");
        System.out.println("_______¶¶__¶¶_¶__¶¶_" + Cores.TEXT_PURPLE_BRIGHT + "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶" + Cores.TEXT_WHITE + "_¶                      ");
        System.out.println("________¶¶__¶_¶¶_¶¶__" + Cores.TEXT_PURPLE_BRIGHT + "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶" + Cores.TEXT_WHITE + "_¶                      ");
        System.out.println("_________¶¶__¶_¶_¶¶__" + Cores.TEXT_PURPLE_BRIGHT + "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶" + Cores.TEXT_WHITE + "__¶                      ");
        System.out.println("__________¶¶_¶¶¶_¶¶___" + Cores.TEXT_PURPLE_BRIGHT + "¶¶¶¶¶¶¶¶¶" + Cores.TEXT_WHITE + "__" + Cores.TEXT_PURPLE_BRIGHT + "¶¶" + Cores.TEXT_WHITE + "__" + Cores.TEXT_PURPLE_BRIGHT + "¶¶¶¶¶¶¶¶¶" + Cores.TEXT_WHITE + "___¶                      ");
        System.out.println("____________¶_¶¶_¶¶_____" + Cores.TEXT_PURPLE_BRIGHT + "¶¶¶¶¶" + Cores.TEXT_WHITE + "____" + Cores.TEXT_PURPLE_BRIGHT + "¶¶" + Cores.TEXT_WHITE + "____" + Cores.TEXT_PURPLE_BRIGHT + "¶¶¶¶¶" + Cores.TEXT_WHITE + "_____¶                      ");
        System.out.println("_____________¶_¶¶¶¶___________" + Cores.TEXT_PURPLE_BRIGHT + "¶¶¶¶¶¶¶¶" + Cores.TEXT_WHITE + "___________¶                      ");
        System.out.println("______________¶¶¶¶¶__________" + Cores.TEXT_PURPLE_BRIGHT + "¶¶¶¶¶¶¶¶¶¶" + Cores.TEXT_WHITE + "______" + Cores.TEXT_PURPLE_BRIGHT + "¶¶" + Cores.TEXT_WHITE + "__¶                      ");
        System.out.println("_______________¶¶¶____________" + Cores.TEXT_PURPLE_BRIGHT + "¶¶¶¶¶¶¶¶" + Cores.TEXT_WHITE + "_______" + Cores.TEXT_PURPLE_BRIGHT + "¶¶¶" + Cores.TEXT_WHITE + "_¶                      ");
        System.out.println("________________¶¶__________________________" + Cores.TEXT_PURPLE_BRIGHT + "¶¶" + Cores.TEXT_WHITE + "_" + Cores.TEXT_PURPLE_BRIGHT + "¶" + Cores.TEXT_WHITE + "_¶                      ");
        System.out.println("_________________¶¶__________________________" + Cores.TEXT_PURPLE_BRIGHT + "¶¶" + Cores.TEXT_WHITE + "__¶");
        System.out.println("_________________¶¶__________________________" + Cores.TEXT_PURPLE_BRIGHT + "¶¶¶" + Cores.TEXT_WHITE + "_¶                      ");
        System.out.println("__________________¶¶__¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶                      ");
        System.out.println("__________________¶¶¶¶¶¶¶¶¶¶¶¶                                          ");
        System.out.println("_____________________¶¶¶¶¶¶                                             ");
        System.out.println("\n\n");
        System.out.println("╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳" + Cores.TEXT_RESET);
        System.out.println("\n\nVocê terá 5 segundos para memorizar uma sequência de números.");
    }

    public static final void time() {
        System.out.println(Cores.TEXT_CYAN_BOLD_BRIGHT + "_¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶");
        System.out.println("_¶¶___________________________________¶¶");
        System.out.println("_¶¶___________________________________¶¶");
        System.out.println("__¶¶_________________________________¶¶_");
        System.out.println("__¶¶_________________________________¶¶_");
        System.out.println("___¶¶_______________________________¶¶__");
        System.out.println("___¶¶______________________________¶¶___");
        System.out.println("____¶¶¶__________________________¶¶¶____");
        System.out.println("_____¶¶¶¶_" + Cores.TEXT_YELLOW + "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶" + Cores.TEXT_CYAN_BOLD_BRIGHT + "_¶¶¶¶_____");
        System.out.println("_______¶¶¶¶_" + Cores.TEXT_YELLOW + "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶" + Cores.TEXT_CYAN_BOLD_BRIGHT + "_¶¶¶¶_______");
        System.out.println("_________¶¶¶¶_" + Cores.TEXT_YELLOW + "¶¶¶¶¶¶¶¶¶¶¶¶" + Cores.TEXT_CYAN_BOLD_BRIGHT + "_¶¶¶¶_________");
        System.out.println("___________¶¶¶¶¶_" + Cores.TEXT_YELLOW + "¶¶¶¶¶¶¶" + Cores.TEXT_CYAN_BOLD_BRIGHT + "_¶¶¶¶___________");
        System.out.println("______________¶¶¶¶_" + Cores.TEXT_YELLOW + "¶¶¶" + Cores.TEXT_CYAN_BOLD_BRIGHT + "_¶¶¶______________");
        System.out.println("________________¶¶¶_" + Cores.TEXT_YELLOW + "¶" + Cores.TEXT_CYAN_BOLD_BRIGHT + "_¶¶________________");
        System.out.println("_________________¶¶¶_¶¶_________________");
        System.out.println("__________________¶¶_¶¶_________________");
        System.out.println("__________________¶¶_¶__________________");
        System.out.println("__________________¶¶_¶¶_________________");
        System.out.println("________________¶¶¶_" + Cores.TEXT_YELLOW + "¶" + Cores.TEXT_CYAN_BOLD_BRIGHT + "_¶¶¶_______________");
        System.out.println("_____________¶¶¶¶¶__" + Cores.TEXT_YELLOW + "¶" + Cores.TEXT_CYAN_BOLD_BRIGHT + "__¶¶¶¶¶____________");
        System.out.println("__________¶¶¶¶¶_____" + Cores.TEXT_YELLOW + "¶" + Cores.TEXT_CYAN_BOLD_BRIGHT + "_____¶¶¶¶__________");
        System.out.println("________¶¶¶¶________" + Cores.TEXT_YELLOW + "¶" + Cores.TEXT_CYAN_BOLD_BRIGHT + "_______¶¶¶¶¶_______");
        System.out.println("_______¶¶¶__________" + Cores.TEXT_YELLOW + "¶" + Cores.TEXT_CYAN_BOLD_BRIGHT + "__________¶¶¶¶_____");
        System.out.println("_____¶¶¶____________" + Cores.TEXT_YELLOW + "¶" + Cores.TEXT_CYAN_BOLD_BRIGHT + "____________¶¶¶____");
        System.out.println("____¶¶¶_____________" + Cores.TEXT_YELLOW + "¶" + Cores.TEXT_CYAN_BOLD_BRIGHT + "______________¶¶___");
        System.out.println("___¶¶¶______________" + Cores.TEXT_YELLOW + "¶" + Cores.TEXT_CYAN_BOLD_BRIGHT + "_______________¶¶__");
        System.out.println("___¶¶_______________" + Cores.TEXT_YELLOW + "¶" + Cores.TEXT_CYAN_BOLD_BRIGHT + "________________¶¶_");
        System.out.println("__¶¶________________" + Cores.TEXT_YELLOW + "¶" + Cores.TEXT_CYAN_BOLD_BRIGHT + "________________¶¶_");
        System.out.println("__¶¶_______________" + Cores.TEXT_YELLOW + "¶¶¶" + Cores.TEXT_CYAN_BOLD_BRIGHT + "________________¶_");
        System.out.println("__¶¶_" + Cores.TEXT_YELLOW + "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶" + Cores.TEXT_CYAN_BOLD_BRIGHT + "_¶¶");
        System.out.println("__¶¶_" + Cores.TEXT_YELLOW + "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶" + Cores.TEXT_CYAN_BOLD_BRIGHT + "_¶¶");
        System.out.println("__¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶" + Cores.TEXT_RESET);

        System.out.println("\n\nDigite a sequência que você lembra (ex: 1 2 3): \n\n");
    }
}
