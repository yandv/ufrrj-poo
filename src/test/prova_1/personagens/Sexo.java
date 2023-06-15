package test.prova_1.personagens;

public enum Sexo {

    MASCULINO(10, 5), FEMININO(5, 10);

    private int forcaInicial;
    private int inteligenciaInicial;

    Sexo(int forcaInicial, int inteligenciaInicial) {
        this.forcaInicial = forcaInicial;
        this.inteligenciaInicial = inteligenciaInicial;
    }

    public int getForcaInicial() {
        return forcaInicial;
    }

    public int getInteligenciaInicial() {
        return inteligenciaInicial;
    }

}
