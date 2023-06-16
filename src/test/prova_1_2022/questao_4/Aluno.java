package test.prova_1_2022.questao_4;

public class Aluno {

    private String nome;
    private char sexo;
    private int idade;

    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    private double mediaFinal;

    private boolean aprovado;

    public Aluno(String nome, char sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public void setMediaFinal(double mediaFinal) {
        this.mediaFinal = mediaFinal;

        if (this.mediaFinal > 6)
            this.aprovado = true;
    }

    public String getNome() {
        return nome;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void responderChamada() {
        System.out.println("O Aluno " + nome + " está presente.");
    }

    public void relatorios() {
        System.out.println(nome + ": \nnota1:" + nota1 + " \nnota2:" + nota2 + " \nnota3:" + nota3 + " \nnota4:" + nota4 + " \nmedia final:" + mediaFinal);
    }

}
