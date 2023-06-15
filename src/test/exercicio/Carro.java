package test.exercicio;

public class Carro {

    private String marca;
    private int velocidadeMaxima;
    private int rodas;

    public Carro(String marca, int velocidadeMaxima, int rodas) {
        this.marca = marca;
        this.velocidadeMaxima = velocidadeMaxima;
        this.rodas = rodas;
    }

    public Carro(String marca, int velocidadeMaxima) {
        this(marca, velocidadeMaxima, 20);
    }

    public static void main(String[] args) {
        Carro carro = new Carro("Ford", 540);
    }

}
