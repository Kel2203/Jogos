package jogo;



import java.util.*;
import java.util.concurrent.TimeUnit;
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
    private static void limparTela() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    @Override
    public void nome(){
        System.out.println("Jogo da Memória");
    }
    @Override
    public void cabecalho(){
        System.out.println("\n\n");
        System.out.println("_______________________¶¶¶¶___¶¶¶¶¶               "                      );
        System.out.println("_____________________¶¶____¶¶¶____¶¶__¶¶¶         "                      );
        System.out.println("___________________¶¶___¶¶¶____¶¶¶¶¶¶¶___¶¶       "                      );
        System.out.println("_________________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶"                      );
        System.out.println("______________¶¶¶¶¶__¶__________________________¶¶"                      );
        System.out.println("___________¶¶¶¶__¶¶__¶___________________________¶"                      );
        System.out.println("_________¶¶¶_¶¶__¶__¶¶¶__________________________¶"                      );
        System.out.println("______¶¶¶_¶¶_¶¶¶_¶_¶¶_¶¶_________¶_______________¶"                      );
        System.out.println("_____¶_¶¶__¶_¶_¶¶¶¶_¶¶¶__________¶¶______________¶"                      );
        System.out.println("___¶¶¶_¶¶¶¶¶_¶¶¶¶¶¶_¶¶¶_________¶¶¶______________¶"                      );
        System.out.println("_¶¶__¶¶¶¶¶¶¶¶_¶¶_¶¶____________¶¶¶¶¶_____________¶"                      );
        System.out.println("¶_¶¶__¶__¶¶¶¶____¶¶___________¶¶¶¶¶¶¶____________¶"                      );
        System.out.println("¶__¶¶¶¶¶¶¶¶¶¶____¶¶__________¶¶¶¶¶¶¶¶¶¶__________¶"                      );
        System.out.println("_¶¶¶_¶_¶¶___¶¶___¶¶________¶¶¶¶¶¶¶¶¶¶¶¶¶_________¶"                      );
        System.out.println("__¶¶_¶¶_¶___¶¶___¶¶______¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_______¶"                      );
        System.out.println("___¶¶____¶___¶___¶¶____¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_____¶    SEJA BEM VINDE AO ");
        System.out.println("____¶¶___¶¶__¶¶__¶¶___¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶___¶     JOGO DA MEMÓRIA! ");
        System.out.println("_____¶¶___¶__¶¶__¶¶__¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶__¶                      ");
        System.out.println("______¶¶___¶__¶__¶¶_¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_¶                      ");
        System.out.println("_______¶¶__¶¶_¶__¶¶_¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_¶                      ");
        System.out.println("________¶¶__¶_¶¶_¶¶__¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_¶                      ");
        System.out.println("_________¶¶__¶_¶_¶¶__¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶__¶                      ");
        System.out.println("__________¶¶_¶¶¶_¶¶___¶¶¶¶¶¶¶¶¶__¶¶__¶¶¶¶¶¶¶¶¶___¶                      ");
        System.out.println("____________¶_¶¶_¶¶_____¶¶¶¶¶____¶¶____¶¶¶¶¶_____¶                      ");
        System.out.println("_____________¶_¶¶¶¶___________¶¶¶¶¶¶¶¶___________¶                      ");
        System.out.println("______________¶¶¶¶¶__________¶¶¶¶¶¶¶¶¶¶______¶¶__¶                      ");
        System.out.println("_______________¶¶¶____________¶¶¶¶¶¶¶¶_______¶¶¶_¶                      ");
        System.out.println("________________¶¶__________________________¶¶_¶_¶                      ");
        System.out.println("_________________¶¶__________________________¶¶__¶                      ");
        System.out.println("_________________¶¶__________________________¶¶¶_¶                      ");
        System.out.println("__________________¶¶__¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶                      ");
        System.out.println("__________________¶¶¶¶¶¶¶¶¶¶¶¶                                          ");
        System.out.println("_____________________¶¶¶¶¶¶                                             ");
        System.out.println("\n\n");
        System.out.println("╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳╳");
        System.out.println("Você terá 5 segundos para memorizar uma sequência de números.");
    }

    @Override
    public void jogar() {
        Scanner scanner = new Scanner(System.in);

            int escolha = scanner.nextInt();
            int sequenciaLength = 0;
            int tempoLimite = 5000; //
            switch (escolha) {
                case 1 -> sequenciaLength = 3;
                case 2 -> sequenciaLength = 5;
                case 3 -> sequenciaLength = 7;
                case 0 -> System.out.println("Você escolheu sair do Jogo. Adeus!");
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

            limparTela();
        System.out.println("_¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶");
        System.out.println("_¶¶___________________________________¶¶");
        System.out.println("_¶¶___________________________________¶¶");
        System.out.println("__¶¶_________________________________¶¶_");
        System.out.println("__¶¶_________________________________¶¶_");
        System.out.println("___¶¶_______________________________¶¶__");
        System.out.println("___¶¶______________________________¶¶___");
        System.out.println("____¶¶¶__________________________¶¶¶____");
        System.out.println("_____¶¶¶¶_¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_¶¶¶¶_____");
        System.out.println("_______¶¶¶¶_¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_¶¶¶¶_______");
        System.out.println("_________¶¶¶¶_¶¶¶¶¶¶¶¶¶¶¶¶_¶¶¶¶_________");
        System.out.println("___________¶¶¶¶¶_¶¶¶¶¶¶¶_¶¶¶¶___________");
        System.out.println("______________¶¶¶¶_¶¶¶_¶¶¶______________");
        System.out.println("________________¶¶¶_¶_¶¶________________");
        System.out.println("_________________¶¶¶_¶¶_________________");
        System.out.println("__________________¶¶_¶¶_________________");
        System.out.println("__________________¶¶_¶__________________");
        System.out.println("__________________¶¶_¶¶_________________");
        System.out.println("________________¶¶¶_¶_¶¶¶_______________");
        System.out.println("_____________¶¶¶¶¶__¶__¶¶¶¶¶____________");
        System.out.println("__________¶¶¶¶¶_____¶_____¶¶¶¶__________");
        System.out.println("________¶¶¶¶________¶_______¶¶¶¶¶_______");
        System.out.println("_______¶¶¶__________¶__________¶¶¶¶_____");
        System.out.println("_____¶¶¶____________¶____________¶¶¶____");
        System.out.println("____¶¶¶_____________¶______________¶¶___");
        System.out.println("___¶¶¶______________¶_______________¶¶__");
        System.out.println("___¶¶_______________¶________________¶¶_");
        System.out.println("__¶¶________________¶________________¶¶_");
        System.out.println("__¶¶_______________¶¶¶________________¶_");
        System.out.println("__¶¶_¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_¶¶");
        System.out.println("__¶¶_¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_¶¶");
        System.out.println("__¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶");

        System.out.println("Digite a sequência que você lembra (ex: 1 2 3): \n\n");

            List<Integer> entradaUsuario = new ArrayList<>();
            for (int i = 0; i < sequenciaLength; i++) {
                System.out.print("Digite o " + (i + 1)+ "º Número da sequencia: ");
                int numero = scanner.nextInt();
                entradaUsuario.add(numero);
            }

            if (entradaUsuario.equals(sequencia)) {
                System.out.println("Parabéns! Você acertou a sequência.");
                System.out.println("░░░░░░░░░░░░░░░░░░░░░░█████████         ");
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
                System.out.println("░░████████████░░░█████████████████      ");
                System.out.println("\n\n");

            } else {
                System.out.println("Você errou. A sequência correta era: " + sequencia);

                System.out.println("███████▄▄███████████▄ ");
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
                System.out.println("░░░░░░░░░░░░▀▀        ");
                    System.out.println("\n\n");

            }
        }


    }


