package jogo;

import jogo.util.Cores;
import jogo.util.Imprimir;

import java.util.*;
import java.util.stream.Collectors;


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
       Imprimir.imprimirCabecalhoForca();
    }

     @Override
     public void jogar(){
     	Scanner scanner = new Scanner(System.in);

         Forca forca = new Forca();
        String palavraSecreta = forca.getPalavraSecretaRandom();
            palavraEmbaralhada = palavraSecreta.replaceAll(".", "*");
            erros = 0;


        while (erros < 6) {
            System.out.println(palavraEmbaralhada);
            
            // Solicita uma entrada do usuário

            System.out.print(Cores.TEXT_YELLOW_BOLD_BRIGHT+"Digite uma letra: ");
            String letra = scanner.next().toLowerCase();
            
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
               Imprimir.imprimirAcerto();
                break;
            }
        }

        if (erros == 6) {
            System.out.println(Cores.TEXT_CYAN_BOLD+ "\n\nA palavra secreta era -> " + palavraSecreta);
            Imprimir.imprimirErro();
        }

    }

        // Obtém uma lista de palavras
       private List<String> palavras;
        public Forca(){

        palavras =  new ArrayList<>();
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
        palavras.add("rosa");
        palavras.add("cortina");
        palavras.add("pato");
        palavras.add("roxo");
        palavras.add("mesa");
        palavras.add("cavalo");
        palavras.add("marrom");
        palavras.add("sofa");
        palavras.add("cabra");
        palavras.add("laranja");
        palavras.add("cadeira");


    }
    public List<String> getPalavrasPorNivel(int nivel) {
        // Filtra as palavras para incluir apenas as palavras que têm o número especificado de letras.
        return palavras.stream()
                .filter(palavra -> palavra.length() == nivel)
                .collect(Collectors.toList());
    }

    public String getPalavraSecretaRandom() {
        // Gera uma palavra secreta aleatória
        int index = new Random().nextInt(palavras.size());
        return palavras.get(index);
    }

}
