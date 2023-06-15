package test.exercicio.tecnico.funcionario.tipos;

import test.exercicio.tecnico.funcionario.Funcionario;
import test.exercicio.tecnico.funcionario.Posicao;

public class Jogador extends Funcionario {

    private Posicao posicao;

    private int gols;
    private int passes;
    private int passesCorretos;
    private int bolasRoubadas;

    private double precoPasse;

    public Jogador(String nome, int idade, String cpf, double salario, Posicao posicao, long dataContratacao) {
        super(nome, idade, cpf, salario, dataContratacao);
        this.posicao = posicao;
    }

    public Posicao getPosicao() {
        return posicao;
    }

    @Override
    public double getBonus() {
        return (0.1D * getSalario()) * Math.floor((gols + (passesCorretos / 20.0D) + (bolasRoubadas / 10.0D)));
    }
}
