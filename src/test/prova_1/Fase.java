package test.prova_1;

public class Fase {

    private static int numeroDePersonagens;

    private final String nome;

    public Fase(String nome, int numeroDePersonagens) {
        this.nome = nome;

        if (numeroDePersonagens >= 1) {
            Fase.numeroDePersonagens = numeroDePersonagens;
        }
    }

    public int getDificuldade() {
        int dificuldade = 1 + numeroDePersonagens;

        if (dificuldade > 5) {
            dificuldade = 5;
        } else if (dificuldade < 1) {
            dificuldade = 1;
        }

        return dificuldade;
    }
}
