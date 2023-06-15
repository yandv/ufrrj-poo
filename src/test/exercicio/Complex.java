package test.exercicio;

public class Complex {

    private float real;
    private float imaginary;

    public Complex() {
        this.real = 0.0f;
        this.imaginary = 0.0f;
    }

    public Complex(float real, float imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    /**
     * Somar dois     public Complex(float real, float imaginary) {
     *         this.real = real;
     *         this.imaginary = imaginary;
     *     }números Complex: as partes reais são somadas de um lado e as partes
     * imaginárias são somadas de outro.
     *
     */

    public void somar(float real, float imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    /**
     * Subtrair dois números Complex: a parte real do operando direito ´e subtra´ıda
     * da parte real do operando esquerdo, e a parte imagin´aria do operando direito ´e
     * subtraída da parte imagin´aria do operando esquerdo
     *
     */

    public void subtrair(float real, float imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    /**
     * Imprimir os números Complex na forma (a, b), onde a é a parte real e b, a parte
     * imaginária.
     */

    public void imprimir() {
        System.out.println("(" + this.real + ", " + this.imaginary + ")");
    }

    public float getReal() {
        return real;
    }

    public float getImaginary() {
        return imaginary;
    }

    public static void somar(Complex a, Complex b) {
        a.somar(b.getReal(), b.getImaginary());
    }

    public static void subtrair(Complex a, Complex b) {
        a.subtrair(b.getReal(), b.getImaginary());
    }


}
