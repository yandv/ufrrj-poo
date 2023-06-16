package test.prova_1_2022.questao_4;

public class Calculadora {

    private int resultadoInteiro;
    private double resultadoReal;

    public void soma(int numero) {
        this.resultadoInteiro += numero;
    }

    public void soma(int n1, int n2) {
        this.resultadoInteiro += n1 + n2;
    }

    public void soma(double numero) {
        this.resultadoReal += numero;
    }

    public void soma(double n1, double n2) {
        this.resultadoReal += n1 + n2;
    }

    public void subtrair(int numero) {
        this.resultadoInteiro -= numero;
    }

    public void subtrair(int n1, int n2) {
        this.resultadoInteiro = n1 - n2;
    }

    public void subtrair(double numero) {
        this.resultadoReal -= numero;
    }

    public void subtrair(double n1, double n2) {
        this.resultadoReal = n1 - n2;
    }

    public void multiplicar(int numero) {
        this.resultadoInteiro *= numero;
    }

    public void multiplicar(int n1, int n2) {
        this.resultadoInteiro = n1 * n2;
    }

    public void multiplicar(double numero) {
        this.resultadoReal *= numero;
    }

    public void multiplicar(double n1, double n2) {
        this.resultadoReal = n1 * n2;
    }

    public void dividir(int numero) {
        this.resultadoInteiro /= numero;
    }

    public void dividir(int n1, int n2) {
        this.resultadoInteiro = n1 / n2;
    }

    public void dividir(double numero) {
        this.resultadoReal /= numero;
    }

    public void dividir(double n1, double n2) {
        this.resultadoReal = n1 / n2;
    }

    public void limparCalculadora() {
        this.resultadoReal = 0;
        this.resultadoInteiro = 0;
    }


}
