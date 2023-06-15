package test.cara;

import test.exercicio.Complex;

public class Main {

    public static void main(String[] args) {
        Complex complex = new Complex(1.0f, 2.0f);

        Complex.somar(complex, complex);
    }

}
