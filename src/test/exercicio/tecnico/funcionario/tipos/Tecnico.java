package test.exercicio.tecnico.funcionario.tipos;

import test.exercicio.funcionario.Titulo;
import test.exercicio.tecnico.funcionario.Funcionario;

public class Tecnico extends Funcionario {

    private int partidasGanhas;
    private int partidasPertidas;

    public Tecnico(String nome, int idade, String cpf, double salario, long dataContratacao) {
        super(nome, idade, cpf, salario, dataContratacao);
    }


    public int getPartidasGanhas() {
        return partidasGanhas;
    }

    public int getPartidasPertidas() {
        return partidasPertidas;
    }

    @Override
    public double getBonus() {
        return (0.5D * getSalario()) * getPartidasGanhas();
    }
}
