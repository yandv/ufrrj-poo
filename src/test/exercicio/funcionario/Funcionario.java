package test.exercicio.funcionario;


/**
 * https://www.dcc.ufrrj.br/moodle/pluginfile.php/17037/mod_resource/content/1/P16%20-%20Modificador%20final.pdf
 * EXERCICIO #3
 */

public class Funcionario {

    private int tempoServico;
    private Titulo titulo;
    private double salarioAtual;

    public Funcionario(int tempoServico, Titulo titulo, double salarioAtual) {
        this.tempoServico = tempoServico;
        this.titulo = titulo;
        this.salarioAtual = salarioAtual;
    }

    public double getSalarioAtual() {
        return salarioAtual;
    }

    public Titulo getTitulo() {
        return titulo;
    }

    public int getTempoServico() {
        return tempoServico;
    }

    public static double bonusPorTitulo(Funcionario funcionario) {
        return funcionario.getSalarioAtual() * funcionario.getTitulo().getMultiplicador();
    }

    public static double bonusPorTempoServico(Funcionario funcionario) {
        return funcionario.getSalarioAtual() * (0.0001D * funcionario.getTempoServico());
    }

}
