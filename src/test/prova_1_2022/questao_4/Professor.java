package test.prova_1_2022.questao_4;

public class Professor {

    private Turma turma;
    private Calculadora calculadora;

    public Professor(Turma turma) {
        this.turma = turma;
        this.calculadora = new Calculadora();
    }

    public double calcularMediaBimestre1(int indiceAluno) {
        if (turma.getAlunos().length >= indiceAluno) {
            return -1;
        }

        Aluno aluno = turma.getAlunos()[indiceAluno];

        return (aluno.getNota1() + aluno.getNota2()) / 2;
    }

    public double calcularMediaBimestre2(int indiceAluno) {
        if (turma.getAlunos().length >= indiceAluno) {
            return -1;
        }

        Aluno aluno = turma.getAlunos()[indiceAluno];

        return (aluno.getNota3() + aluno.getNota4()) / 2;
    }

    public double calcularMediaFinal(int indiceAluno) {
        if (turma.getAlunos().length >= indiceAluno) {
            return -1;
        }

        Aluno aluno = turma.getAlunos()[indiceAluno];

        double mediaFinal = (aluno.getNota1() +  aluno.getNota2() + aluno.getNota3() + aluno.getNota4()) / 4;
        aluno.setMediaFinal(mediaFinal);
        return mediaFinal;
    }


}
