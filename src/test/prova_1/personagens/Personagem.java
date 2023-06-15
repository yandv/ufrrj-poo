package test.prova_1.personagens;

import java.util.ArrayList;
import java.util.List;

public abstract class Personagem {

    private final String nome;

    private int pontuacao;

    private int forca;
    private int inteligencia;

    private int vida;

    private Sexo sexo;

    private List<Item> listaDeItens;

    public Personagem(String nome, Sexo sexo) {
        this.nome = nome;

        this.pontuacao = 0;

        this.forca = sexo.getForcaInicial();
        this.inteligencia = sexo.getInteligenciaInicial();

        this.vida = 100;

        this.sexo = sexo;
        this.listaDeItens = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.listaDeItens.add(item);
    }

    public void removeItem(Item item) {
        this.listaDeItens.remove(item);
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getForca() {
        return forca;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVida() {
        return vida;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public String getNome() {
        return nome;
    }

    public abstract int habilidadeEspecial();
}
