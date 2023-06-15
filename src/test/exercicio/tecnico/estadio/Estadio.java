package test.exercicio.tecnico.estadio;

public class Estadio {

    private String localizacao;
    private int capacidadeMaxima;
    private double taxaEntrada;

    public Estadio(String localizacao, int capacidadeMaxima, double taxaEntrada) {
        this.localizacao = localizacao;
        this.capacidadeMaxima = capacidadeMaxima;
        this.taxaEntrada = taxaEntrada;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public double getTaxaEntrada() {
        return taxaEntrada;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }
}
