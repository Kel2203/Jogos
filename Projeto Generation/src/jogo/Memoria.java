package jogo;


import jogo.util.Cores;
import jogo.util.Imprimir;

import java.util.*;

public class Memoria extends Jogo {

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

    @Override
    public void nome() {
        System.out.println("Jogo da Memória");
    }

    @Override
    public void cabecalho() {

        Imprimir.imprimirCabecalhoMemoria();
    }

    @Override
    public void jogar() {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;

        try {
            System.out.print("Escolha: ");
            escolha = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Erro: " + e);
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

        Imprimir.time();

        List<Integer> entradaUsuario = new ArrayList<>();
        for (int i = 0; i < sequenciaLength; i++) {
            try {
                System.out.print("Digite o " + (i + 1) + "º Número da sequencia: ");
                int numero = scanner.nextInt();
                entradaUsuario.add(numero);
            } catch (InputMismatchException e) {
                System.err.println("Erro: " + e);
                System.out.println("\nDigite apenas números, por favor!");
                scanner.nextLine();
            }
        }

        if (entradaUsuario.equals(sequencia)) {
            System.out.println("\n\nParabéns! Você acertou a sequência.");
            Imprimir.imprimirAcerto();
        } else {
            System.out.println("\n\nVocê errou. A sequência correta era: " + sequencia);

            Imprimir.imprimirErro();
        }
    }
}


