package test.exercicio;

public class Rational {

    public static void main(String[] args) {
        Rational r1 = new Rational(1, 3);
        Rational r2 = new Rational(2, 3);

        subtrair(r1, r2);

        r1.imprimir();
        r1.imprimirPontoFlutuante(1);
    }

    /**
     * Utilize variáveis do tipo inteiro para representar os dados private da classe - o numerator e o denominator.
     */

    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simplificar();
    }

    public Rational() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public void multiplicar(int numerator, int denominator) {
        this.numerator *= numerator;
        this.denominator *= denominator;
        simplificar();
    }

    public void divisao(int numerator, int denominator) {
        this.numerator *= denominator;
        this.denominator *= numerator;
        simplificar();
    }

    public void somar(int numerator, int denominator) {
        this.numerator = (this.denominator * numerator) + (this.numerator * denominator);
        this.denominator = this.denominator * denominator;
        simplificar();
    }

    public void subtrair(int numerator, int denominator) {
        this.numerator = (denominator * this.numerator) - (this.denominator * numerator);
        this.denominator = this.denominator * denominator;
        simplificar();
    }

    public void imprimir() {
        System.out.printf("%d/%d\n", this.numerator, this.denominator);
    }

    public void imprimirPontoFlutuante(int digitos) {
        System.out.printf("%." + digitos + "f", (this.numerator / (float) this.denominator));
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void simplificar() {
        int mmc = mmc(numerator, denominator);

        while (mmc != 1) {
            numerator /= mmc;
            denominator /= mmc;
            mmc = mmc(numerator, denominator);
        }
    }

    public static void somar(Rational a, Rational b) {
        a.somar(b.getNumerator(), b.getDenominator());
    }

    public static void subtrair(Rational a, Rational b) {
        a.subtrair(b.getNumerator(), b.getDenominator());
    }

    public static int mmc(int a, int b) {
        for (int i = 2; i <= Math.min(Math.abs(a), Math.abs(b)); i++) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }

        return 1;
    }
}
