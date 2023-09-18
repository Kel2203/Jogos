package jogo;



import jogo.util.Cores;

import java.util.*;
public class Memoria extends Jogo{

    private static List<Integer> gerarSequencia(int length) {
        List<Integer> sequencia = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            sequencia.add(random.nextInt(10)); // Números aleatórios de 0 a 9
        }
        return sequencia;
    }
    // Função para exibir a sequência por um curto período
    private static void exibirSequencia(List<Integer> sequencia) {
        for (Integer num : sequencia) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Função para limpar a tela (funciona apenas no console)


    @Override
    public void nome(){
        System.out.println("Jogo da Memória");
    }
    @Override
    public void cabecalho(){

        System.out.println("\n\n");
        System.out.println(Cores.TEXT_WHITE+
                           "_______________________¶¶¶¶___¶¶¶¶¶               "                      );
        System.out.println("_____________________¶¶____¶¶¶____¶¶__¶¶¶         "                      );
        System.out.println("___________________¶¶___¶¶¶____¶¶¶¶¶¶¶___¶¶       "                      );
        System.out.println("_________________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶"                      );
        System.out.println("______________¶¶¶¶¶__"+Cores.TEXT_PURPLE_BRIGHT+"¶"+Cores.TEXT_WHITE+"__________________________¶¶"                      );
        System.out.println("___________¶¶¶¶__¶¶__"+Cores.TEXT_PURPLE_BRIGHT+"¶"+Cores.TEXT_WHITE+"___________________________¶"                      );
        System.out.println("_________¶¶¶_¶¶__¶__"+Cores.TEXT_PURPLE_BRIGHT+"¶¶¶"+Cores.TEXT_WHITE+"__________________________¶"                      );
        System.out.println("______¶¶¶_¶¶_¶¶¶_¶_"+Cores.TEXT_PURPLE_BRIGHT+"¶¶"+Cores.TEXT_WHITE+"_"+Cores.TEXT_PURPLE_BRIGHT+"¶¶"+Cores.TEXT_WHITE+"_________"+Cores.TEXT_PURPLE_BRIGHT+"¶"+Cores.TEXT_WHITE+"_______________¶"                      );
        System.out.println("_____¶_¶¶__¶_¶_¶¶¶¶_"+Cores.TEXT_PURPLE_BRIGHT+"¶¶¶"+Cores.TEXT_WHITE+"__________"+Cores.TEXT_PURPLE_BRIGHT+"¶¶"+Cores.TEXT_WHITE+"______________¶"                      );
        System.out.println("___¶¶¶_¶¶¶¶¶_¶¶¶¶¶¶_"+Cores.TEXT_PURPLE_BRIGHT+"¶¶¶"+Cores.TEXT_WHITE+"_________"+Cores.TEXT_PURPLE_BRIGHT+"¶¶¶"+Cores.TEXT_WHITE+"______________¶"                      );
        System.out.println("_¶¶__¶¶¶¶¶¶¶¶_¶¶_¶¶____________"+Cores.TEXT_PURPLE_BRIGHT+"¶¶¶¶¶"+Cores.TEXT_WHITE+"_____________¶"                      );
        System.out.println("¶_¶¶__¶__¶¶¶¶____¶¶___________"+Cores.TEXT_PURPLE_BRIGHT+"¶¶¶¶¶¶¶"+Cores.TEXT_WHITE+"____________¶"                      );
        System.out.println("¶__¶¶¶¶¶¶¶¶¶¶____¶¶__________"+Cores.TEXT_PURPLE_BRIGHT+"¶¶¶¶¶¶¶¶¶¶"+Cores.TEXT_WHITE+"__________¶"                      );
        System.out.println("_¶¶¶_¶_¶¶___¶¶___¶¶________"+Cores.TEXT_PURPLE_BRIGHT+"¶¶¶¶¶¶¶¶¶¶¶¶¶"+Cores.TEXT_WHITE+"_________¶"                      );
        System.out.println("__¶¶_¶¶_¶___¶¶___¶¶______"+Cores.TEXT_PURPLE_BRIGHT+"¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶"+Cores.TEXT_WHITE+"_______¶"                      );
        System.out.println("___¶¶____¶___¶___¶¶____"+Cores.TEXT_PURPLE_BRIGHT+"¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶"+Cores.TEXT_WHITE+"_____¶    SEJA BEM VINDE AO ");
        System.out.println("____¶¶___¶¶__¶¶__¶¶___"+Cores.TEXT_PURPLE_BRIGHT+"¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶"+Cores.TEXT_WHITE+"___¶     JOGO DA MEMÓRIA! ");
        System.out.println("_____¶¶___¶__¶¶__¶¶__"+Cores.TEXT_PURPLE_BRIGHT+"¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶"+Cores.TEXT_WHITE+"__¶                      ");
        System.out.println("______¶¶___¶__¶__¶¶_"+Cores.TEXT_PURPLE_BRIGHT+"¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶"+Cores.TEXT_WHITE+"_¶                      ");
        System.out.println("_______¶¶__¶¶_¶__¶¶_"+Cores.TEXT_PURPLE_BRIGHT+"¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶"+Cores.TEXT_WHITE+"_¶                      ");
        System.out.println("________¶¶__¶_¶¶_¶¶__"+Cores.TEXT_PURPLE_BRIGHT+"¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶"+Cores.TEXT_WHITE+"_¶                      ");
        System.out.println("_________¶¶__¶_¶_¶¶__"+Cores.TEXT_PURPLE_BRIGHT+"¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶"+Cores.TEXT_WHITE+"__¶                      ");
        System.out.println("__________¶¶_¶¶¶_¶¶___"+Cores.TEXT_PURPLE_BRIGHT+"¶¶¶¶¶¶¶¶¶"+Cores.TEXT_WHITE+"__"+Cores.TEXT_PURPLE_BRIGHT+"¶¶"+Cores.TEXT_WHITE+"__"+Cores.TEXT_PURPLE_BRIGHT+"¶¶¶¶¶¶¶¶¶"+Cores.TEXT_WHITE+"___¶                      ");
        System.out.println("____________¶_¶¶_¶¶_____"+Cores.TEXT_PURPLE_BRIGHT+"¶¶¶¶¶"+Cores.TEXT_WHITE+"____"+Cores.TEXT_PURPLE_BRIGHT+"¶¶"+Cores.TEXT_WHITE+"____"+Cores.TEXT_PURPLE_BRIGHT+"¶¶¶¶¶"+Cores.TEXT_WHITE+"_____¶                      ");
        System.out.println("_____________¶_¶¶¶¶___________"+Cores.TEXT_PURPLE_BRIGHT+"¶¶¶¶¶¶¶¶"+Cores.TEXT_WHITE+"___________¶                      ");
        System.out.println("______________¶¶¶¶¶__________"+Cores.TEXT_PURPLE_BRIGHT+"¶¶¶¶¶¶¶¶¶¶"+Cores.TEXT_WHITE+"______"+Cores.TEXT_PURPLE_BRIGHT+"¶¶"+Cores.TEXT_WHITE+"__¶                      ");
        System.out.println("_______________¶¶¶____________"+Cores.TEXT_PURPLE_BRIGHT+"¶¶¶¶¶¶¶¶"+Cores.TEXT_WHITE+"_______"+Cores.TEXT_PURPLE_BRIGHT+"¶¶¶"+Cores.TEXT_WHITE+"_¶                      ");
        System.out.println("________________¶¶__________________________"+Cores.TEXT_PURPLE_BRIGHT+"¶¶"+Cores.TEXT_WHITE+"_"+Cores.TEXT_PURPLE_BRIGHT+"¶"+Cores.TEXT_WHITE+"_¶                      ");
        System.out.println("_________________¶¶__________________________"+Cores.TEXT_PURPLE_BRIGHT+"¶¶"+Cores.TEXT_WHITE+"__¶");
        System.out.println("_________________¶¶__________________________"+Cores.TEXT_PURPLE_BRIGHT+"¶¶¶"+Cores.TEXT_WHITE+"_¶                      ");
        System.out.println("__________________¶¶__¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶                      ");
        System.out.println("__________________¶¶¶¶¶¶¶¶¶¶¶¶                                          ");
        System.out.println("_____________________¶¶¶¶¶¶                                             ");
        System.out.println("\n\n");
        System.out.println("╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳" + Cores.TEXT_RESET);
        System.out.println("\n\nVocê terá 5 segundos para memorizar uma sequência de números.");
    }

    @Override
    public void jogar() {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
 
        try {
        	System.out.print("Escolha: ");
           escolha = scanner.nextInt();
        } catch(InputMismatchException e){
        	System.err.println("Erro: "+ e);
        	System.out.println("\nDigite apenas números, por favor!");
            scanner.nextLine();
        }
            int sequenciaLength = 0;
            int tempoLimite = 5000; //
            switch (escolha) {
                case 1 -> sequenciaLength = 3;
                case 2 -> sequenciaLength = 5;
                case 3 -> sequenciaLength = 7;
                case 0 -> System.out.println("Você saiu do Jogo. Adeus!");
                default -> System.out.println("Escolha uma opção válida.");
            }

            List<Integer> sequencia = gerarSequencia(sequenciaLength);
            exibirSequencia(sequencia);

            // Aguarde 5 segundos antes de continuar
            try {
                Thread.sleep(tempoLimite);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        System.out.println(Cores.TEXT_CYAN_BOLD_BRIGHT+"_¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶");
        System.out.println("_¶¶___________________________________¶¶");
        System.out.println("_¶¶___________________________________¶¶");
        System.out.println("__¶¶_________________________________¶¶_");
        System.out.println("__¶¶_________________________________¶¶_");
        System.out.println("___¶¶_______________________________¶¶__");
        System.out.println("___¶¶______________________________¶¶___");
        System.out.println("____¶¶¶__________________________¶¶¶____");
        System.out.println("_____¶¶¶¶_"+Cores.TEXT_YELLOW+"¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶"+Cores.TEXT_CYAN_BOLD_BRIGHT+"_¶¶¶¶_____");
        System.out.println("_______¶¶¶¶_"+Cores.TEXT_YELLOW +"¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶"+Cores.TEXT_CYAN_BOLD_BRIGHT+"_¶¶¶¶_______");
        System.out.println("_________¶¶¶¶_"+Cores.TEXT_YELLOW +"¶¶¶¶¶¶¶¶¶¶¶¶"+Cores.TEXT_CYAN_BOLD_BRIGHT+"_¶¶¶¶_________");
        System.out.println("___________¶¶¶¶¶_"+Cores.TEXT_YELLOW + "¶¶¶¶¶¶¶"+Cores.TEXT_CYAN_BOLD_BRIGHT+"_¶¶¶¶___________");
        System.out.println("______________¶¶¶¶_"+Cores.TEXT_YELLOW +"¶¶¶"+Cores.TEXT_CYAN_BOLD_BRIGHT+"_¶¶¶______________");
        System.out.println("________________¶¶¶_"+Cores.TEXT_YELLOW+"¶"+Cores.TEXT_CYAN_BOLD_BRIGHT+"_¶¶________________");
        System.out.println("_________________¶¶¶_¶¶_________________");
        System.out.println("__________________¶¶_¶¶_________________");
        System.out.println("__________________¶¶_¶__________________");
        System.out.println("__________________¶¶_¶¶_________________");
        System.out.println("________________¶¶¶_"+Cores.TEXT_YELLOW+"¶"+Cores.TEXT_CYAN_BOLD_BRIGHT+"_¶¶¶_______________");
        System.out.println("_____________¶¶¶¶¶__"+Cores.TEXT_YELLOW+"¶"+Cores.TEXT_CYAN_BOLD_BRIGHT+"__¶¶¶¶¶____________");
        System.out.println("__________¶¶¶¶¶_____"+Cores.TEXT_YELLOW+"¶"+Cores.TEXT_CYAN_BOLD_BRIGHT+"_____¶¶¶¶__________");
        System.out.println("________¶¶¶¶________"+Cores.TEXT_YELLOW+"¶"+Cores.TEXT_CYAN_BOLD_BRIGHT+"_______¶¶¶¶¶_______");
        System.out.println("_______¶¶¶__________"+Cores.TEXT_YELLOW+"¶"+Cores.TEXT_CYAN_BOLD_BRIGHT+"__________¶¶¶¶_____");
        System.out.println("_____¶¶¶____________"+Cores.TEXT_YELLOW+"¶"+Cores.TEXT_CYAN_BOLD_BRIGHT+"____________¶¶¶____");
        System.out.println("____¶¶¶_____________"+Cores.TEXT_YELLOW+"¶"+Cores.TEXT_CYAN_BOLD_BRIGHT+"______________¶¶___");
        System.out.println("___¶¶¶______________"+Cores.TEXT_YELLOW+"¶"+Cores.TEXT_CYAN_BOLD_BRIGHT+"_______________¶¶__");
        System.out.println("___¶¶_______________"+Cores.TEXT_YELLOW+"¶"+Cores.TEXT_CYAN_BOLD_BRIGHT+"________________¶¶_");
        System.out.println("__¶¶________________"+Cores.TEXT_YELLOW+"¶"+Cores.TEXT_CYAN_BOLD_BRIGHT+"________________¶¶_");
        System.out.println("__¶¶_______________"+Cores.TEXT_YELLOW+"¶¶¶"+Cores.TEXT_CYAN_BOLD_BRIGHT+"________________¶_");
        System.out.println("__¶¶_"+Cores.TEXT_YELLOW+"¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶"+Cores.TEXT_CYAN_BOLD_BRIGHT+"_¶¶");
        System.out.println("__¶¶_"+Cores.TEXT_YELLOW+"¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶"+Cores.TEXT_CYAN_BOLD_BRIGHT+"_¶¶");
        System.out.println("__¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶"+Cores.TEXT_RESET);

        System.out.println("\n\nDigite a sequência que você lembra (ex: 1 2 3): \n\n");

            List<Integer> entradaUsuario = new ArrayList<>();
            for (int i = 0; i < sequenciaLength; i++) {
                try {
                    System.out.print("Digite o " + (i + 1) + "º Número da sequencia: ");
                    int numero = scanner.nextInt();
                    entradaUsuario.add(numero);
                }catch(InputMismatchException e){
                        System.err.println("Erro: "+ e);
                        System.out.println("\nDigite apenas números, por favor!");
                        scanner.nextLine();
                }
            }

            if (entradaUsuario.equals(sequencia)) {
                System.out.println("\n\nParabéns! Você acertou a sequência.");

                System.out.println(Cores.TEXT_YELLOW
                                  +"\n\n░░░░░░░░░░░░░░░░░░░░░░█████████         ");
                System.out.println("░░███████░░░░░░░░░░███▒▒▒▒▒▒▒▒███       ");
                System.out.println("░░█▒▒▒▒▒▒█░░░░░░░███▒▒▒▒▒▒▒▒▒▒▒▒▒███    ");
                System.out.println("░░░█▒▒▒▒▒▒█░░░░██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██  ");
                System.out.println("░░░░█▒▒▒▒▒█░░░██▒▒▒▒▒██▒▒▒▒▒▒██▒▒▒▒▒███ ");
                System.out.println("░░░░░█▒▒▒█░░░█▒▒▒▒▒▒████▒▒▒▒████▒▒▒▒▒▒██");
                System.out.println("░░░█████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██");
                System.out.println("░░░█▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒██");
                System.out.println("░██▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒██▒▒▒▒▒▒▒▒▒▒██▒▒▒▒██");
                System.out.println("██▒▒▒███████████▒▒▒▒▒██▒▒▒▒▒▒▒▒██▒▒▒▒▒██");
                System.out.println("█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒████████▒▒▒▒▒▒▒██");
                System.out.println("██▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██ ");
                System.out.println("░█▒▒▒███████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██   ");
                System.out.println("░██▒▒▒▒▒▒▒▒▒▒████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█     ");
                System.out.println("░░████████████░░░█████████████████      "+ Cores.TEXT_RESET);
                System.out.println("\n\n");

            } else {
                System.out.println("\n\nVocê errou. A sequência correta era: " + sequencia);

                System.out.println(Cores.TEXT_RED_BOLD + "\n\n███████▄▄███████████▄ ");
                System.out.println("▓▓▓▓▓▓█░░░░░░░░░░░░░░█");
                System.out.println("▓▓▓▓▓▓█░░░░░░░░░░░░░░█");
                System.out.println("▓▓▓▓▓▓█░░░░░░░░░░░░░░█");
                System.out.println("▓▓▓▓▓▓█░░░░░░░░░░░░░░█");
                System.out.println("▓▓▓▓▓▓█░░░░░░░░░░░░░░█");
                System.out.println("▓▓▓▓▓▓███░░░░░░░░░░░░█");
                System.out.println("██████▀░░█░░░░██████▀ ");
                System.out.println("░░░░░░░░░█░░░░█       ");
                System.out.println("░░░░░░░░░░█░░░█       ");
                System.out.println("░░░░░░░░░░░█░░█       ");
                System.out.println("░░░░░░░░░░░█░░█       ");
                System.out.println("░░░░░░░░░░░░▀▀        " + Cores.TEXT_RESET);
                System.out.println("\n\n");

            }
        }


    }


