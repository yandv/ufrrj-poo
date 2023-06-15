package test.exercicio.funcionario.tipos;

import test.exercicio.funcionario.Funcionario;
import test.exercicio.funcionario.Titulo;

public final class Contador extends Funcionario {

    public Contador(int tempoServico, Titulo titulo, int salarioAtual) {
        super(tempoServico, titulo, salarioAtual);
    }

    public double calculaBonus(Funcionario funcionario) {
        return Funcionario.bonusPorTitulo(funcionario) + Funcionario.bonusPorTempoServico(funcionario);
    }

}
