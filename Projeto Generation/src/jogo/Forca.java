package jogo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Forca extends Jogo{
    protected String palavraSecreta;
    protected String palavraEmbaralhada;
    protected int erros;
    @Override
    public void nome(){
        System.out.println("JOGO DA FORCA");
    }

    @Override
    public void cabecalho(){

              System.out.println("\n\n");
System.out.println("───────────▒▒▒▒▒▒▒▒                                                    ");
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
System.out.println("───────────────▓▓▓▓▓▓▓▓                                                ");
            System.out.println("\n\n");

        System.out.println("╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳");
        System.out.println("\nVocê terá que acertar a palavra.");
    }

    @Override
    public void jogar(){

            palavraSecreta = gerarPalavraSecreta();
            palavraEmbaralhada = palavraSecreta.replaceAll(".", "*");
            erros = 0;

        while (erros < 6) {
            System.out.println(palavraEmbaralhada);
            // Solicita uma entrada do usuário
            System.out.println("Digite uma letra: ");
            String letra = new Scanner(System.in).next().toLowerCase();

            boolean letraEncontrada = false;

            // Verifica se a letra está na palavra secreta
            for (int i = 0; i < palavraSecreta.length(); i++) {
                if (palavraSecreta.charAt(i) == letra.charAt(0)) {
                    // Substitui o asterisco pela letra correta na posição correta
                    palavraEmbaralhada = palavraEmbaralhada.substring(0, i) + letra + palavraEmbaralhada.substring(i + 1);
                    letraEncontrada = true;
                }
            }

            if (!letraEncontrada) {
                // Adiciona um erro
                erros++;
            }

            // Verifica se o jogo acabou
            if (palavraEmbaralhada.equals(palavraSecreta)) {
                System.out.println("PARABÉNS, VOCÊ VENCEU!");
                System.out.println("_________________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶__________________");
                System.out.println("_____________¶¶¶________________¶¶¶_______________");
                System.out.println("___________¶¶______________________¶¶¶¶___________");
                System.out.println("_________¶¶¶__________________________¶¶¶_________");
                System.out.println("_______¶¶¶___________________¶¶¶¶_______¶¶________");
                System.out.println("_¶¶¶¶¶¶__¶¶¶¶¶¶¶¶¶¶¶¶¶_____¶¶¶__¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶__");
                System.out.println("__¶¶¶¶____¶¶¶¶¶¶¶¶¶_¶¶¶¶¶¶¶¶¶____¶¶¶¶¶¶¶¶¶¶¶¶¶¶___");
                System.out.println("___¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶___¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶____¶¶¶____");
                System.out.println("__¶___¶¶¶¶¶¶¶¶______¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶______¶¶__¶__");
                System.out.println("_¶¶___¶¶¶¶¶¶¶¶¶______¶¶¶¶¶¶¶¶¶¶¶¶¶¶_______¶¶__¶¶__");
                System.out.println("¶______¶¶¶¶¶¶¶¶_____¶¶¶___¶¶¶¶¶¶¶¶¶___¶¶¶¶¶____¶__");
                System.out.println("¶__________¶¶¶¶¶¶¶¶¶¶¶______¶¶¶¶¶¶¶¶¶¶¶__¶______¶¶");
                System.out.println("¶_______________________________________________¶¶");
                System.out.println("¶________¶¶_____________________________________¶¶");
                System.out.println("¶______¶¶¶¶_________________________¶¶¶¶________¶¶");
                System.out.println("¶_____¶__¶¶_________________________¶¶¶¶________¶¶");
                System.out.println("¶_________¶¶¶______________________¶¶___________¶¶");
                System.out.println("¶___________¶¶¶__________________¶¶¶____________¶¶");
                System.out.println("¶¶____________¶¶¶¶____________¶¶¶¶_____________¶__");
                System.out.println("_¶¶______________¶¶¶¶¶¶¶¶¶¶¶¶¶¶________________¶__");
                System.out.println("__¶___________________________________________¶¶__");
                System.out.println("___¶¶________________________________________¶¶___");
                System.out.println("____¶¶______________________________________¶¶____");
                System.out.println("_____¶¶___________________________________¶¶______");
                System.out.println("_______¶¶_______________________________¶¶¶_______");
                System.out.println("_________¶¶___________________________¶¶¶_________");
                System.out.println("__________¶¶¶¶_____________________¶¶_____________");
                System.out.println("______________¶¶¶¶_____________¶¶¶¶¶______________");
                System.out.println("___________________¶¶¶¶¶¶¶¶¶¶¶¶___________________");

                break; // Encerra o loop, pois o jogo foi vencido
            }
        }

        if (erros == 6) {
            System.out.println("VOCÊ PERDEU!");
            System.out.println("A palavra secreta era -> " + palavraSecreta);
            System.out.println("──────────────────────────────────");
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
            System.out.println("──────────────────────────────────");
        }
    }
    private String gerarPalavraSecreta() {
        // Obtém uma lista de palavras
        List<String> palavras = new ArrayList<>();
        palavras.add("tucano");
        palavras.add("vermelho");
        palavras.add("copo");
        palavras.add("gato");
        palavras.add("amarelo");
        palavras.add("armario");
        palavras.add("cachorro");
        palavras.add("verde");
        palavras.add("chinelo");
        palavras.add("vaca");
        palavras.add("cinza");
        palavras.add("microondas");
        palavras.add("galo");
        palavras.add("branco");
        palavras.add("janela");
        palavras.add("galinha");
        palavras.add("preto");
        palavras.add("cama");
        palavras.add("ornintorrinco");
        palavras.add("lilas");
        palavras.add("toalha");
        palavras.add("peixe");


        // Gera uma palavra secreta aleatória
        int index = new Random().nextInt(palavras.size());
        return palavras.get(index);
    }
}
