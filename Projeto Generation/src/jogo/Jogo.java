package jogo;

public abstract class Jogo {
    public void nome(){}
    public void nivel(){
        System.out.println("========================================================");
        System.out.println("Escolha o nível de dificuldade:");
        System.out.println("1. Fácil");
        System.out.println("2. Médio");
        System.out.println("3. Difícil");
        System.out.println("0. Sair");
        System.out.println("========================================================");
    }
    public void cabecalho(){}

    public void jogar(){

    }
}
