package test.exercicio.tecnico;

public class Jogo {

    private long inicio;

    private Time mandante;
    private Time visitante;

    private int mandateGols;
    private int visitanteGols;

    public Jogo(long inicio, Time mandate, Time visitante, int mandateGols, int visitanteGols) {
        this.inicio = inicio;
        this.mandante = mandate;
        this.visitante = visitante;
        this.mandateGols = mandateGols;
        this.visitanteGols = visitanteGols;
    }

    public long getInicio() {
        return inicio;
    }

    public int getMandateGols() {
        return mandateGols;
    }

    public Time getMandante() {
        return mandante;
    }

    public int getVisitanteGols() {
        return visitanteGols;
    }

    public Time getVisitante() {
        return visitante;
    }
}
