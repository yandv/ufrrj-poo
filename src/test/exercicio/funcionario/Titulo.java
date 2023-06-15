package test.exercicio.funcionario;

public enum Titulo {

    TECNICO(0.01f), GRADUADO(0.1f), MESTRADO(0.1f), DOUTORADO(0.2f);

    private float multiplicador;

    Titulo(float multiplicador) {
        this.multiplicador = multiplicador;
    }

    public float getMultiplicador() {
        return multiplicador;
    }
}
