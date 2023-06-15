package test.exercicio.tecnico.funcionario;

public abstract class Funcionario {

    private String nome;

    private int idade;
    private String cpf;
    private double salario;

    private long dataContratacao;

    public Funcionario(String nome, int idade, String cpf, double salario, long dataContratacao) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.salario = salario;
        this.dataContratacao = dataContratacao;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }

    public long getDataContratacao() {
        return dataContratacao;
    }

    public double getBonus() {
        return 0;
    }
}
